import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dem1 {
WebDriver driver;
String DepVal="March 2022";

	public Dem1() {
		System.out.println("cnstructr");
	}
	@Test
	public void test5() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='checkin']")).click();
		WebElement ele=driver.findElement(By.xpath("//*[@id='fadein']/div[3]/div[1]/table/thead/tr[1]/th[2]"));
		//ele.click();
		System.out.println(ele.getText());
	
	while(true)
	{
		if(DepVal.equals(ele.getText())) {
			break;
		}
		else{
			WebElement ele1 = (WebElement) driver.switchTo().window("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i");
			ele1.click();
			Thread.sleep(1000);
		}
	
		}
	driver.findElement(By.xpath("//*[@id='fadein']/div[3]/div[1]/table/tbody/tr[1]/td[7]")).click();
	System.out.println("elsecase  *************************");
	}
}
