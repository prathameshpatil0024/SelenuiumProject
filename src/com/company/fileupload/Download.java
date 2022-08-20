package com.company.fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Download {
    public static void main(String[] args) throws InterruptedException {
        System .setProperty("webdriver.chrome.driver","C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");
//        driver.get("https://demo.automationtesting.in/FileDownload.html");
        driver .manage() .window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       /* driver .findElement(By.id("textbox")).sendKeys("engineer");
        driver.findElement(By.id("createTxt")).click();
        driver.findElement(By.id("link-to-download")).click();
*/


        WebElement download=driver.findElement(By.xpath("//div[@id='content']//child::a[13]"));
        download.click();
        Thread .sleep(5000);
        driver.close();


    }
}
