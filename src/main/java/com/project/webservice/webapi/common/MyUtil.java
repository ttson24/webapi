package com.project.webservice.webapi.common;

import java.io.File;
import java.io.FileReader;
import java.util.List;
import org.springframework.util.ResourceUtils;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class MyUtil {
    public MyUtil(){}
    
    public List<String[]> readAllLines(String filePath) throws Exception {
        List<String[]> allData = null;
    try {
            File file = ResourceUtils.getFile(filePath);
            FileReader filereader = new FileReader(file); 
            CSVReader csvReader = new CSVReaderBuilder(filereader) 
                                      .withSkipLines(0) 
                                      .build(); 
            allData = csvReader.readAll(); 
        } 
        catch (Exception e) { 
            e.printStackTrace(); 
        }
    return allData; 
    }
}
