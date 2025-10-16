
# USE CASE: 7 Generate report on the population of a chosen district

## CHARACTERISTIC INFORMATION

### Goal in Context

As a project deployer, I want to see the population of a district that I choose so I can target smaller local areas
### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated on the population of a chosen district and related details.

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report for a specific district.

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on the population of a chosen district.
2. The system checks the database for population data for the chosen district
3. The system gathers the reports and displays the population for that district.
4. The reports feature the headings: Code, Name, Country, District, Population.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a district that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


