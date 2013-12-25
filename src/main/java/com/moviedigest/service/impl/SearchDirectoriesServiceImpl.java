package com.moviedigest.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.moviedigest.service.SearchDirectoriesService;

public class SearchDirectoriesServiceImpl implements SearchDirectoriesService
{
    private List<String> fileNames = new ArrayList<String>();

    public List<String> getFilenames(String directoryPath)
    {
        File originalDirectory = new File(directoryPath);
        obtainFileNames(originalDirectory);
        return fileNames;
    }

    private List<String> obtainFileNames(File originalDirectory)
    {
        List<File> filesAndFolders = Arrays.asList(originalDirectory.listFiles());
        for (File file : filesAndFolders)
        {
            if (fileIsDirectory(file))
            {
                obtainFileNames(file);
            }
            else
            {
                fileNames.add(file.getName());
            }
        }
        return fileNames;
    }

    private boolean fileIsDirectory(File file)
    {
        if (file.isDirectory())
            return true;
        return false;
    }

}
