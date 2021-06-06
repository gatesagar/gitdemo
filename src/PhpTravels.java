import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhpTravels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("https://www.phptravels.net/home");
driver.findElement(By.xpath("//a[@class='text-center flights ']")).click();
//driver.findElement(By.xpath("//div[@class='select2-drop select2-display-none select2-with-searchbox select2-drop-active'] //div[@class='select2-search'])")).click();
driver.findElement(By.xpath("//div[@id='s2id_location_from']")).click();

	}
}
	