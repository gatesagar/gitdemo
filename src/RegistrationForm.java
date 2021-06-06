import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class RegistrationForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);  //Implicit wait
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.className("login")).click();
		driver.findElement(By.id("email_create")).sendKeys("gatesaagr2@gmail.com");
		driver.findElement(By.cssSelector("button[id='SubmitCreate']")).click();
		
		//Form fill
		
		driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
	
	    driver.findElement(By.id("customer_firstname")).sendKeys("Sagar");
	    driver.findElement(By.id("customer_lastname")).sendKeys("Gate");
		driver.findElement(By.id("passwd")).sendKeys("Sagar@10");
		WebElement drpdwndays=driver.findElement(By.id("days"));
     	Select day=new Select(drpdwndays);
		day.selectByValue("21");
		WebElement drpdwnmonth=driver.findElement(By.id("months"));
     	Select month=new Select(drpdwnmonth);
		month.selectByIndex(11);
		WebElement drpdwnyears=driver.findElement(By.id("years"));
     	Select years=new Select(drpdwnyears);
		years.selectByValue("2008");
		
		//Address
		driver.findElement(By.id("company")).sendKeys("BHEL");
		driver.findElement(By.id("address1")).sendKeys("Gachobowli");
		driver.findElement(By.id("city")).sendKeys("HYB");
		Select state=new Select(driver.findElement(By.id("id_state")));
		state.selectByIndex(5);
		driver.findElement(By.id("postcode")).sendKeys("00000");
		driver.findElement(By.id("other")).sendKeys("Other");
		driver.findElement(By.id("phone_mobile")).sendKeys("439847879");
		driver.findElement(By.id("alias")).sendKeys("House");
		driver.findElement(By.id("submitAccount")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText());
		
		
		
		
		
		
		
		
		
		
		

	}

}
