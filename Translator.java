package com.qainfotech.training.Test_003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Translator {
	WebDriver driver=null;
	@Test
	public void intialize()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aditiagrawal\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://www.bing.com/translator");
	}
	@Test
	public void select_Language()
	{
		Select select = new Select(driver.findElement(By.id("t_sl")));
select.selectByValue("en");
	}
	@Test
	public void translate_Language()
	{
		Select select = new Select(driver.findElement(By.id("t_tl")));
		select.selectByValue("hi");
	}
@Test
public void statement_01() {
	driver.findElement(By.id("t_sv")).sendKeys("Hello world");
}
}
