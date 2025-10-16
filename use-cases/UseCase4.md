
# USE CASE: 4 Generate population report ordered from most to least populated (cities by country)

## CHARACTERISTIC INFORMATION

### Goal in Context

As an organisation member, I want to be able to see the cities in a country by population so I can target the most people for my location based project

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated listing cities from a chosen country, ordered from highest to lowest population

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report on population of cities within a chosen country

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on cities organised from largest to smallest from a selected country
2. The system gathers the reports and orders them from largest to smallest.
3. The reports feature the headings: Name, Country, District, Population.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a country that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


