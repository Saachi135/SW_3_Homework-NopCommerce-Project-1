package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    public static WebDriver driver;

    public void openBrowser(String baseUrl) {

        // get the chromeDriver
        driver = new ChromeDriver();

        //get the URL
        driver.get(baseUrl);

        //maximise windo
        driver.manage().window().maximize();

    }


    public void closeBrowser() {

        //close multiple browser
        driver.quit();
    }

}
