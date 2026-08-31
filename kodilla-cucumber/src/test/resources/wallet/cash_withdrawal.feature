Feature: Cash Withdrawal

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When  I request $30
    Then  $30 should be dispensed
    # POCZĄTEK 14.4 - "Rozszerzanie scenariuszy testowych"
    And   my wallet balance should be $170
    # KONIEC 14.4 - "Rozszerzanie scenariuszy testowych"

  # POCZĄTEK 14.3 - zadanie "Dodajemy scenariusze testowe"
  Scenario: Withdrawal of the entire balance
    Given I have deposited $200 in my wallet
    When  I request $200
    Then  $200 should be dispensed
    And   my wallet balance should be $0

  Scenario: Insufficient funds for withdrawal
    Given I have deposited $200 in my wallet
    When  I request $300
    Then  the withdrawal should be rejected
    And   my wallet balance should remain $200

  Scenario: Withdrawal of $0
    Given I have deposited $200 in my wallet
    When  I request $0
    Then  the withdrawal should be rejected
    And   my wallet balance should remain $200

  Scenario: Withdrawal of a negative amount
    Given I have deposited $200 in my wallet
    When  I request -$50
    Then  the withdrawal should be rejected
    And   my wallet balance should remain $200

  Scenario: Multiple successive withdrawals
    Given I have deposited $200 in my wallet
    When  I request $50
    And   I request $50
    Then  my wallet balance should be $100
  # KONIEC 14.3 - zadanie "Dodajemy scenariusze testowe"