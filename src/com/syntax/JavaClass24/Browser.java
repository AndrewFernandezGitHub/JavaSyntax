package com.syntax.JavaClass24;

public class Browser {
    void openBrowser(){
        System.out.println("Opening the browser");
    }
    void loadPage(String URL){
        System.out.println("loading the website"+URL);
    }
    void testThePage(){
        System.out.println("Testing the page");
    }
    void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
class GoogleChrome extends Browser{ void openBrowser(){
    System.out.println("Opening the Google Chrome browser");
}
    void loadPage(String URL){
        System.out.println("loading the website"+URL+" in Google Chrome");
    }
    void testThePage(){
        System.out.println("Testing the page in Google Chrome");
    }
    void closeBrowser(){
        System.out.println("Closing the Google Chrome browser");
    }
}
class FireFox extends Browser{
    void openBrowser() {
        System.out.println("Opening the  browser in Firefox");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in Firefox");
    }

    void testThePage() {
        System.out.println("Testing the page in FireFox");
    }

    void closeBrowser() {
        System.out.println("Closing the Firefox browser");
    }
}
class Safari extends Browser{
    void openBrowser() {
        System.out.println("Opening the  browser in Safari");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in Safari");
    }

    void testThePage() {
        System.out.println("Testing the page in Safari");
    }

    void closeBrowser() {
        System.out.println("Closing the Safari browser");
    }
}
class IE extends Browser {
    void openBrowser() {
        System.out.println("Opening the  browser in IE");
    }

    void loadPage(String URL) {
        System.out.println("loading the website" + URL + " in IE");
    }

    void testThePage() {
        System.out.println("Testing the page in IE");
    }

    void closeBrowser() {
        System.out.println("Closing the IE browser");
    }
}
