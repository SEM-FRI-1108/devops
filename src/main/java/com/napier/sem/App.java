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
        Country france = rep1.getCountryFromCode("FRA");
        rep1.displayReport(france);

        // Disconnect from database
        dbC.disconnect();
    }


}