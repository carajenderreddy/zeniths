import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		//Dynamic Dropdowns
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).click();
		driver.findElement(By.cssSelector("a[value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		
		
		
		//Checkboxes
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.print(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		//the above step is made to see if it is checked and gives result as true/false
		
		
	
		
		
		
	}

}
