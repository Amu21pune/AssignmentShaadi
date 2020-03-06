import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDemo {

	WebDriver driver;
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\CFLP81\\PycharmProjects\\CFAutomation\\geckodriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.shadi.com/");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDemo obj = new FirstDemo();
		obj.LaunchBrowser();

	}

}
