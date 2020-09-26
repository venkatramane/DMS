package mainBasePack;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassProp {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseClassProp(){
		prop=new Properties();
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\VENKATRAMAN\\workspace\\greenDms\\src\\main\\java\\propertiesFiles\\config.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initalization(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VENKATRAMAN\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
	}
	
	
	
	

}
