import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tplink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://admin:admin@192.168.0.1");
//	driver.navigate().to("http://admin:admin@192.168.0.1");
		
		
		
	}

}
