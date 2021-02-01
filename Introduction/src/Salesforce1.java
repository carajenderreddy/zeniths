import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		
		//customized xpath creation
		//: //tagname[@attribute='value']  ; //*[@attribute='value']
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123456");
		//driver.findElement(By.className("button r4 wide primary")).click();//compound class names are not permitted
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		
		
		
		// customized css selecor creation
		// tagname[attribute='value']   ;  tagname#id  ; tagname.class
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("ilu");
		driver.findElement(By.cssSelector("input[name='pw']")).sendKeys("123456");
		driver.findElement(By.cssSelector("a[id='forgot_password_link']")).click();
		System.out.println(driver.findElement(By.cssSelector("li[class='mb8']")).getText());
		
		
		driver.get("http://www.rediff.com/");
		// reqular expression for cssselector ;  tagname[attribute*='value']
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("i love you");
		driver.findElement(By.cssSelector("input#password")).sendKeys("jyothi");
		// regular expression for xpath  ;  //tagname[contains[@attribute,'value']]
		driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click();
		
		//parent child xpath creation
		//driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//div[@class='1st-c']/div/div[2]/div/input")).sendKeys("i did it");
		
		
		
		
		
		
		
	}

}
