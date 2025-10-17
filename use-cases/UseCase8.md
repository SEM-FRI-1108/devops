
# USE CASE: 8 Generate report on the total, urban and rural population by continent

## CHARACTERISTIC INFORMATION

### Goal in Context

As a project deployer, I want to see the total population, people living in cities, and people not living in cities in each continent so I can compare levels of urbanisation across continents

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated showing, for each continent the total population, people living in cities and and the number of people not living in cities.

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report comparing levels of urbanisation across continents.

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on the population breakdown by continent.
2. The system checks the database for population data by continent
3. The system gathers the reports and displays the urbanisation level across different continents.
4. The reports feature the headings: Code, Name, Country, District, Population.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a continent that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


