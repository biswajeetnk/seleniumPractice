package practice.seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class GooglePageClass extends BasePage
{
	public void googleSearch() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium"+Keys.ENTER);
		//driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}
	
	/*public void tearDown()
	{
		driver.quit();
	}*/
}
