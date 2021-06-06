import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;



public class SpiceJet {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
WebDriver driver=new ChromeDriver();  //WebDriver is the interface and ChromeDriver() is the class of WebDriver interface.
driver.manage().window().maximize();   //Maximize the Window

//Implicit wait applies throughout the driver object execution.
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
driver.get("https://book.spicejet.com/");  // Execution of the URL
System.out.println(driver.getTitle());  // Prints the title of the webpage

//Dynamic dropdown
//Click on the dropdown element
driver.findElement(By.xpath("//input[contains(@id,'InputSearchVieworiginStation1')]")).click();
//Click on from city
driver.findElement(By.xpath("//a[@value='GOI']")).click();
//click on to city. 
/*Here we have used parent child relationship locator because two drodwnn contains same 
element name once second dropdown gets activated its shows two  matching elements.*/
driver.findElement(By.xpath("//div[@id='glsControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTNR'] //a[@value='COK']")).click();

//Date selection from calandar
//WebDriverWait w = new WebDriverWait(driver,20);
//w.wait();
Thread.sleep(20000); 
while(!(driver.findElement(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //div[@class='ui-datepicker-title']"))).getText().contains("May"))
{

	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

}

List <WebElement>datesfirst=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first'] //table[@class='ui-datepicker-calendar'] //a"));

int a=datesfirst.size();
for(int i=0; i<a; i++)
{
	if (datesfirst.get(i).getText().contentEquals("25"))
	{
		
		datesfirst.get(i).click();
		break;
    }
}


driver.findElement(By.id("divpaxinfo")).click();
WebElement adult =driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT"));
org.openqa.selenium.support.ui.Select adultselect = new org.openqa.selenium.support.ui.Select(adult);
adultselect.selectByValue("2");

WebElement child =driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD"));
org.openqa.selenium.support.ui.Select childselect = new org.openqa.selenium.support.ui.Select(child);
childselect.selectByValue("1");

WebElement infant =driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT"));
org.openqa.selenium.support.ui.Select infantselect = new org.openqa.selenium.support.ui.Select(infant);
infantselect.selectByValue("2");


WebElement currency =driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency"));
org.openqa.selenium.support.ui.Select currencyselect = new org.openqa.selenium.support.ui.Select(currency);
currencyselect.selectByValue("AED");

File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src,new File("D:\\Beforesubmit.png"));

driver.findElement(By.cssSelector("input[name='ControlGroupSearchView$AvailabilitySearchInputSearchView$ButtonSubmit']")).click();
File src1= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(src1,new File("D:\\Aftersubmit.png"));
	
	}

}
	

