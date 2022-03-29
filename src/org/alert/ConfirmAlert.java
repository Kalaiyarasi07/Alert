package org.alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Day8Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement btn1 = driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']"));
		btn1.click();
		WebElement btn2 = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
		btn2.click();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	
	
	}

}
