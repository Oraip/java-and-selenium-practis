import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","D:\\New folder\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://leaders.jo/en/");
		   driver.manage().window().maximize();
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).click();
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).sendKeys("black" + Keys.ARROW_DOWN );
		   driver.findElement(By.xpath("//*[@id=\"dgwt-wcas-search-input-3\"]")).sendKeys(Keys.ENTER );

	}

}
