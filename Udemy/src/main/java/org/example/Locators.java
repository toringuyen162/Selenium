package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();

        //xpath = //Tagname[@attribute='value']
        //e.g. //input[@placeholder='Name']
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
        //css selector =  Tagname[attribute='value']
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@qa.team");
        driver.findElement(By.cssSelector("//input[type='text'][2]")).clear();
        //Nếu có nhiều item thì có thể sử dụng HTML index

    }
}
