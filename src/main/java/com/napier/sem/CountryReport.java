package com.napier.sem;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CountryReport {

    private Connection con;
    private ArrayList<Country> countries = new ArrayList<>();

    public CountryReport(Connection con) {
        this.con = con;
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
            String sql = "SELECT Code, Name, Continent, Region, Population, Capital from country WHERE Code = '" + code + "'";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()){
                Country country = new Country();
                country.code = resultSet.getString("code");
                country.name = resultSet.getString("name");
                country.continent = resultSet.getString("continent");
                country.region = resultSet.getString("region");
                country.population = resultSet.getInt("population");
                country.capital = resultSet.getInt("capital");
                countries.add(country);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country");
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
