package com.syntax.JavaClass24;

public class BrowserTester {
    public static void main(String[] args) {
        //this is long way
    /*    GoogleChrome chrome=new GoogleChrome();
        chrome.openBrowser();
        chrome.loadPage();
        chrome.testThePage();
        chrome.closeBrowser();

        Firefox firefox=new FireFox();
        firefox.openBrowser();
        firefox.loadPage();
        firefox.testThePage();
        firefox.closeBrowser();

        Safari safari=new Safari();
        safari.openBrowser();
        safari.loadPage();
        safari.testThePage();
        safari.closeBrowser();

        IE ie=new IE();
        ie.openBrowser();
        ie.loadPage();
        ie.testThePage();
        ie.closeBrowser();

     */
        Browser [] browser={new GoogleChrome(),new FireFox(), new Safari(), new IE()};
        for (Browser b:browser){
            b.openBrowser();
            b.loadPage("");
            b.testThePage();
            b.closeBrowser();
        }//object class is godfather class
       // Object s= new String();
       // Object zz= new GoogleChrome();
    }
}
