package com.napier.sem;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.sql.Connection;


class CountryIntegrationTests {

    static Connection con;
    static DatabaseConnector dbC;
    CountryReport rep;

    @BeforeAll
    static void initAll() {
        dbC = new DatabaseConnector(true);
        con = dbC.connect();
    }

    @BeforeEach
    void initEach() {
        rep = new CountryReport(con);
    }

    @Test
    void validCodeCountryExistsTest() {
        rep.getCountryFromCode("FRA");
        assertFalse(rep.getCountries().isEmpty(), "Report should have country");
    }

    @Test
    void invalidCountryCodeNotExistsTest() {
        rep.getCountryFromCode("MOO");
        assertTrue(rep.getCountries().isEmpty(), "Report should have no countries");
    }

    @Test
    void emptyCountryCodeHandledTest() {
        rep.getCountryFromCode("");
        assertTrue(rep.getCountries().isEmpty(), "Report should have no countries");
    }

    @Test
    void validContinentExistsTest() {
        rep.getPopulousCountriesFromContinent("Asia", -1);
        assertFalse(rep.getCountries().isEmpty(), "Report should have countries");
    }

    @Test
    void invalidContinentNotExistsTest() {
        rep.getPopulousCountriesFromContinent("Space", -1);
        assertTrue(rep.getCountries().isEmpty(), "Report should have no countries");
    }

    @Test
    void emptyContinentHandledTest() {
        rep.getPopulousCountriesFromContinent("", -1);
        assertTrue(rep.getCountries().isEmpty(), "Report should have no countries");
    }

    @Test
    void continentAnyLimitTest() {
        rep.getPopulousCountriesFromContinent("Europe", 5);
        assertEquals(5, rep.getCountries().size(), "Report should have exactly 5 countries");
    }

    @Test
    void continentSingleLimitTest() {
        rep.getPopulousCountriesFromContinent("Europe", 1);
        assertEquals(1, rep.getCountries().size(), "Report should have exactly 1 country");
    }

    @Test
    void continentOverLimitTest() {
        rep.getPopulousCountriesFromContinent("Africa", 100);
        assertEquals(58, rep.getCountries().size(), "Report should have all 58 African countries");
    }

    @Test
    void continentInvalidLimitTest() {
        rep.getPopulousCountriesFromContinent("Africa", -10);
        assertTrue(rep.getCountries().isEmpty(), "Report should have no countries");
    }
}