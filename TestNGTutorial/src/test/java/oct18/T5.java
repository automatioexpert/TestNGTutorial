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

public class T5 {

	@Test
	public void m1() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://state.bihar.gov.in/mwrd/CitizenHome.html");
		driver.findElement(By.cssSelector("a#incfont")).click();
		driver.findElement(By.cssSelector("input#search_input")).sendKeys("water" + Keys.ENTER);

		
		List<WebElement> ele = driver.findElements(By.cssSelector("ul.search-list.searchResult>li"));
		for (WebElement el : ele) {
			System.out.println(el.getText());
		}
		
		Thread.sleep(5000);

	}
}
