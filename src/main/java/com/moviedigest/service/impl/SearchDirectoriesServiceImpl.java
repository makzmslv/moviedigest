package com.moviedigest.service.impl;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import com.moviedigest.service.SearchDirectoriesService;

public class SearchDirectoriesServiceImpl implements SearchDirectoriesService {

	public List<String> getFilenames(String directoryPath) {
		File directory = new File(directoryPath);
		List<String> files = Arrays.asList(directory.list());
		return files;
	}

}
