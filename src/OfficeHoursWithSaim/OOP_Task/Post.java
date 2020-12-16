package OfficeHoursWithSaim.OOP_Task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
Post class
(*) Create a class that has the following instance variable:
    String body, and String dateTime
    - Encapsulate body. Provide a public getter and setter(update)
    - Make dateTime final and read only (getter)
(*) Create a constructor that will take the body and initialize store it to the instance variable. Upon creation of the post the current time should be taken and stored into the dateTime variable
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        System.out.println(dt.format(format));

(*) Implement post method to create a post by the given body and store it to the ArrayList of Posts of the user
 */
public class Post {

    private String body;
    private final String dateTime;

    public Post(String body) {
        this.body = body;
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMM dd, yyyy | hh:mm a");
        this.dateTime = dt.format(format);
    }


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDateTime() {
        return dateTime;
    }
}
