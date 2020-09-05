package day51_Exceptions.browserTask;
/*
2. create a class called ChromeBrowser
            actions: get(URL): opens the URL in chrome browser
                     close(): closes the chrome browser
 */
public class ChromeBrowser extends WebDriver{

    public void get(String url){
        System.out.println("Opening the " + url + " in the chrome browser");
    }


    public void close() {
        System.out.println("Closing the chrome browser");
    }
}
