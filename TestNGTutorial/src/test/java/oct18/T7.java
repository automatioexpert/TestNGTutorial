package oct18;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T7 {
	
	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://state.bihar.gov.in/mwrd/CitizenHome.html");
		driver.findElement(By.cssSelector("a[title='Home']")).click();
		driver.findElement(By.cssSelector("i.fa.fa-align-justify")).click();
		System.out.println("I am the top expert on the Planet");
		driver.close();
	}
}
