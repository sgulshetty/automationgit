package example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTest1 {
	@Test(invocationCount=1)
	public void sucess()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");		
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
	//editing this
	String atitle=driver.getTitle();
	String etitle="Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	Assert.assertEquals(atitle, etitle);//AssertEquals will check exact content.
	
	System.out.println("passed");
	}
}
