package day51_Exceptions.browserTask;
/*
   4. create a class called Opera browser
            actions: get(URL): opens the URL in Opera browser
                     close(): closes the Opera browser
 */
public class OperaBrowser extends WebDriver {

    public void get(String url){
        System.out.println("Opening the "+url+" in the opera browser");
    }

    public void close(){
        System.out.println("Closing the opera browser");
    }
}
