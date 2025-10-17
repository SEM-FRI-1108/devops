
# USE CASE: 2 Generate population report in order from highest to lowest populated cities

## CHARACTERISTIC INFORMATION

### Goal in Context

As an organisation member, I want to see the highest populated cities in the world so I can use them for my next project

### Scope

Organisation

### Level

Primary task

### Preconditions

Database contains the data needed

### Success End Condition

A report is generated on the population of a cities organised from highest to lowest

### Failed End Condition

Report is not generated

### Primary Actor

Project Deployer

### Trigger
When the organisation requests for a report on cities to be made

## MAIN SUCCESS SCENARIO

1. The project deployer requests reports on cities organised from largest to smallest
2. The system gathers the reports and orders them from largest to smallest.
3. The reports feature the headings: Name,Population,Country,District.

## EXTENSIONS

2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
    2. The user selects a city that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


