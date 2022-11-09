package StepDefination_1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class actionDriver2 
{
	static WebDriver driver;

	public void assert_element(String ispresent)
	{
		  //driver.findElement(By.cssSelector(ispresent)).isDisplayed();
	      WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(8));
	      w.until(ExpectedConditions.presenceOfElementLocated (By.cssSelector(ispresent)));

	}

	public void assert_text(String string,String string2)
	{
		String ActualText = driver.findElement(By.cssSelector(string)).getText();
		Assert.assertEquals(ActualText ,string2);
	}

	public void click_button(String element)
	{
		driver.findElement(By.xpath(element)).click();
	}


	public void type(String element, String Product)
	{
		driver.findElement(By.id(element)).sendKeys(Product);
	}

	public void dropdown(String string, String string2)
	{
		Select dropdown = new Select(driver.findElement(By.xpath(string)));  
		dropdown.selectByValue(string2);
	}
	public void scroll() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(5000);
	}
	
	public void switchToWindow(String Parent)
	{
		Set<String> newWindow = driver.getWindowHandles(); 
		
		for(String child : newWindow)
		{
			if(!Parent.equalsIgnoreCase(child)) 
			{
				driver.switchTo().window(child);
			}
		}

	}


}
