import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("i love you");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("jyothi");
		// regular expression - //tagname[contains(@attribute,'value')]
		driver.findElement(By.xpath("//input[contains(@id,'u')]")).click();
		driver.findElement(By.xpath("//div[@id='loginform']/div/input")).sendKeys("love you again");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("jyo");
		driver.findElement(By.cssSelector("button#loginbutton")).click();
		//driver.findElement(By.xpath("")
		
		// tagname[attribute='value'], [attribute='value']  - this still works without tagname
		// tagname#id,	#id
		// tagname.classvalue,	.classname , use .if any space present in the value
		
		
	
	
	}

}

