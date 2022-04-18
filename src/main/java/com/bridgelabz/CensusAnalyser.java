package com.bridgelabz;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Purpose : To implement Indian State Census Analyser
 *
 * @author Rohit Bansod
 * @version 11.0.11
 * @since 2021-09-29
 */
public class CensusAnalyser {
    public static void main(String[] args) throws IOException, StateSensorAnalyserException {
        System.out.println("Welcome To The Program");
        String filePathRead = "C:\\Users\\Rohit\\IdeaProjects\\indian-state-census-analyser\\src\\main\\resources\\statewise-census-data-in-india-1901-2011";
        String fileName = "stateWise-census-data-in-india-1901-2011";
        String delimiter =",";
        List<String> stringName = new ArrayList<>();
        stringName.add("State");
        stringName.add("Population");
        stringName.add("AreaInSqKm");
        stringName.add("DensityPerSqKm");

        ReadOperations readObj = new ReadOperations();
        int count = readObj.readDataCount(filePathRead, fileName);
        System.out.println(count);

        readObj.readDelimiter(filePathRead, delimiter);
        readObj.readHeader(filePathRead, stringName);
    }
}
