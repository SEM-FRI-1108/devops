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

        //find and display information about a country (france)
        CountryReport rep1 = new CountryReport(con);
        rep1.getCountryFromCode("FRA");
        rep1.displayReport();

        //list countries by pop in a given continent
        CountryReport rep2 = new CountryReport(con);
        rep2.getPopulusCountriesFromContinent("Europe", -1);
        rep2.displayReport();

        //list countries by pop in a given continent to a certain limit
        CountryReport rep3 = new CountryReport(con);
        rep3.getPopulusCountriesFromContinent("Africa", 3);
        rep3.displayReport();

        CountryReport rep4 = new CountryReport(con);
        rep4.getPopulusCountriesFromRegion("Western Africa", 3);
        rep4.displayReport();

        // Disconnect from database
        dbC.disconnect();
    }


}