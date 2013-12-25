package com.moviedigest.service;

import com.moviedigest.persistence.entity.Movie;

public interface MovieService
{

    public Movie getMovieByName(String movieName);

}
