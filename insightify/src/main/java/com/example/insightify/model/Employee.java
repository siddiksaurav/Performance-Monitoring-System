package com.example.insightify.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class Employee implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ElementCollection
    private List<Skill> skills;

    @ElementCollection
    private List<Certification> certifications;

    // Getters and setters


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


    public List<Skill> getSkills()
    {
        return skills;
    }

    public void setSkills(List<Skill> skills)
    {
        this.skills = skills;
    }

    public List<Certification> getCertifications()
    {
        return certifications;
    }

    public void setCertifications(List<Certification> certifications)
    {
        this.certifications = certifications;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", skills=" + skills +
               ", certifications='" + certifications + '\'' +
               '}';
    }


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!id.equals(employee.id)) return false;
        if (!name.equals(employee.name)) return false;
        if (!skills.equals(employee.skills)) return false;
        return certifications.equals(employee.certifications);
    }

    @Override
    public int hashCode()
    {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + skills.hashCode();
        result = 31 * result + certifications.hashCode();
        return result;
    }
}
