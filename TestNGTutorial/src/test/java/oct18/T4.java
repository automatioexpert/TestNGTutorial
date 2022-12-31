package oct18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T4 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://state.bihar.gov.in/mwrd/CitizenHome.html");
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'About Us')]")).getText());
		System.out.println(driver.findElement(By.xpath("//h1[contains(text(),'About Us')]/following-sibling::p")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.designation")).getText());
		System.out.println(driver.findElement(By.cssSelector("p.designation+p")).getText());

	driver.quit();
	}
}
