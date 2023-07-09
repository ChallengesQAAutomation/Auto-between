package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class MyWebDriverFactory {

    public static WebDriver myWebDriver;

    public WebDriver onPage() {
        myWebDriver.manage().window().maximize();
        Path path = Paths.get("src", "test", "resources", "WebSite", "index.html");
        String filePath = path.toAbsolutePath().toString();
        myWebDriver.get("file://" + filePath);
        myWebDriver.manage().deleteAllCookies();
        return myWebDriver;
    }

   public static MyWebDriverFactory web() {
        myWebDriver = getMyWebDriver();
        myWebDriver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
        return new MyWebDriverFactory();
    }

      public static WebDriver getMyWebDriver() {
          System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver");
          ChromeOptions chropts = new ChromeOptions();
          chropts.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
          return new ChromeDriver(chropts);

    }



}


