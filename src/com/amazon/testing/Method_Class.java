package com.amazon.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Method_Class {

	static WebDriver driver;
	
	public void amazonlaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver= new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
	}
	
	public void amazonlogin() throws InterruptedException
	{
		WebElement login = driver.findElement(By.xpath("//span[contains(text(),'Hello. Sign in')]"));
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(3000);
		WebElement signin = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		signin.click();
		WebElement email = driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("sudip00780@gmail.com");
		WebElement cont = driver.findElement(By.xpath("//input[@id='continue']"));
		cont.click();
		WebElement passwrd	=driver.findElement(By.xpath("//input[@id='ap_password']"));
		passwrd.sendKeys("sudbasuray");
		WebElement cont2 =driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		cont2.click();	
	}
	
	public void shop() throws InterruptedException
	{
		WebElement shopbycatagory =driver.findElement(By.xpath("//span[contains(text(),'Category')]"));
		Actions act1 =new Actions(driver);
		act1.moveToElement(shopbycatagory).perform();	
		Thread.sleep(3000);
	}
	
	public void cart()
	{
		WebElement gotocart =driver.findElement(By.xpath("//a[@id='nav-cart']"));
		gotocart.click();
	}
	
	public void logout()
	{
		WebElement logout =driver.findElement(By.xpath("//span[contains(text(),'Account & Lists')]"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(logout).perform();
		WebElement signout = driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]"));
		signout.click();
	}
}
