package com.napier.sem;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;
import java.util.Arrays;

public class CountryTests {

    CountryReport rep;

    @BeforeEach
    void initEach() {
        rep = new CountryReport(null);
    }

    @Test
    void printReportOneCountry() {
        Country france = new Country();
        france.code = "FRA";
        france.name = "France";
        france.continent = "Europe";
        france.region = "Southwest Europe";
        france.population = 0;
        france.capital = 113;
        rep.addCountry(france);
        rep.displayReport();
    }

    @Test
    void printReportNoCountries() {
        rep.displayReport();
    }

    @Test
    void printReportMultipleCountries() {
        Country france = new Country();
        france.code = "FRA";
        france.name = "France";
        france.continent = "Europe";
        france.region = "Southwest Europe";
        france.population = 0;
        france.capital = 113;

        Country japan = new Country();
        japan.code = "JPN";
        japan.name = "Japan";
        japan.continent = "Asia";
        japan.region = "Southeast Asia";
        japan.population = 20;
        japan.capital = 13;

        rep.addCountry(france);
        rep.addCountry(japan);
        rep.displayReport();
    }

    @Test
    void printReportNullElements() {
        rep.addCountry(null);
        rep.displayReport();
    }

    @Test
    void printReportCountryHasNullElements() {
        Country france = new Country();
        rep.addCountry(france);
        rep.displayReport();
    }
}
