package webdriver;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

	private static WebDriver webDriver;
	
	private WebDriverFactory(){
		
	}
	public static WebDriver getInstance(String browser) throws Exception {
		if (webDriver == null) {
			
			switch (browser){
			case "Firefox":
				webDriver = new FirefoxDriver();
				break;
			case "Chrome":
				setChromeDriver();
				webDriver = new ChromeDriver();
				break;	
			default:
				webDriver = new FirefoxDriver();
				break;
			}
		}

		return webDriver;
	}
	
	private static void setChromeDriver() throws Exception {
		
		StringBuffer chromeBinaryPath = new StringBuffer(
				"src/main/resources/drivers/");
			chromeBinaryPath.append("chrome-win/chromedriver.exe");
		

		System.setProperty("webdriver.chrome.driver", chromeBinaryPath.toString());
	}

	public static void killDriverInstance() throws Exception {
		webDriver.quit();
		webDriver = null;
	}
}
