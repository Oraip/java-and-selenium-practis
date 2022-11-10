import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","D:\\New folder\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://leaders.jo/en/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).click();
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).sendKeys("black"+Keys.ARROW_DOWN );
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).sendKeys(Keys.ENTER );
          }
	}


