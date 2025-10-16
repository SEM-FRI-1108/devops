
# USE CASE: 1 Generate population report ordered from most to least populates (countries)

## CHARACTERISTIC INFORMATION

### Goal in Context
*copy from user story*  

As a project deployer, I want to see the population of a country that I choose so I can know which countries have the largest or smallest populations

### Scope
*same*

Organisation

### Level
*same*

Primary task

### Preconditions
*same*

Database contains the data needed

### Success End Condition
*change to be similar to goal in context*
A report is generated on the population of a countries organised from highest to lowest

### Failed End Condition
*same*

Report is not generated

### Primary Actor
*same*

Project Deployer

### Trigger
When the organisation requests for a report on countries to be made

## MAIN SUCCESS SCENARIO

*think about how the user will work through the code*
1. The project deployer requests reports on countries organised from largest to smallest
2. The system gathers the reports and orders them from largest to smallest.
3. The reports feature the headings: Code,Name,Continent,Population,Capital,Region.

## EXTENSIONS
*where the code can go wrong*


2. Invalid Scope
    1. The user does not select a valid scope and the system will throw an error and the user will have to select the scope again
   2. The user selects a country that doesn't exist. The system will throw an error and force the user to enter a valid scope name


## SUB-VARIATIONS

*will change check assessment brief for the scope of it*

1. The report can be for countries in the world,a continent or a region

## SCHEDULE

12/11/2025


