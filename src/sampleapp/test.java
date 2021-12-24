package sampleapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sv95s\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver dr = new ChromeDriver();
        String baseUrl = "https://www.youtube.com";
        dr.get(baseUrl);
        dr.manage().window().maximize();
        int min = 0;
        int max = 5;
        int randomNumber = (int)(Math.random()*(max-min+1)+min);
//        System.out.println(randomNumber);
        List<WebElement> li = dr.findElements(By.id("thumbnail"));;
//        System.out.println(li);
        li.get(randomNumber).click();
        String at = dr.getTitle();


        String et = "YouTube";
        if(at.equalsIgnoreCase(et)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
    }
}
