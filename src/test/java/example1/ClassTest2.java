package example1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassTest2 {
	@Test(invocationCount=1)
	public void sucess2()
	{
System.setProperty("webdriver.chrome.driver","C:\\Users\\bibek\\Downloads\\chromedriver.exe");		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30l,TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
	
		////printing only 1 column all value
		//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[2]/td"));
	//printing only all value
			//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr/td"));
			//printing only 1 row all value
			//List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[3]"));
			//printing only 1 row all value
			List<WebElement> list=driver.findElements(By.xpath(".//*[@id='pnl_Bse']/table/tbody/tr[2]/td[1]"));
			
		for(int i=0; i<list.size();i++)
		{
		System.out.println(list.get(i).getText());	
		}
		

}
}
