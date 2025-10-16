
# USE CASE: 6 Generate report on the world population

## CHARACTERISTIC INFORMATION

### Goal in Context

As a project deployer, I want to see the population of the world so I can understand global population size.

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated on the population of the world, gathered from all the countries population data

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report showing the total global population

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on the full worlds population.
2. The system gathers population data from all countries in the database
3. The system calculates the world population.
4. The reports feature the headings: Name, Population.

## EXTENSIONS

1. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
2. System performance
   1. Database connection fails.


## SUB-VARIATIONS

1. The report can be for world population, countries in the world,a continent or a region

## SCHEDULE

12/11/2025


