package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class GoogleCloud {
    ChromeDriver driver = new ChromeDriver();

    @Test
    public void GoogleCloud() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver.get("https://cloud.google.com/");
        driver.manage().window().maximize();
        GoogleCloudObject calculatorPage=new GoogleCloudObject(driver);
        calculatorPage.homePage();
        calculatorPage.sendKeyInToNumberOfInstancesField("4");
        calculatorPage.selectSeriesOfMachine();
        calculatorPage.selectMachineType();
        calculatorPage.clickAddGpusCheckBox();
        calculatorPage.selectGpuType();
        calculatorPage.selectNumberOfGpus();
        calculatorPage.selectLocalSsd();
        calculatorPage.selectDataCenterLocation();
        calculatorPage.selectCommittedUsage();
        calculatorPage.pushAddToEstimate();
    }
}
