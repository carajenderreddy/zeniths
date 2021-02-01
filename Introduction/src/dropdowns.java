import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Static dropdowns
		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		// If you want to accees any methods in class ,create object for that class and access methods
		//using object.method
		//static drop down and when the tag is select only this will work
		Select s=new Select(driver.findElement(By.id("month")));
		s.selectByValue("3");
		Select d=new Select(driver.findElement(By.id("day")));
		d.selectByIndex(28);
		Select y=new Select(driver.findElement(By.id("year")));
		y.selectByVisibleText("1991");
		
		
		
		
		
		
		
		
		
		
		
	}

}
