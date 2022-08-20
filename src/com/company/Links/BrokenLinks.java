package com.company.Links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks {
    public void main (String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\priyanka\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.deadlinkcity.com/");
        driver.manage().window().maximize();
        /** Broken  links means When We click on the link, the link does not have target page in server called broken link.
          And found error code (ex404) page error.this links called broken links.
         If the number greater than error code 400 then We said it is broken links.
          **/

           //collect all the links
        List<WebElement> links=driver.findElements(By.tagName("a"));

        for(WebElement element :links){
            //store href attribute in url variable.cause href is a url value.
           String url=element.getAttribute("href");
          //href attribute hv no url then show null or empty. it is not broken link not a normal link.
            // to check the url is empty or not we use if condition.
            if(url==null|| url.isEmpty()){
                System.out.println("url is empty");
                continue;
            }

            //url is a string format to convert to url link format we use URL  class.
            URL  link=new URL(url);
            // href attribute hv link, then it send to url request to server.
            //for that to send the url request to server we use HttpURL Connection class.
            HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();


    }
}
