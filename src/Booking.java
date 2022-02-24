import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.w3c.dom.stylesheets.LinkStyle;

public class Booking {
	private static final boolean flase = false;
	WebDriver driver;
	
	
	@Test(enabled=flase)
	public void book() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-hotels_city-container\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='fadein']/span/span/span[1]/input")).sendKeys("Block");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-hotels_city-results\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr[2]/td[6]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[4]/div[1]/table/tbody/tr[3]/td[4]")).click();
	}
	//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th/following-sibling::th[text()='December 2022']
	
	@Test(enabled=flase)
	
	//ul[@class='select2-results__options']/li
	
	public void note() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"select2-hotels_city-container\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='fadein']/span/span/span[1]/input")).sendKeys("Bloo");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		//Thread.sleep(1000);
		String s="April 2022";
		int Date=21;
		
		WebElement a=driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[2]"));
		
		while(true)
		{
			if(s.equals(a.getText()))
			{
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/tbody/tr[4]/td[5]")).click();
				break;
				}
			else
			{
				
				
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
			}
		}
	}
	@Test(enabled=flase)
	public void note1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();
		
		driver.findElement(By.xpath("//div[@class='datepicker dropdown-menu'][2]/div[1]/table/thead/tr[1]/th/following-sibling::th[text()='December 2022']")).click();
	}
	
	@Test(enabled=flase)
	public void note12() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.phptravels.net");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"hotels-search\"]/div/div/div[3]/div/div/div/a")).click();
		Thread.sleep(1000);
		WebElement ele=driver.findElement(By.xpath("//select[@class='form-select nationality']"));
		Thread.sleep(1000);
		Select select=new Select(ele);
		select.selectByIndex(5);
		}
	@Test(enabled=flase)
	public void dynamicTable()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupb");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	List<WebElement> eles=	driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
	System.out.println("Size    : "+eles.size());
	
	List<WebElement> eles1=	driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td"));
	System.out.println("Size    : "+eles1.size());
		for(int i=0;i<eles1.size();i++)
		{
			System.out.println(eles1.get(i).getText());
		}
	
		String s=driver.findElement(By.xpath("//a[contains(text(),'Nahar Capital & Fina')]/parent::td/following-sibling::td[3]")).getText();
		System.out.println("Value    :  " +s);
	}
	
	@Test(enabled=flase)
	public void dynamicTable1() throws ParseException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupb");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement>elels11=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Rws    :  " +elels11);
		ArrayList<Integer>array=new ArrayList<Integer>();
		for(int i=1;i<=elels11.size();i++)
		{
		String first="//table[@class='dataTable']/tbody/tr[";
		String second="]/td[4]";
		String finalx=(first+i+second);
		String str=driver.findElement(By.xpath(finalx)).getText();
		//System.out.println("Price    :  " +str);
		NumberFormat n=NumberFormat.getNumberInstance();
		Number num=n.parse(str);
		 str = num.toString();
		 
		 System.out.println("Price    :  " +str);
		Double m=Double.parseDouble(str);
		
	int currPrice=	m.intValue();
	array.add(currPrice);
	
		}
		Collections.sort(array);
		System.out.println("array    :  " +array);
	System.out.println("small    :  " +array.get(0));
	System.out.println("large    :  " +(array.get(array.size()-1)));
	}
	@Test(enabled=flase)
	public void PrintdynamicTable() throws ParseException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupb");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		String ele = "//table[@class='dataTable']/tbody/tr";	
		int rows = driver.findElements(By.xpath(ele)).size();
		System.out.println("rows " +rows); 
		String ele1 = "//table[@class='dataTable']/tbody/tr[1]/td";	
		int cols = driver.findElements(By.xpath(ele1)).size();
		System.out.println("cols " +cols); 
		
		String f1="//table[@class='dataTable']/tbody/tr[";
		String f2="]/td[";
		String f3="]";
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				String finalp=f1+i+f2+j+f3;
				String text=driver.findElement(By.xpath(finalp)).getText();
				System.out.print(text +" |  " );
			}
			System.out.println();
		}
		
	}
	@Test(enabled=flase)
	public void allLinks() throws ParseException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://money.rediff.com/gainers/bsc/daily/groupb");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> le=driver.findElements(By.xpath("//a"));
		
		ArrayList data = new ArrayList<>();
		for(int i=0;i<le.size();i++)
			
		{
			data.add(le.get(i).getAttribute("href"));
			
			String s=le.get(i).getText();
			System.out.println(s+" ");
			System.out.println(le.get(i).getAttribute("href"));
			
		}
				
		System.out.println(data.size());
		
	}
	
	@Test(enabled=false)
	public void radioButtn() throws ParseException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.monsterindia.com/seeker/registration?");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input[name='fullname']")).sendKeys("Divya");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("divyasunkari9501@gmail.com");
        driver.findElement(By.cssSelector("input[name='Mobile Number']")).sendKeys("9912034554");
        WebElement m = driver.findElement(By.xpath("//div[@class='multiselect__spinner']/following-sibling::input"));
        JavascriptExecutor jse = (JavascriptExecutor) driver;
       // jse.executeScript("arguments[0].click();", m);
        //jse.executeScript("document.getElementByxpath('//div[@class='multiselect__spinner']/following-sibling::input'.value='testuser')");  
        
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
      //set the text
    //  jsExecutor.executeScript(document.getElementByxpath("//div[@class='multiselect__spinner']/following-sibling::input')).value='testuser'");  
        //driver.findElement(By.xpath("//div[@class='multiselect__spinner']/following-sibling::input")).sendKeys("Hy");
       // Thread.sleep(3000);
        // driver.findElement(By.xpath("//div[@class='multiselect__spinner']/following-sibling::input")).click();
         //Thread.sleep(3000);
        //driver.findElement(By.xpath("//div[@class='multiselect__spinner']/following-sibling::input")).sendKeys("Hy");
        /*List<WebElement> cc=driver.findElements(By.xpath("ul/li"));
        System.out.println(cc.size());
        for(int i=0;i<cc.size();i++) {
        	System.out.println(cc.get(i).getText());
        }*/
       driver.findElement(By.xpath("//div[@class='multiselect__select modal-ref-class']")).click();
        Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='multiselect__content-wrapper ac_results custom-v-scroll modal-ref-class']/ul/li[6]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='multiselect modal-ref-class']/div[@class='multiselect__select modal-ref-class']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[2]/div[7]/div/div[2]/div/div/div/div[3]/ul/li[3]/span/span/span")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@class='multiselect__tags modal-ref-class single-selected boxWrapper']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='skillInput']")).click();
		driver.findElement(By.xpath("//*[@id='skillInput']")).sendKeys("Java");
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[1]/div[1]/div/div/div[2]/ul/li")).click();
		driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div")).click();
		driver.findElement(By.xpath("//div[@class='multiselect__select modal-ref-class']")).click();
		List<WebElement>ls=driver.findElements(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[3]/ul/li"));
		System.out.println("Size "+ls.size());
		
		for(int i=0;i<ls.size();i++)
		{
			System.out.println(ls.get(i).getText());
			if(ls.get(i).getText().equals("Alternate Energy")) {
				driver.findElement(By.xpath("//*[@id=\"registerThemeDefault\"]/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[3]/ul/li[3]/span/span/span")).click();
				Thread.sleep(1000);
				
			}
			
			}
		
		JavascriptException js=(JavascriptException)driver;
		((JavascriptExecutor) js).executeScript("arguments[0].click()",driver.findElement(By.xpath("//*[@id='registerThemeDefault']/div/div[3]/div/div/div/form/div[3]/div[2]/div[2]/div[1]/div/div[1]")));
		
		
 		
		
	}	
	
	@Test
	public void dropDown() throws ParseException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Divya\\eclipse-workspace\\Classw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	 WebElement ele = driver.findElement(By.xpath("//*[@id=\"selectMenuContainer\"]/div[7]/div/div/div/div[1]"));
	 Select se=new Select(ele);
	 if(se.isMultiple())
	 {
		 se.selectByIndex(2);
		 se.selectByIndex(3);
		 se.selectByIndex(4);
	 }
	
	}
}