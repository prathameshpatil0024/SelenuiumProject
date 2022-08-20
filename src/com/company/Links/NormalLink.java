package com.company.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class NormalLink {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();

        //locate the links by using linkText and PartialLinkTest locator.
        driver.findElement(By.linkText("Today's Deals")).click();//pass complete value
        driver.findElement(By.partialLinkText("Deals")).click(); //pass some portion of value

        //capture all links by using tag name locator  .....here a is as anchor tag.
       List<WebElement> links=driver.findElements(By.tagName("a"));
        // links present in web page we use size method
        System.out.println("Number of present Links"+links.size());

        //all links get in console we use for loop and for each loop also
        for(int i=0;i<=links.size();i++ ){
           System.out.println(links.get(i).getText());
            System.out.println(links.get(i).getAttribute("href"));
        }
        for(WebElement link:links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        }

    }
}
