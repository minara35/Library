Feature: Library order placing feature
  Agile Story: When user is on the "Users" page, user should be able to filter all ACTIVE and INACTIVE users info

  @lib
  Scenario Outline: Scenario Outline: User should be able to filter all users info
    Given User is logged into  Library account and on User page
    And User selects "<userGroup>" from User Group dropdown
    And User selects "<status>" from Status dropdown
    Then User verifies "<expectedNames>" is on the table

    Examples: User fills out the form as followed from table below:

      | userGroup | status | expectedNames |

      |Students | ACTIVE | ACTIVE        |


  Scenario Outline: Scenario Outline: User should be able to filter all users info in search box
    Given User is logged into  Library account and on User page
    And User enters "<nameOrLastName>" to search input box
    And User enters "<ID>" to search input box
    And User enters "<email>" to search input box
    Then User verifies "<expectedName>" in the table

    Examples: User fills out the form as followed from table below:

      | nameOrLastName       | ID | email | expectedName         |

      | Ms. Kemberly Ullrich |    |       | Ms. Kemberly Ullrich |















