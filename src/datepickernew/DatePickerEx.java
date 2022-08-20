package datepickernew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DatePickerEx {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.abhibus.com/");
            driver.manage().window().maximize();

            String setDate = "28";
            String setMonth = "july";
            String setYear = "2022";

            driver.findElement(By.id("datepicker1")).click();   //opens the date picker

            // for select month
            String month = driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'][1]")).getText();

            //for select year
            String year = driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'][1])")).getText();

            // date selection
            if (month.equals(setMonth) && year.equals(setYear)) {

                List<WebElement> allDate = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
                for (WebElement date : allDate) {
                    if (date.getText().equals(setDate)) {
                        date.click();
                        break;
                    }
                }
                Thread.sleep(5000);
                driver.close();
            }
        }
    }




