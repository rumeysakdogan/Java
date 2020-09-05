package day51_Exceptions.browserTask;
/*
 3. create a class called FirefoxBrowser
            actions: get(URL): opens the URL in Firefox browser
                     close(): closes the Firefox browser
 */
public class FirefoxBrowser extends WebDriver{

    public void get(String url){
        System.out.println("Opening the "+ url + " in the firefox browser");
    }

    public void close(){
        System.out.println("Closing the firefox browser");
    }
}
