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
        dbC = new DatabaseConnector();
        con = dbC.connect("localhost:33060", 30000);
    }

    @BeforeEach
    void initEach() {
        rep = new CountryReport(con);
    }

    @Test
    void validCodeCountryExistsTest() {
        rep.getCountryFromCode("FRA");
        assertFalse(rep.getCountries().isEmpty());
    }

    @Test
    void invalidCountryCodeNotExistsTest() {
        rep.getCountryFromCode("MOO");
        assertTrue(rep.getCountries().isEmpty());
    }

    @Test
    void emptyCountryCodeHandledTest() {
        rep.getCountryFromCode("");
        assertTrue(rep.getCountries().isEmpty());
    }

    @Test
    void validContinentExistsTest() {
        rep.getPopulousCountriesFromContinent("Asia", -1);
        assertFalse(rep.getCountries().isEmpty());
    }

    @Test
    void invalidContinentNotExistsTest() {
        rep.getPopulousCountriesFromContinent("Space", -1);
        assertTrue(rep.getCountries().isEmpty());
    }

    @Test
    void emptyContinentHandledTest() {
        rep.getPopulousCountriesFromContinent("", -1);
        assertTrue(rep.getCountries().isEmpty());
    }

    @Test
    void continentAnyLimitTest() {
        rep.getPopulousCountriesFromContinent("Europe", 5);
        assertEquals(5, rep.getCountries().size());
    }

    @Test
    void continentSingleLimitTest() {
        rep.getPopulousCountriesFromContinent("Europe", 1);
        assertEquals(1, rep.getCountries().size());
    }

    @Test
    void continentOverLimitTest() {
        rep.getPopulousCountriesFromContinent("Africa", 100);
        assertEquals(58, rep.getCountries().size());
    }

    @Test
    void continentInvalidLimitTest() {
        rep.getPopulousCountriesFromContinent("Africa", -10);
        assertTrue(rep.getCountries().isEmpty());
    }
}