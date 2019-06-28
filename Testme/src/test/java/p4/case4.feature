
@tag
Feature: TDD
 

  @fail
  Scenario: user moves to payment without adding product to cart   
     Given Alex has registered in TestmeApp
    When Alex search a particular product like Headphone
    And Try to proceed payment without adding any item in the cart
    Then Testme app doesn't display in the cart icon
    

  
  @pass
  Scenario: user moves to payment without adding product to cart   
     Given user signin  TestmeApp
    When user search product headphone
    And  user see the carticon page
    And Conform the purchase details and click checkout
    And  proceed payment 
    Then purchase the product
  