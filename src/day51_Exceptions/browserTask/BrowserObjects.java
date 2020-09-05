package day51_Exceptions.browserTask;
/*
 5. create a class called Test:
            create an object of each browsers and call the get & close actions
 */
public class BrowserObjects {

    public static void main(String[] args) {

        ChromeBrowser chrome  = new ChromeBrowser();
        chrome.get("https://www.google.com");
        chrome.close();

        System.out.println("==================================");

        FirefoxBrowser firefox = new FirefoxBrowser();
        firefox.get("https://www.google.com");
        firefox.close();

        System.out.println("==================================");

        OperaBrowser opera = new OperaBrowser();
        opera.get("https://www.google.com");
        opera.close();

        System.out.println("==================================");
    }
}
