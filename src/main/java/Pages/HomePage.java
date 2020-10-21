package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebDriver test;
	
	public HomePage (WebDriver test) {
		
		this.test = test;
	
	}
	
	public void searchProduct(String product) {
		
		WebElement element = test.findElement(By.xpath("//input[@id='inpHeaderSearch']"));
		element.sendKeys(product);
		test.findElement(By.xpath("//span[@id='btnHeaderSearch']")).click();
		
	}

}
