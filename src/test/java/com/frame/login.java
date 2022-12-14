package com.frame;

import com.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login {
	protected WebDriver driver;
	public login(WebDriver driver) {
		this.driver = driver;	
	}
	
	@FindBy(name="username")
	public WebElement username;
	
	
	
	public void URL_intake() {
		driver.get("https://stag2-rce-dashboard.gkim.digital/");
	}
	
	public void pss(String password) 
	{
		username.sendKeys("dac+3@gkxim.com");
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dac+3@gkxim.com");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='submit_login']/div/div[4]/button")).click();
		System.out.println("--------------------Login PSS success.------------------------");
		Common.waitSec(3);
		driver.findElement(By.xpath(".//div[@class='rce-pl-20 rce-pr-20 col d-flex flex-column']/div[2]/div[2]/div/div/div[1]/div[2]/button")).click();
	}

	public void intake(String password) 
	{
		username.sendKeys("dac+1@gkxim.com");
//		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dac+3@gkxim.com");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='submit_login']/div/div[4]/button")).click();
		System.out.println("--------------------Login Intake success.------------------------");
	}
	public void provider(String password) {
		driver.findElement(By.xpath("//*[@id='username']")).sendKeys("dac+2@gkxim.com");
		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='submit_login']/div/div[4]/button")).click();
		System.out.println("-------------------Provider login success---------------------");
	}
}
