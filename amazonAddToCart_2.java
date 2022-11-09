package StepDefination_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Files.JFileReader;
import io.cucumber.java.en.*;

public class amazonAddToCart_2 extends actionDriver2 {

	actionDriver2 ob = new actionDriver2();
	String parent;
	/*
    // parsing file "JSONExample.json"
    Object obj = new JSONParser().parse(new FileReader("C:\\Users\\sneha_demanna\\eclipse-workspace\\cucumber_java_1\\JSON_files\\amazon.json"));                                               
    // typecasting obj to JSONObject
    JSONObject jo = (JSONObject) obj;
    */  
     
	@Given("browser is launched")
	public void browser_is_launched() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha_demanna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
	}

	@And("user navigates to {string} page")
	public void user_navigates_to_page(String string) throws IOException, ParseException 
	{
		String baseurl = (String) JFileReader.fileRead().get(string);
		driver.get(baseurl);
	}

	@And("Check if {string} is present")
	public void check_if_is_present(String string) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string);
		ob.assert_element(element);

	}

	@And("Type product {string} in {string}")
	public void type_product_in(String string, String string2) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string2);
	    String product = (String) JFileReader.fileRead().get(string);
	
		ob.type(element,product);
	}
    
	@And("Click on the {string} element and check if {string} element is present")
	public void click_on_the_element_and_check_if_element_is_present(String string, String string2) throws IOException, ParseException 
	{
	    String searchtab = (String) JFileReader.fileRead().get(string);
	    String result = (String) JFileReader.fileRead().get(string2);
		ob.click_button(searchtab);
		ob.assert_element(result);
	}

	@And("scroll down")
	public void scroll_down() throws InterruptedException 
	{
		ob.scroll();
	}

	
	@And("Click on {string} having desired product")
	public void click_on_having_desired_product(String string) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string);
		parent = driver.getWindowHandle();
		ob.click_button(element);
		ob.switchToWindow(parent);
	}
    
	@And("Check if {string} is present as {string}")
	public void check_if_is_present_as(String string, String string2) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string);
	    String text = (String) JFileReader.fileRead().get(string2);
        ob.assert_text(element, text);
	}

	@And("Click on {string} and change the quantity to {string}")
	public void click_on_and_change_the_quantity_to(String string, String string2) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string);
	    String quantity = (String) JFileReader.fileRead().get(string2);
		ob.click_button(element);
		ob.dropdown(element, quantity);
	}

	@And("Click on {string}")
	public void click_on(String string) throws IOException, ParseException 
	{
	    String element = (String) JFileReader.fileRead().get(string);
		ob.click_button(element);
	}

	@And("Check if {string} element is present")
	public void check_if_element_is_present(String string) throws IOException, ParseException
	{
	    String element = (String) JFileReader.fileRead().get(string);
		ob.assert_element(element);;
	}

	


}


