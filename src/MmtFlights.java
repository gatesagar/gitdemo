import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class MmtFlights {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.makemytrip.com/");

driver.findElement(By.xpath("//input[@id='fromCity']")).click();
driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("ban");
List<WebElement> fromoptions=driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
for(WebElement fromoption: fromoptions)
{
//System.out.println(fromoption.getText());  
	if (fromoption.getText().contains("Colombo"))
	{
	    fromoption.click();
		break;
	}
}


driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Che");
List <WebElement> tooptions = driver.findElements(By.xpath("//p[@class='font14 appendBottom5 blackText']"));
for(WebElement tooption: tooptions)
{
//System.out.println(tooption.getText());	
if (tooption.getText().contains("Chengdu"))
{
tooption.click();	
break;
}
}
//driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']")).click();
driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10']")).click();
//driver.findElement(By.xpath("//div[@class='travellers gbTravellers']/div[1]/ul[1]/li[4]")).click();
	}

}
