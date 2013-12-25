package com.moviedigest.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moviedigest.persistence.entity.Movie;

@Repository
public interface MovieDAO extends JpaRepository<Movie, Integer> {
	
	public Movie findByName(String name);
}
