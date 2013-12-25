package com.moviedigest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moviedigest.persistence.dao.MovieDAO;
import com.moviedigest.persistence.entity.Movie;
import com.moviedigest.service.MovieService;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieDAO movieDAO;

	public Movie getMovieByName(String movieName) {
		return movieDAO.findByName(movieName);
	}

}
