
# USE CASE: 9 Generate report on the total, urban and rural population by country

## CHARACTERISTIC INFORMATION

### Goal in Context

As a project deployer, I want to see the total population, people living in cities, and people not living in cities in each country so I can identify which countries are more urban or rural

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated showing, for each country the total population, people living in cities and the number of people not living in cities.

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report comparing levels of urbanisation across countries.

## MAIN SUCCESS SCENARIO

1. The project deployer chooses to view population breakdown by country.
2. The system validates the data for total, urban and rural population is there for all countries.
3. The system gets the population data from the database.
4. The system calculates a percentage of urban and rural populations from each country.
5. The system generates a report with the following headings: Code, Name, Continent, Region, Population, Capital, Urbanisation.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a country that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


