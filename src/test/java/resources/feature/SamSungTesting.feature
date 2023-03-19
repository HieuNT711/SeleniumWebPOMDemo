Feature: SamSung SDS Testing

  Background:
    Given I navigate to URL "http://live.techpanda.org/"

  @TC-01 @TC-02
  Scenario: Verify user information is correct after registered successfully
    Given I register account in LiveGuru99 successfully
    When I go to common page
    And I open my account page
    And I open account information page
    Then The data in account information page should be correct

  @TC-03
  Scenario Outline:Login success to system
    When I login to LiveGuru99
    Then I should see header text "<headerText>" and message "<message>" after login system
    Examples:
      | headerText   | message               |
      | MY DASHBOARD | Hello, Automation FC! |

  @TC-04
  Scenario: Verify that cost of product in list page and details page are equal
    When I go to mobile page
    And I choose Sony Xperia product
    Then The price of Sony Xperia should be math

  @TC-05
  Scenario: Verify Discount Coupon works correctly
    When I go to mobile page
    And I add Sony Xperia to card
    And I apply discount code
    Then Product is discounted from the discount code

  @TC-06
  Scenario Outline: Verify that you can't add more 500 items of product
    When I go to mobile page
    And I add Sony Xperia to card
    When I set "<quantity>" quantity for product
    Then I can see error message "<errorMess>" and "<errorMaxQuantity>"
    When I go to empty card page
    Then The notification "<notification>" should be displayed
    Examples:
      | quantity | errorMess                                                     | errorMaxQuantity                                    | notification           |
      | 501      | Some of the products cannot be ordered in requested quantity. | * The maximum quantity allowed for purchase is 500. | SHOPPING CART IS EMPTY |


