# POCZĄTEK zadanie finalne modułu 14 - "Automatyzacja scenariuszy testowych"
Feature: Display balance

  Scenario: User checks the balance of their wallet
    Given there is $100 in my wallet
    When  I check the balance of my wallet
    Then  I should see that the balance is $100
# KONIEC zadanie finalne modułu 14 - "Automatyzacja scenariuszy testowych"