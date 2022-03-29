package org.alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHdfc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Day8Task\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		List<WebElement> frameCount = driver.findElements(By.tagName("frame"));
		int size = frameCount.size();
		System.out.println(size);
		driver.switchTo().frame("login_page");
//		driver.switchTo().frame(0);
//		WebElement findElement = driver.findElement(By.xpath("//frame[@name='login_page']"));
//	    driver.switchTo().frame(findElement);
	    WebElement txtUsername = driver.findElement(By.name("fldLoginUserId"));
	    txtUsername.sendKeys("Kalaiyarasi07");
		
		
		
		
	}

}
