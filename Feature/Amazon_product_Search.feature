Feature: to test the product search and add to cart functionality of amazon

  Scenario: to check whether desired product is added to cart or not
    Given Browser is launched
    And User navigates to "https://www.amazon.in/" page
    And check if "#nav-logo-sprites" is present
    And type product "smart watch" in "twotabsearchtextbox"
    And click on the "//input[@id='nav-search-submit-button']" element and check if "body div[id='a-page'] div[id='search'] div[class='s-desktop-width-max s-desktop-content s-opposite-dir sg-row'] div[class='s-matching-dir sg-col-16-of-20 sg-col sg-col-8-of-12 sg-col-12-of-16'] div[class='sg-col-inner'] span[class='rush-component s-latency-cf-section'] div[class='s-main-slot s-result-list s-search-results sg-row'] div:nth-child(2) div:nth-child(1) span:nth-child(1) div:nth-child(1) div:nth-child(1) span:nth-child(1)" element is present
    And Scroll down
    And click on "//span[contains(text(),'boAt Wave Call Smart Watch, Smart Talk with Advanc')]" having desired product
    And check if "#title" is present as "boAt Wave Call Smart Watch, Smart Talk with Advanced Dedicated Bluetooth Calling Chip, 1.69” HD Display with 550 NITS & 70% Color Gamut, 150+ Watch Faces, Multi-Sport Modes,HR,SpO2, IP68(Active Black)"
    And click on "//select[@id='quantity']" and change the quantity to "2"
    And click on "//input[@id='add-to-cart-button']"
    And check if "//span[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']" element is present

    
    
