package baseclass;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import utilities.ExcelReader;
import utilities.ExtentManager;
import utilities.KeyPaths;




public class baseclass {
	
	    public static WebDriver driver;
		public static Properties pro;
		public static FileInputStream fis;
		public static String browser;
		public static WebDriverWait wait;
		public static Logger log = Logger.getLogger("devpinoyLogger");
		public ExcelReader excel=new ExcelReader(KeyPaths.excelpath);
		public ExtentReports rep = ExtentManager.getInstance();
		public static ExtentTest test;
	 
		
	 
	 public static void setup() throws Exception {
					
		 if (driver == null) {
				
				    fis= new FileInputStream(KeyPaths.configpath);
				    pro=new Properties();
					pro.load(fis);
					log.info("Config file loaded !!!");
					
					String ss=pro.getProperty("browser");
					System.out.println(ss);
					
					//jenkins
					if(System.getenv("browser")!=null && !System.getenv("browser").isEmpty()){
						browser = System.getenv("browser");
					}else{
						browser = pro.getProperty("browser");	
					}
					pro.setProperty("browser", browser);
					
					
			
				if(pro.getProperty("browser").equals("chrome")) {
					
	                System.setProperty(KeyPaths.chromewebdriver,KeyPaths.chrome);
					
					Map<String, Object> prefs = new HashMap<String, Object>();
					prefs.put("profile.default_content_setting_values.notifications", 2);
					prefs.put("credentials_enable_service", false);
					prefs.put("profile.password_manager_enabled", false);
					ChromeOptions options = new ChromeOptions();
					options.setExperimentalOption("prefs", prefs);
					options.addArguments("--disable-extensions");
					options.addArguments("--disable-infobars");
		
					driver = new ChromeDriver(options);
					log.info("launching chrome broswer");
				
				}else if(pro.getProperty("browser").equals("firefox")) {
					
					System.setProperty(KeyPaths.firefoxwebdriver, KeyPaths.firefox);
					driver = new FirefoxDriver();
					log.info("Open firefox driver !!!");
					
			}
			    
				driver.manage().window().maximize();
				driver.get(pro.getProperty("url"));
				log.info("Hit the URL !!!");
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	 }
	 
	 }
   
	 
		public void select(WebElement element, String value) {
			
			Select select = new Select(element);
			select.selectByVisibleText(value);

		}
		

		
		public static void quitBrowser(){
			
			driver.quit();
			
		}
		 
}
