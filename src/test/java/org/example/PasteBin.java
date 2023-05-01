package org.example;

import com.Browser.BrowserParameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PasteBin {
    @Test
    public void PasteBin() throws InterruptedException {
        WebDriver driver= BrowserParameter.setupBrowser("chrome","https://pastebin.com/");

        PasteBinObject pasteBinObject=new PasteBinObject(driver);

        pasteBinObject.writeTextInToNewPasteField("Hello from WebDriver");
        pasteBinObject.scroll();
        pasteBinObject.selectPasteExpiration();
        pasteBinObject.writeTextInToTitleField("helloWeb");
        pasteBinObject.pressCreateNewPasteButton();
    }
}
