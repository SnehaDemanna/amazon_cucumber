Feature: to test the product search and add to cart functionality of amazon

  Scenario: to check whether desired product is added to cart or not
    Given browser is launched
    And user navigates to "url" page
    And Check if "amazon_logo" is present
    And Type product "product_name" in "search_box_locator"
    And Click on the "search_tab_locatotr" element and check if "result_locator" element is present
    And scroll down
    And Click on "boat_watch_locator" having desired product
    And Check if "watch_title_locator" is present as "watch_title_text"
    And Click on "dropdown_locator" and change the quantity to "quantity"
    And Click on "addToCart_locator"
    And Check if "AddedToCart_locator" element is present

    
