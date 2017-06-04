#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Google Page Navigation
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Google Search
    Given User is at Page "<url1>"
    When User enters "<value>" in search textfield
    When User clicks on search button
    Then User will be redirected to Page "<url2>"

    Examples: 
      | url1                      | value       | url2                                     |
      | https://www.google.com.sg | Hello World | https://www.google.com.sg/#q=Hello+World |
