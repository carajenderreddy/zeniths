import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		
		driver.get("https://www.makemytrip.com/");
		//when the elements go invisible but present in the script
		System.out.println("Before clicking on the multi city button");
		System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());
		System.out.println("After Clicking on the multi city buttorn");
		driver.findElement(By.xpath("//label[contains(text(),'multi-city')]")).click();
		System.out.println(driver.findElement(By.cssSelector("input#hp-widget__return")).isDisplayed());

		
		
		
		
		
	}

}
