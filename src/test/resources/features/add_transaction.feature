Feature: AddTransaction
  Scenario: Add new Transaction
    Given Abraham is logged into the application
      |user|pass|
    When Abraham enters  the required information for the new transaction
    |12-12-2025|500|description the transaction|
    Then Abraham should see a new transaction in the transaction list with the correct details
