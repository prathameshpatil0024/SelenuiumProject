package datepickernew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PhpTravel {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String date = "24";
        String month = "august";
        String year = "2022";

        //open calender
        driver.findElement(By.id("datepicker1")).click();
        //selected month
        String setMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month'][1]")).getText();
        //selected year
        String setYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

        if (setMonth.equals(month) && setYear.equals(year)) {
            //select date
////date not select

            List<WebElement> allDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody[1]//tr//td"));

            for(WebElement ele:allDate){
                if(ele.getText().equals(allDate)){
                    break;
                }

        } Thread.sleep(3000);
            driver .close();

        }
    }
}
