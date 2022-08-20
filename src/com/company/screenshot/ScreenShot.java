package com.company.screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ScreenShot {
    public static void main(String[] args) throws IOException, InterruptedException {
//       ChromeOptions options=new ChromeOptions();
//    options.setAcceptInsecureCerts(true);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://myntra.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        File s=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE );
        FileHandler.copy(s ,new File("C:\\Users\\priyanka\\Desktop\\capture\\screenshot\\Screenshot_2022-07-13-18-42-49-60.jpg ")) ;
        Thread.sleep(3000);
        driver.close();
    }

}
