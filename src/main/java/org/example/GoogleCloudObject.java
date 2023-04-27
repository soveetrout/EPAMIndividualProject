package org.example;

import org.openqa.selenium.*;

public class GoogleCloudObject {
    WebDriver driver;
    public GoogleCloudObject(WebDriver driver){
        this.driver=driver;
    }

    private By search=By.xpath("//input[@placeholder='Search']");
    private By searchResult=By.xpath("//div[@class='gs-title']//b[contains(text(),'Google Cloud Pricing Calculator')]");
    private By newFirstFrame = By.xpath("//iframe[contains(@name,'goog_')]");
    private By instancesField = By.xpath("//md-input-container/child::input[@ng-model='listingCtrl.computeServer.quantity']");
    private By seriesOfMachine = By.xpath("//md-select[@name='series']/parent::md-input-container");
    private By seriesOfMachineModel = By.xpath("//md-option[@value='n1']");
    private By machineType = By.xpath("//label[text()='Machine type']/parent::md-input-container");
    private By computeEngine = By.xpath("//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']");
    private By gpusCheckBox = By.xpath("//md-checkbox[@aria-label='Add GPUs']");
    private By gpuType = By.xpath("//md-select[@placeholder='GPU type']");
    private By gpuTypeModel =By.xpath("//md-option[@value='NVIDIA_TESLA_V100']");
    private By numberOfGpus = By.xpath("//md-select[@placeholder='Number of GPUs']");
    private By numberOfGpusModel = By.cssSelector("md-option[value='1'][class='ng-scope md-ink-ripple'][ng-disabled]");
    private By localSsd = By.xpath("//md-select[@placeholder='Local SSD']");
    private By localSsdModel = By.xpath("//md-option[@ng-repeat='item in listingCtrl.dynamicSsd.computeServer'][@value='2']/div[@class='md-text ng-binding']");
    private By dataCenterLocation = By.xpath("//md-select[@placeholder='Datacenter location']");
    private By dataCenterLocationInFrankfurt = By.xpath("//md-option[@value='europe-west3' and contains(@ng-repeat,'computeServer')]");
    private By committedUsage = By.xpath("//md-select[@placeholder='Committed usage']");
    private By oneYearUsage = By.cssSelector("div[class='md-select-menu-container md-active md-clickable']" + " md-option[value='1'][class='md-ink-ripple']");
    private By addToEstimateButton = By.xpath("//form[@name='ComputeEngineForm']//button[contains(text(),'Add to Estimate')]");
    private By informationInVmClassIsRegular = By.xpath("//md-select[@aria-label='VM Class: Regular']");
    private By InformationInInstanceTypeIncludeN1Standard8 = By.xpath("//div[contains (text(),'Instance type: n1-standard-8')]");
    private By regionIsFrankfurt = By.xpath("//div[contains (text(),'Region: Frankfurt')]");
    private By localSsdSpace2x375Gib = By.xpath("//div[@class='md-text'][text()='24x375 GB']");
    private By commitmentTermOneYear = By.xpath("//div[contains (text(),'Commitment term: 1 Year')]");

   public void homePage() throws InterruptedException {
       WebElement r = driver.findElement(search);
       r.sendKeys("Google Cloud Platform Pricing Calculator");
       // press ENTER
       r.sendKeys(Keys.RETURN);
       Thread.sleep(5000);
       driver.findElement(searchResult).click();
       Thread.sleep(10000);
   }
    public void sendKeyInToNumberOfInstancesField(String keyForNumberOfInstances) throws InterruptedException {
        WebElement element = driver.findElement(newFirstFrame);
        driver.switchTo().frame(element);
        driver.switchTo().frame("myFrame");
        Thread.sleep(3000);
        WebElement numberOfInstancesField = driver.findElement(instancesField);
        numberOfInstancesField.sendKeys(keyForNumberOfInstances);
        Thread.sleep(3000);
    }
    public void selectSeriesOfMachine() throws InterruptedException {
        driver.findElement(seriesOfMachine).click();
        Thread.sleep(3000);
        driver.findElement(seriesOfMachineModel).click();
        Thread.sleep(3000);
    }
    public void selectMachineType() throws InterruptedException {
        driver.findElement(machineType).click();
        Thread.sleep(3000);
        driver.findElement(computeEngine).click();
        Thread.sleep(3000);
    }
    public void clickAddGpusCheckBox() throws InterruptedException {
        driver.findElement(gpusCheckBox).click();
        Thread.sleep(3000);
    }
    public void selectGpuType() throws InterruptedException {
        driver.findElement(gpuType).click();
        Thread.sleep(3000);
        driver.findElement(gpuTypeModel).click();
        Thread.sleep(2000);
    }
    public void selectNumberOfGpus() throws InterruptedException {
        driver.findElement(numberOfGpus).click();
        Thread.sleep(3000);
        driver.findElement(numberOfGpusModel).click();
        Thread.sleep(3000);
    }
    public void selectLocalSsd() throws InterruptedException {
        driver.findElement(localSsd).click();
        Thread.sleep(3000);
        driver.findElement(localSsdModel).click();
        Thread.sleep(3000);
    }
    public void selectDataCenterLocation() throws InterruptedException {
        driver.findElement(dataCenterLocation).click();
        Thread.sleep(5000);
        driver.findElement(dataCenterLocationInFrankfurt).click();
        Thread.sleep(5000);
    }
    public void selectCommittedUsage() throws InterruptedException {
        driver.findElement(committedUsage).click();
        Thread.sleep(3000);
        driver.findElement(oneYearUsage).click();
        Thread.sleep(3000);
    }
    public void pushAddToEstimate() throws InterruptedException {
        driver.findElement(addToEstimateButton).click();
        Thread.sleep(3000);
    }
    public void checkInformationInVmClassIsRegular() {
        driver.findElement(informationInVmClassIsRegular);
    }
    public void checkInformationInInstanceTypeIncludeN1Standard8() {
        driver.findElement(InformationInInstanceTypeIncludeN1Standard8);
    }
    public void checkRegionIsFrankfurt() {
        driver.findElement(regionIsFrankfurt);
    }
    public void checkLocalSsdSpace2x375Gib() {
        driver.findElement(localSsdSpace2x375Gib);
    }
    public void checkCommitmentTermOneYear() {
        driver.findElement(commitmentTermOneYear);
    }
}
