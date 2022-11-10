import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.Chrome.driver","D:\\New folder\\chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://leaders.jo/en/");
	   driver.manage().window().maximize();
	  driver.findElement(By.className("my-account")).click();
      
//	  driver.findElement(By.id("reg_email")).click();
	//  Thread.sleep(3000);
	  driver.findElement(By.id("reg_email")).sendKeys("Oraib.alrabie97@gmail.com");
	 // driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys("Oraip97$%*");
	  driver.findElement(By.xpath("//*[@id=\"billing_birth_date\"]")).sendKeys("12/11/1997");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[5]/button")).click();

	}

}
