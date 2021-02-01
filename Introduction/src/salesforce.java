import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		/*driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("123456");*/
		//driver.findElement(By.className("button r4 wide primary")).click();//compound class names are not permitted
		
		//xpath, css generation and usage
		
		//driver.findElement(By.xpath("//*[@id='Login']")).click();
		driver.findElement(By.cssSelector("#username")).sendKeys("ilu");
		driver.findElement(By.xpath("//*[@id=\'password\']")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\'forgot_password_link\']")).click();
		System.out.println(driver.findElement(By.cssSelector("div.message")).getText());

		
		
	}

}
