package oct18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T1 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://nts.com/");
		System.out.println(driver.findElement(By.cssSelector("a.logo.pull-left")).isDisplayed());
		driver.findElement(By.xpath("//span[text()='Services']")).click();
		System.out.println(driver.findElement(By.xpath("//h2")).getText());
		System.out.println(driver.findElement(By.xpath("//h2/following-sibling::p")).getText());
		System.out.println("I am the best expert on the Planet");
		driver.quit();

	}
}
