package com.napier.sem;

import java.sql.*;
import java.util.Locale;

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
        dbC.connect();

        // Disconnect from database
        dbC.disconnect();
    }
}