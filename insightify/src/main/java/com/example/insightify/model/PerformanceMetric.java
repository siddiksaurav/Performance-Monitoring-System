package com.example.insightify.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {"project_id", "employee_id"})
})
public class PerformanceMetric implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Project project;

    @ManyToOne
    private Employee employee;

    private int punctuality;

    private int communication;

    private int qualityOfWork;

    private int overallRating;

    private String comments;

    private LocalDate date;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Project getProject()
    {
        return project;
    }

    public void setProject(Project project)
    {
        this.project = project;
    }

    public Employee getEmployee()
    {
        return employee;
    }

    public void setEmployee(Employee employee)
    {
        this.employee = employee;
    }

    public int getPunctuality()
    {
        return punctuality;
    }

    public void setPunctuality(int punctuality)
    {
        this.punctuality = punctuality;
    }

    public int getCommunication()
    {
        return communication;
    }

    public void setCommunication(int communication)
    {
        this.communication = communication;
    }

    public int getQualityOfWork()
    {
        return qualityOfWork;
    }

    public void setQualityOfWork(int qualityOfWork)
    {
        this.qualityOfWork = qualityOfWork;
    }

    public int getOverallRating()
    {
        return overallRating;
    }

    public void setOverallRating(int overallRating)
    {
        this.overallRating = overallRating;
    }

    public String getComments()
    {
        return comments;
    }

    public void setComments(String comments)
    {
        this.comments = comments;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public void setDate(LocalDate date)
    {
        this.date = date;
    }

    @Override
    public String toString()
    {
        return "PerformanceMetric{" +
               "id=" + id +
               ", project=" + project +
               ", employee=" + employee +
               ", punctuality=" + punctuality +
               ", communication=" + communication +
               ", qualityOfWork=" + qualityOfWork +
               ", overallRating=" + overallRating +
               ", comments='" + comments + '\'' +
               ", date=" + date +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PerformanceMetric that = (PerformanceMetric) o;

        if (punctuality != that.punctuality) return false;
        if (communication != that.communication) return false;
        if (qualityOfWork != that.qualityOfWork) return false;
        if (overallRating != that.overallRating) return false;
        if (!id.equals(that.id)) return false;
        if (!project.equals(that.project)) return false;
        if (!employee.equals(that.employee)) return false;
        if (!comments.equals(that.comments)) return false;
        return date.equals(that.date);
    }

    @Override
    public int hashCode()
    {
        int result = id.hashCode();
        result = 31 * result + project.hashCode();
        result = 31 * result + employee.hashCode();
        result = 31 * result + punctuality;
        result = 31 * result + communication;
        result = 31 * result + qualityOfWork;
        result = 31 * result + overallRating;
        result = 31 * result + comments.hashCode();
        result = 31 * result + date.hashCode();
        return result;
    }
}
