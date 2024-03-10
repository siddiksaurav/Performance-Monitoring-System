package com.example.insightify.model;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;

@Embeddable
public class Certification
{
    private String name;

    private LocalDate achievedDate;

    private LocalDate expiredDate;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getAchievedDate()
    {
        return achievedDate;
    }

    public void setAchievedDate(LocalDate achievedDate)
    {
        this.achievedDate = achievedDate;
    }

    public LocalDate getExpiredDate()
    {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate)
    {
        this.expiredDate = expiredDate;
    }

    @Override
    public String toString()
    {
        return "Certification{" +
               "name='" + name + '\'' +
               ", achievedDate=" + achievedDate +
               ", expiredDate=" + expiredDate +
               '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Certification that = (Certification) o;

        if (!name.equals(that.name)) return false;
        if (!achievedDate.equals(that.achievedDate)) return false;
        return expiredDate.equals(that.expiredDate);
    }

    @Override
    public int hashCode()
    {
        int result = name.hashCode();
        result = 31 * result + achievedDate.hashCode();
        result = 31 * result + expiredDate.hashCode();
        return result;
    }
}
