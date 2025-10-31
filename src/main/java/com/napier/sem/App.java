package com.napier.sem;

import java.sql.*;

public class App
{
    public static void main(String[] args)
    {
            // Create new Application
            DatabaseConnector dbC = new DatabaseConnector();

            // Connect to database
            dbC.connect();

            // Disconnect from database
            dbC.disconnect();
    }
}