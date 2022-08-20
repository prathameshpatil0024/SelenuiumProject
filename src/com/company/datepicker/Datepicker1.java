package com.company.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class Datepicker1 {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String date = "24";
        String month = "aug";
        String year = "2022";

        driver.findElement(By.id("onward_cal"));   //open the date picker

        //program not run******
         String setmonth =driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//child::tbody/tr/td[2]")).getText();
//         String setyr=driver




//        List <WebElement > alldates =  driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td"));
          /*  for (WebElement ele : alldates) {
                if (ele.getText().equals(date)) {
                    ele.click();
                    break;
                }*/
            }
        }






