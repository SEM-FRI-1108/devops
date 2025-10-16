
# USE CASE: 3 Generate population report ordered from most to least populated (cities by continent)

## CHARACTERISTIC INFORMATION

### Goal in Context

As an organisation member, I want to see the most populated cities in a continent of my choose so I can study trends across a continent

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated listing cities from the chosen continent, ordered from highest to lowest population

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report on the most populated cities within a chosen continent

## MAIN SUCCESS SCENARIO

1. The project deployer chooses the continent to generate the report
2. The system validates the continent choice and checks database for cities in the chosen continent
3. The system gathers the reports and orders them from largest to smallest. 
4. The reports feature the headings: Name, Country, District, Population, Continent.

## EXTENSIONS

1. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a continent that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


