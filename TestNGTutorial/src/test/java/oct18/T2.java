package oct18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {

	@Test
	public void m1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mlw.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'LICENSING')])[2]")).click();
		System.out.println(driver.findElement(By.cssSelector("h1.entry-title")).getText());
		
		List<WebElement> elements=driver.findElements(By.cssSelector("div.theiaPostSlider_preloadedSlide>p"));
		
		for(WebElement ele:elements) {
			System.out.println(ele.getText());
		}

		System.out.println("I am the best expert on the Planet");
		driver.close();
		
	}
}
