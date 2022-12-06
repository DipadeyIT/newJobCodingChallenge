
Feature: New Job
  
Scenario: Create a new job
   Given User on HCP homepage
   When User enters user Name "dipadeyit@gmail.com"
   And User enter password "Rishabayoni2022@"
   And User clicks on signin button
   And User clicks on New button
   And User clicks on job button
   And User clicks on New Customer button
   And User enters First Name "Dipa"
   And User enters Last Name "Dey"
   And User clicks on Create button
   And User enters Item Name "test"
   And User clicks on Private Note button
   And User enters a private note "test"
   And User clicks on Save Job button
   Then User verifies Activity Feed has the created job