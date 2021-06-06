import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoDaddyBeginer {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.godaddy.com/");
		driver.manage().window().maximize();
		if(driver.getTitle().contentEquals("Domain Names, Websites Hosting & Online Marketing Tools - GoDaddy IN"))
        {
	     System.out.println("Page title is correct");
        }
        else
        {
        	System.out.println("Not matching");
        }
		
	   if(driver.getCurrentUrl().contentEquals("https://in.godaddy.com/"))
       {
		   System.out.println("Matched");
	   }
	   else
	   {
		   System.out.println("Not matched");
	   }
		
	if(driver.getPageSource().contains("https://in.godaddy.com/"))
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
		//driver.close();
	
	}

}
