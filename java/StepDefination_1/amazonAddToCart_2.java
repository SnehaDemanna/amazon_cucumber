package StepDefination_1;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class amazonAddToCart_2 extends actionDriver2{
	
	String parent;

	JFileReader object = JFileReader.getInstance();

	@Given("browser is launched")
	public void browser_is_launched() 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\sneha_demanna\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();	
	}

	@And("user navigates to {string} page")
	public void user_navigates_to_page(String string)throws Exception 
	{
	    String element = (String) object.fileRead().get(string);
		driver.get(element);
	}

	@And("Check if {string} is present")
	public void check_if_is_present(String string) throws Exception
	{
	    String element = (String) object.fileRead().get(string);
		assert_element(element);
	}

	@And("Type product {string} in {string}")
	public void type_product_in(String string, String string2)throws Exception
	{
	    String element = (String) object.fileRead().get(string2);
	    String product = (String) object.fileRead().get(string);
	
		type(element,product);
	}
    
	@And("Click on the {string} element and check if {string} element is present")
	public void click_on_the_element_and_check_if_element_is_present(String string, String string2)throws Exception 
	{
	    String searchtab = (String) object.fileRead().get(string);
	    String result = (String) object.fileRead().get(string2);
		click_button(searchtab);
		assert_element(result);
	}
	
	@And("Click on {string} having desired product")
	public void click_on_having_desired_product(String string)throws Exception 
	{
	    String element = (String) object.fileRead().get(string);
		parent = driver.getWindowHandle();
		click_button(element);
		switchToWindow(parent);
	}
    
	@And("Check if {string} is present as {string}")
	public void check_if_is_present_as(String string, String string2)throws Exception
	{
	    String element = (String) object.fileRead().get(string);
	    String text = (String) object.fileRead().get(string2);
        assert_text(element, text);
	}

	@And("Click on {string} and change the quantity to {string}")
	public void click_on_and_change_the_quantity_to(String string, String string2)throws Exception 
	{
	    String element = (String) object.fileRead().get(string);
	    String quantity = (String) object.fileRead().get(string2);
		click_button(element);
	    dropdown(element, quantity);
	}

	@And("Click on {string}")
	public void click_on(String string)throws Exception
	{
	    String element = (String) object.fileRead().get(string);
		click_button(element);
	}

	@And("Check if {string} element is present")
	public void check_if_element_is_present(String string) throws Exception
	{
	    String element = (String) object.fileRead().get(string);
		assert_element(element);;
	}

}
