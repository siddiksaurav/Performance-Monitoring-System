package com.example.insightify.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
public class Project implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    private int estimatedDuration;

    @ManyToOne
    private Employee projectManager;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }

    public LocalDate getEndDate()
    {
        return endDate;
    }

    public void setEndDate(LocalDate endDate)
    {
        this.endDate = endDate;
    }

    public int getEstimatedDuration()
    {
        return estimatedDuration;
    }

    public void setEstimatedDuration(int estimatedDuration)
    {
        this.estimatedDuration = estimatedDuration;
    }

    public Employee getProjectManager()
    {
        return projectManager;
    }

    public void setProjectManager(Employee projectManager)
    {
        this.projectManager = projectManager;
    }

    @Override
    public String toString()
    {
        return "Project{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", description='" + description + '\'' +
               ", startDate=" + startDate +
               ", endDate=" + endDate +
               ", estimatedDuration=" + estimatedDuration +
               ", projectManager=" + projectManager +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        if (estimatedDuration != project.estimatedDuration) return false;
        if (!id.equals(project.id)) return false;
        if (!name.equals(project.name)) return false;
        if (!description.equals(project.description)) return false;
        if (!startDate.equals(project.startDate)) return false;
        if (!endDate.equals(project.endDate)) return false;
        return projectManager.equals(project.projectManager);
    }

    @Override
    public int hashCode()
    {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + startDate.hashCode();
        result = 31 * result + endDate.hashCode();
        result = 31 * result + estimatedDuration;
        result = 31 * result + projectManager.hashCode();
        return result;
    }
}
