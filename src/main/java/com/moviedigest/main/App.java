package com.moviedigest.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moviedigest.service.MovieService;
import com.moviedigest.service.impl.MovieServiceImpl;
import com.moviedigest.service.impl.SearchDirectoriesServiceImpl;


public class App {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"app-context.xml");
		MovieService movie = applicationContext.getBean("movie", MovieServiceImpl.class);
		System.out.println(movie.getMovieByName("Inception"));
		SearchDirectoriesServiceImpl search = new SearchDirectoriesServiceImpl();
		System.out.println( search.getFilenames("/home/makarandh/Documents"));
	}

}
