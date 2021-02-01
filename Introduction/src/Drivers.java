
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Drivers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","c:\\work\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://google.com");
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());//validate if you are landed on the correct url
	//System.out.println(driver.getPageSource());//to print page source
	driver.get("http://facebook.com");
	driver.navigate().back();
	driver.close();//it closes current browser
	driver.quit();//it closes all the browser opened by selenium
	}

}
