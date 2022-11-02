Feature: to test the product search and add to cart functionality of amazon

  Scenario: to check whether desired product is added to cart or not
    Given Browser is launched
    And User navigates to "https://www.amazon.in/" page and check if "nav-logo-sprites" is present
    And type product "smart watch" in "twotabsearchtextbox"
    And click on the "nav-search-submit-button" element and check if "//*[@id='search']/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/span/div/div/span" element is present
    And Scroll down
    Then click on "img[alt='boAt Wave Call Smart Watch, Smart Talk with Advanced Dedicated Bluetooth Calling Chip, 1.69” HD Display with 550 NITS & 7...']" having desired product

    
    