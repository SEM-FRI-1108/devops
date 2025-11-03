package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CountryReport {

    private Connection con;
    private ArrayList<Country> countries = new ArrayList<>();

    public CountryReport(Connection con) {
        this.con = con;
    }

    private void processResults(ResultSet rslt) throws SQLException {
            while (rslt.next()) {
                Country country = new Country();
                country.code = rslt.getString("code");
                country.name = rslt.getString("name");
                country.continent = rslt.getString("continent");
                country.region = rslt.getString("region");
                country.population = rslt.getInt("population");
                country.capital = rslt.getInt("capital");
                countries.add(country);
            }
    }

    /**
     * Method to search database for details of country of specific Alpha-3 Code
     * @param code the Alpha-3 code of the required country
     * @return a Country object with the name,continent,region,population,and capital initialised
     * Will add Country to this report's list of countries as well.
     */
    public void getCountryFromCode(String code) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT Code, Name, Continent, Region, Population, Capital " +
                        "FROM country " +
                        "WHERE Code = '" + code + "'";
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country");
        }
    }

    public void getPopulusCountriesFromContinent(String continent, int limit) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT Code, Name, Continent, Region, Population, Capital " +
                        "FROM country " +
                        "WHERE Continent = '" + continent + "' " +
                        "ORDER BY  Population DESC";
            if (limit != -1) {
                sql += " LIMIT " + limit;
            }
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to identify continent");
        }
    }

    public void getPopulusCountriesFromRegion(String region, int limit) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT Code, Name, Continent, Region, Population, Capital " +
                    "FROM country " +
                    "WHERE Region = '" + region + "' " +
                    "ORDER BY  Population DESC";
            if (limit != -1) {
                sql += " LIMIT " + limit;
            }
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to identify region");
        }
    }

    /**
     * Display method for a report concerning a country.
     */
    public void displayReport() {
        if (countries.isEmpty()) {
            System.out.println("There are no countries in this report.");
        }
        else {
            for (Country country : countries) {
                System.out.println(country.code + " | " +
                                    country.name + " | " +
                                    country.continent + " | " +
                                    country.region + " | " +
                                    country.population + " | " +
                                    country.capital);
            }
        }
    }
}
