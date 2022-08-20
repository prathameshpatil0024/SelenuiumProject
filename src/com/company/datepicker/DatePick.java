package com.company.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePick {
    public static WebDriver driver;
   /* public static void selectCities(String city,String sourceordestination){
        List<WebElement >listofCities;

        if(sourceordestination.equals("sources")) {
            driver.findElement(By.id("source")).sendKeys("cities");
            listofCities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
        } else{
//            (driver.findElement(By.id("destination")).sendKeys("cities");
            listofCities =driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        }
        for (WebElement s:listofCities  ){
           if (s.getText().equals(city )){
                s.click();
                break;
            }
        }
    }

   */         public static void main(String[] args) throws InterruptedException {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://www.abhibus.com/");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
/*
                selectCities("pune","source");
                selectCities("mumbai","destination") ;
//*/
//                 driver.findElement(By.id("datepicker1"));
                 String setdate="28";
                 String  setmonth="july";
                 String  setyear="2022";

                 driver.findElement(By.id("datepicker1")).click();   //opens the date picker

                // for select month
                 String month=driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'][1]")).getText();

                 //for select year
                 String year=driver.findElement(By.xpath("(//span[@class='ui-datepicker-year'][1])")).getText();

                    // date selection
                     List<WebElement> allDate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//child::tbody/tr/td"));
                     for(WebElement date: allDate){
                         if(date.getText().equals(setdate)){
                             date.click();
                             break;
                         }
                     } Thread.sleep(5000);
                     driver.close();
                 }


}


