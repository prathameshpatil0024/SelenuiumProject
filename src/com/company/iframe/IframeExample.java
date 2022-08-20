package com.company.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IframeExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        System.out.println(driver.findElements(By.tagName("iframe")).size());

        WebElement element=driver.findElement( By.xpath("//iframe[@id='frame1']"));

        driver.switchTo().frame(element);

        System.out.println(driver.findElement(By.xpath("//h1[text()='This is a sample page']")).getText());

        driver.close();
    }
}
