import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		
		//this is done only when there is a java pop up if there is html we can get the location normally and click on the button
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		//to get the text from the pop up/alert
		System.out.println(driver.switchTo().alert().getText());
		
		//if there is edit box then to write some thing in there use bolow
		//driver.switchTo().alert().sendKeys("kjhkjasdhfh");
		
		driver.switchTo().alert().accept();// accept means yes but if there are two buttons yes or no then for the adverse do as below
		//driver.switchTo().alert().dismiss();
		
	}

}
