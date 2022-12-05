# elkinparo@gmail.com

Feature: as a quality analyst
  I want to test the buy offers flow
  to confirm its correct operation

  @PurchaseBasic
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase without a coupon

  @Purchase
  Scenario: log in to the page
    Given : actor opens browser
    When : I send the username and password
    Then : check the offers page and make a purchase with coupon