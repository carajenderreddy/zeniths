import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("carajenderreddy@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("jyothiraj43");
		driver.findElement(By.id("u_0_2")).click();//alpha neumeric id's may change in every refresh so verify before using it
		//every object may not have id or css or xpath
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		
	}

}
