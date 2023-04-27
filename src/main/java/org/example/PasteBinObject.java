package org.example;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class PasteBinObject
{
    WebDriver driver;
    public PasteBinObject(WebDriver driver){
        this.driver=driver;
    }
    By textArea=By.xpath("//textarea[@id='postform-text']");
    By pasteExpiration= By.id("select2-postform-expiration-container");
    By time=By.xpath("//li[text()='10 Minutes']");
    By title=By.xpath("//input[@id='postform-name']");
    By button=By.xpath("//button[contains(text(),'Create New Paste')]");

    public void scroll(){
        JavascriptExecutor jsExecutor=(JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,360)","");
    }
    public void writeTextInToNewPasteField(String text) throws InterruptedException {
        driver.findElement(textArea).sendKeys(text);
        Thread.sleep(1000);
    }
    public void selectPasteExpiration() throws InterruptedException {
        driver.findElement(pasteExpiration).click();
        Thread.sleep(1000);
        driver.findElement(time).click();
        Thread.sleep(1000);
    }
    public void writeTextInToTitleField(String text) throws InterruptedException {
        driver.findElement(title).sendKeys(text);
        Thread.sleep(1000);
    }
    public void pressCreateNewPasteButton(){
        driver.findElement(button).click();
    }


}
