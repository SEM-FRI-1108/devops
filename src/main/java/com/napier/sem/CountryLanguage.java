package com.napier.sem;

/**
 * Class defining Language objects used with LanguageReports.
 * Defines a Langauge's associated Country Code, Name, Officiality, and Percentage use.
 */
public class CountryLanguage {
    /**
     * country alpha-3 code
     */
    public String countryCode;

    /**
     * language spoken
     */
    public String language;

    /**
     * if it is the official language
     */
    public boolean isOfficial;

    /**
     * percentage of population who speak the language
     */
    public float percentage;
}
