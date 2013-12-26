package com.moviedigest.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Movie")
public class Movie
{

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "path")
    private String path;

    @OneToOne
    @JoinColumn(name = "ref_additionalInfo")
    private AdditionalInfo additional_Info;

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
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

    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }

    public AdditionalInfo getAdditional_Info()
    {
        return additional_Info;
    }

    public void setAdditional_Info(AdditionalInfo additional_Info)
    {
        this.additional_Info = additional_Info;
    }

    @Override
    public String toString()
    {
        return "Movie [id=" + id + ", name=" + name + ", path=" + path + ", additional_Info=" + additional_Info + "]";
    }

}
