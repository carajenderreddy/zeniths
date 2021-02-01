import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//create driver object
		/* class name= x
		x driver=new x() */
	System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	
	
	
	System.setProperty("webdriver.ie.driver", "c:\\Work\\MicrosoftWebDriver.exe");
	WebDriver driver1=new InternetExplorerDriver();
	driver1.get("http://google.com");
	System.out.println(driver1.getTitle());
	
	
	/*System.setProperty("webdriver.gecko.driver", "c:\\Work\\geckodriver.exe");
	WebDriver driver2=new FirefoxDriver();
	driver2.get("http://google.com");
	
	System.out.println(driver2.getTitle());*/
	
	
	}
	

}
