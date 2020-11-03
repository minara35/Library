Feature: Smartbear order placing feature
  Agile Story: When user is on the order page, user should be able to place order after filling out the form


  @smartOrder
  Scenario Outline: Scenario Outline: User should be able to place order with different data sets
    Given User is logged ito SmartBear Tester account and on Order page
    And User selects "<product>" from product dropdown
    And User enters "<quantity>" to quantity input box
    And User enters "<customerName>" to customer name input box
    And User enters "<street>" to street input box
    And User enters "<city>" to city input box
    And User enters "<zip>" to zip input box
    And User enters "<state>" to state input box
    And User selects "<cardType>" as card type from radio buttons
    And User enters "<cardNumber>" to card number input box
    And User enters "<expirationDate>" to expiration date input box
    And User clicks process button
    Then User verifies "<expectedName>" is in the table

    Examples: User fills out the form as followed from table below:

      | product | quantity | customerName | street    | city    | state | zip  | cardType | cardNumber     | expirationDate | expectedName |
      | MyMoney | 1        | Ken Adams    | Kinzei st | Chicago | IL    | 6004 | Visa     | 1231339038593456 | 10/22          | Ken Adams    |