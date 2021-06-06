import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class EndToEndByOrderFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		//System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.manage().window().maximize();
		Actions a = new Actions(driver);
		WebElement Women=driver.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]"));
	    a.click(Women).build().perform();
	    driver.findElement(By.xpath("//ul[@class='product_list grid row']/li[2]/div/div //img[@class='replace-2x img-responsive']")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.xpath("//p[@id='quantity_wanted_p'] //a[@class='btn btn-default button-plus product_quantity_up']")).click();
	    Select s= new Select(driver.findElement(By.id("group_1")));
	    s.selectByValue("3");
        driver.findElement(By.id("color_8")).click();
        driver.findElement(By.xpath("//button[@name='Submit']")).click();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//a[@title='Proceed to checkout'][1]")).click();
        
	}
}
