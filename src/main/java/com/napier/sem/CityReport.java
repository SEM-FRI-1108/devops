package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CityReport {

    private Connection con;
    private ArrayList<City> cities = new ArrayList<>();

    public CityReport(Connection con) {
        this.con = con;
    }

    private void processResults(ResultSet rslt) throws SQLException {
        while (rslt.next()) {
            City city = new City();
            city.id = rslt.getInt("ID");
            city.name = rslt.getString("Name");
            city.countryCode = rslt.getString("CountryCode");
            city.district = rslt.getString("District");
            city.population = rslt.getInt("Population");
            cities.add(city);
        }
    }

    public void getCityFromID(int id) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT ID, Name, CountryCode, District, Population " +
                    "FROM city " +
                    "WHERE ID = " + id;
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get city");
        }
    }

    public void getPopulousCitiesInWorld(int limit) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT ID, Name, CountryCode, District, Population " +
                    "FROM city " +
                    "ORDER BY Population DESC";
            if (limit != -1) {
                sql += " LIMIT " + limit;
            }
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to access cities");
        }
    }

    public void getPopulousCitiesFromCountry(String countryCode, int limit) {
        try {
            Statement stmt = con.createStatement();
            String sql = "SELECT ID, Name, CountryCode, District, Population " +
                    "FROM city " +
                    "WHERE CountryCode = '" + countryCode + "' " +
                    "ORDER BY Population DESC";
            if (limit != -1) {
                sql += " LIMIT " + limit;
            }
            ResultSet resultSet = stmt.executeQuery(sql);
            processResults(resultSet);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to identify country");
        }
    }

    public void displayReport() {
        if (cities.isEmpty()) {
            System.out.println("There are no cities in this report.");
        }
        else {
            for (City city : cities) {
                System.out.println(city.id + " | " +
                        city.name + " | " +
                        city.countryCode + " | " +
                        city.district + " | " +
                        city.population);
            }
        }
    }
}
