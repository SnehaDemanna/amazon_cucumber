package StepDefination_1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class amazon {

WebDriver driver;

@Given("Browser is launched")
public void browser_is_launched() 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha_demanna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();	
}

@And("User navigates to {string} page and check if {string} is present")
public void user_navigates_to_page_and_check_if_is_present(String url, String ispresent )
{	
	driver.get(url);
	Assert.assertTrue(driver.findElement(By.id(ispresent)).isDisplayed());
}

@And("type product {string} in {string}")
public void type_product_in(String product, String element) 
{
	driver.findElement(By.id(element)).sendKeys(product);
}

@And("click on the {string} element and check if {string} element is present")
public void click_on_the_element_and_check_if_element_is_present(String element, String ispresent) 
{
	driver.findElement(By.id(element)).click();
	String ActualText = driver.findElement(By.xpath(ispresent)).getText();
	Assert.assertEquals(ActualText ,"RESULTS");
}

@And("Scroll down")
public void scroll_down() throws InterruptedException 
{   
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,800)", "");
	Thread.sleep(5000);
	
}

@Then("click on {string} having desired product")
public void click_on_having_desired_product(String element) 
{
	driver.findElement(By.cssSelector(element)).click();
}


	
	
}
