package com.moviedigest.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.moviedigest.service.MovieService;
import com.moviedigest.service.SearchDirectoriesService;
import com.moviedigest.service.impl.MovieServiceImpl;
import com.moviedigest.service.impl.SearchDirectoriesServiceImpl;

public class Main
{

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("app-context.xml");

    public void MovieFunctions()
    {
        MovieService movie = applicationContext.getBean("movie", MovieServiceImpl.class);
        System.out.println(movie.getMovieByName("Inception"));
    }

    public void SearchFunctions()
    {
        SearchDirectoriesService searchService = applicationContext.getBean("search", SearchDirectoriesServiceImpl.class);
        List<String> files = searchService.getFilenames("/home/makarandh/Documents");
        for (String file : files)
        {
            System.out.println(file);
        }
    }
}
