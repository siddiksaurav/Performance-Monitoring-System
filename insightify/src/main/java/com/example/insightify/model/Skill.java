package com.example.insightify.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Embeddable
public class Skill
{

    private String name;

    @Enumerated(EnumType.STRING)
    private Proficiency proficiency;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Proficiency getProficiency()
    {
        return proficiency;
    }

    public void setProficiency(Proficiency proficiency)
    {
        this.proficiency = proficiency;
    }

    @Override
    public String toString()
    {
        return "Skill{" +
               ", name='" + name + '\'' +
               ", proficiency=" + proficiency +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Skill skill = (Skill) o;

        if (!name.equals(skill.name)) return false;
        return proficiency == skill.proficiency;
    }

    @Override
    public int hashCode()
    {
        int result = 31;
        result = 31 * result + name.hashCode();
        result = 31 * result + proficiency.hashCode();
        return result;
    }
}
