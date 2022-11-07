package StepDefination_1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends AmazonActionDriver

{	
	String parent;
	AmazonActionDriver ob = new AmazonActionDriver();

	@Given("Browser is launched")
	public void browser_is_launched() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha_demanna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}
	@And("User navigates to {string} page")
	public void user_navigates_to_page(String url) 
	{
		driver.get(url);
	}

	@And("check if {string} is present")
	public void check_if_is_present(String string)
	{
		ob.assert_element(string);
	}

	@And("type product {string} in {string}")
	public void type_product_in(String product, String element) 
	{
		ob.type(element,product);
	}


	
	@And("click on the {string} element and check if {string} element is present")
	public void click_on_the_element_and_check_if_element_is_present(String element1, String ispresent) throws InterruptedException 
	{   ob.click_button(element1);

	}

	@And("Scroll down")
	public void scroll_down() throws InterruptedException 
	{   
		ob.scroll();
	}

	@And("click on {string} having desired product")
	public void click_on_having_desired_product(String element1) throws InterruptedException 
	{
		parent = driver.getWindowHandle();
		ob.click_button(element1);
		ob.switchToWindow(parent);
	}
	
	
	@And("check if {string} is present as {string}")
	public void check_if_is_present_as(String string, String string2) throws InterruptedException
	{   
		ob.assert_text(string, string2);
	}
    
	@And("click on {string} and change the quantity to {string}")
	public void click_on_and_change_the_quantity_to(String string, String string2) throws InterruptedException 
	{
		ob.scroll();
		ob.click_button(string);
		ob.dropdown(string, string2);
	}

	@And("click on {string}")
	public void click_on(String string) 
	{
		ob.click_button(string);
	}

	@And("check if {string} element is present")
	public void check_if_element_is_present(String string) 
	{
		ob.assert_element(string);
	}



}









