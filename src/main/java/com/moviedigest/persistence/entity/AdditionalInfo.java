package com.moviedigest.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Additional_Info")
public class AdditionalInfo
{
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "director")
    private String director;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "AdditionalInfo [id=" + id + ", director=" + director + ", year=" + year + ", genre=" + genre + "]";
    }

}
