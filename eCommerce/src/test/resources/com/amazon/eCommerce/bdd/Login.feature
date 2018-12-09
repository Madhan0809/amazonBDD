@smoke @regression
Feature: Amazon Login
As a Amazon User
In order to Login into the application
I want to enter my valid credentials

@m
Scenario: Valid Login
Given I go to Amazon Home page
When I click on Sign In button in Home Page
And I enter my email as "madhan@gmail.com"
And I enter my password as "Password123"
And I click on Sign In button in Login Page
Then I should see "Hello, Madhan" text in home page
And I click on xxx button