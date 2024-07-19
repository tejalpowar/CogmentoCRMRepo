package BaseLayer;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class BaseClass {
	protected static Properties prop;
	protected static WebDriver driver;

	public BaseClass() {
		// create object of Properties class
		prop = new Properties();
		// capture path
		String path = System.getProperty("user.dir") + "/src/main/java/ConfigurationLayer/config.properties";

		try {
			// read all file content by creating object of FileInputStream class
			FileInputStream fis = new FileInputStream(path);
			// load file in current class using load() method
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// connect to actual browser
		// up casting
		driver = new ChromeDriver();
		// implicitly Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// page load time out
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

		// maximize
		driver.manage().window().maximize();

		// delete all cookies
		driver.manage().deleteAllCookies();

		// capture URL from properties file

		String url = prop.getProperty("URL");

		// open a url
		driver.get(url);

	}

}
