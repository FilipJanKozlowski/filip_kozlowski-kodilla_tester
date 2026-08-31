Feature: FizzBuzz
  Zwracanie odpowiedniego tekstu w zależności od podzielności podanej liczby

  Scenario Outline: Sprawdzenie wartości FizzBuzz dla podanej liczby
    Given liczba to <number>
    When sprawdzam wynik FizzBuzz
    Then powinienem otrzymać <result>

    Examples:
      | number | result     |
      | 3      | "Fizz"     |
      | 6      | "Fizz"     |
      | 9      | "Fizz"     |
      | 5      | "Buzz"     |
      | 10     | "Buzz"     |
      | 20     | "Buzz"     |
      | 15     | "FizzBuzz" |
      | 30     | "FizzBuzz" |
      | 45     | "FizzBuzz" |
      | 1      | "None"     |
      | 2      | "None"     |
      | 7      | "None"     |