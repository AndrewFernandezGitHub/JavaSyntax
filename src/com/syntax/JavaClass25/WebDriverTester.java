package com.syntax.JavaClass25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver webdriver=new ChromeDriver();
        webdriver.openBrowser();
        webdriver.findElement();
        webdriver.findElement();
        webdriver.maximizeWindow();
        webdriver.closeBrowser();

        WebDriver [] webDrivers={new ChromeDriver(),new FirefoxDriver()};
        for (WebDriver w:webDrivers){
            w.openBrowser();
            w.findElement();
            w.maximizeWindow();
            w.closeBrowser();
        }
    }
}
