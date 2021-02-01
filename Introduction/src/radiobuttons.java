import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobuttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

								//-------------code Did not work --------------------------
		
		
		System.setProperty("webdriver.chrome.driver", "c://work//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Butter']")).click();
		//if we dont have unique attribute
		//we should find out the count of the elements present
		//we should use 'findElements' plural to get count
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		for (int i=0; i<count ;i++)
		{
			//driver.findElements(By.xpath("//inputd[name='group1']")).get(i).click();	
		
			String text =driver.findElements(By.xpath("//inputd[name='group1']")).get(i).getAttribute("Value");
			if (text.equals("Cheese"));
			{
				driver.findElements(By.xpath("//inputd[name='group1']")).get(i).click();
			}
			
		}
		
		
	}

}
