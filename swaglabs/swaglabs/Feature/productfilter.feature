Feature: verifying all filter options



Scenario Outline: filter options by name
Given open product page
 When apply filter by <name> of the filter
 Then  verify products are arranged accordingly
 Examples:
  | name                |
  |Name (A to Z)        |
  |Name (Z to A)        |
  |Price (low to high)|
  |Price (high to low)|