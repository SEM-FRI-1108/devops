package com.napier.sem;

/**
 * Class defining Country objects used with CountryReports.
 * Defines a Country's Code, Name, Continent, Region, Population, and Capital City Code.
 */
public class Country {

    /**
     * Country's Alpha-3 Code
     */
    public String code;

    /**
     * Country's Name
     */
    public String name;

    /**
     * Country's Continent
     */
    public String continent;

    /**
     * Country's Region
     */
    public String region;

    /**
     * Country's Population
     */
    public int population;

    /**
     * Country's Capital - as a code linked to Cities table
     */
    public int capital;

}
