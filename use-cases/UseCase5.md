
# USE CASE: 5 Generate report on the top populated cities in the world (customisable by number)

## CHARACTERISTIC INFORMATION

### Goal in Context

As a project deployer, I want to choose the top populated cities in the world and choose how many to see so that I can focus on densely populated areas

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed
The project deployer has permission to generate reports

### Success End Condition

A report is generated on the top most populated cities in the world to see most densely populated areas

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report showing a specific number of the most populated cities in the world

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on the most populated cities in the world
2. The system asks for how many cities to display
3. The system gathers the reports and orders them from largest to smallest. 
4. The reports feature the headings: Name, Country, District, Population.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a city that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


