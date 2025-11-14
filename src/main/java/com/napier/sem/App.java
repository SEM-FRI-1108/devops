package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
        // Create new Database Connector
        // For DEBUG mode, connect to localhost for faster database access
        boolean debug;
        if (args.length == 0) {
            debug = false;
        } else {
            debug = args[0].equalsIgnoreCase("debug");
        }
        DatabaseConnector dbC = new DatabaseConnector(debug);

        // Connect to database
        Connection con = dbC.connect();

        //find and display information about a country
        CountryReport rep1 = new CountryReport(con);
        rep1.getCountryFromCode("FRA");
        rep1.displayReport();

        //list countries by pop in a given continent
        CountryReport rep2 = new CountryReport(con);
        rep2.getPopulousCountriesFromContinent("Europe", -1);
        rep2.displayReport();

        //list countries by pop in a given continent to a certain limit
        CountryReport rep3 = new CountryReport(con);
        rep3.getPopulousCountriesFromContinent("Africa", 3);
        rep3.displayReport();

        //list countries by pop in a given region to a certain limit
        CountryReport rep4 = new CountryReport(con);
        rep4.getPopulousCountriesFromRegion("Western Africa", 300);
        rep4.displayReport();

        //list all countries in the world by population to a certain limit
        CountryReport rep5 = new CountryReport(con);
        rep5.getPopulousCountriesInWorld(10);
        rep5.displayReport();

        // city report
        CityReport cityReport = new CityReport(con);
        cityReport.getPopulousCitiesInWorld(10);
        cityReport.displayReport();

        //country language report
        CountryLanguageReport clr = new CountryLanguageReport(con);
        clr.getLanguagesFromCountry("GBR");
        clr.displayReport();

        // Disconnect from database
        dbC.disconnect();
    }


}