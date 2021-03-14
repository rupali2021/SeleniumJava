Feature: Verify user is able to retrieve accessories after applying filters on Accessories page


  @Regression @Sanity
  Scenario: Retrieval of accessories
    Given Usera is at eshop Home page
    When User looks for accessories in products & services menu
    And User filters accessories by filter By, Brands and Sort By
    Then user is displayed with minimum three Accessorries
    
    
  @Regression
  Scenario: User can add Broadband plan in shopping cart and do checkout
    Given Userb is at eshop Home page
    When User looks for Broadband plan in Boardband menu
    And Selects 1 Gbps fibre plan
    Then Enters postal code, floor No and unit No for New fibre Broadband Plan
    And Check fibre availbility for new plan
    And Enters new number for fibre plan
    Then User is displayed with plan details and Total in shopping card



   @Regression
  Scenario: User can add TV plan in shopping cart and  do checkout
    Given Userc is at eshop Home page
    When User looks for packs in TV menu
    And Select new packs
    Then Enters postal code, floor No and unit No for New customer
    And Check fibre availbility for new customer
    Then new user is displayed with plan details and Total in shopping card

