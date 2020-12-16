package OfficeHoursWithSaim.OOP_Task;

import java.util.ArrayList;
import java.util.List;

/*
Facebook User:
(*) Create a class for a facebook user which inherits the Social Media class and additional instance variables: username, password, full name, age, and number of friends
(*) Encapsulate all the variables.
(*) Create a constructor which will create a facebook user by taking username and password.
    - If the password contains the username then it is not a valid password and should not be saved. In this case Print “Password contained username. Default password created: ‘password’” and set the password for the user to the default value.
    - Create and assign the the user's person url by taking 'facebook.com/' and adding their username
    - Set the account length to 0
    - Set the platform for "Facebook" using static block
(*) Overload the constructor to accept username, password, and the user’s name.
    - If the name entered has any characters that are not letters from the alphabet, then the name is invalid. In this case print “invalid name” and assign the name value to be ‘no name’
(*) Overload the constructor to accept username, password, the user’s name, age and number of friends.
    - Only store the age and number of friends into the variables if they are valid numbers ( No negative numbers ). If they are invalid print “Invalid (age/number of friends) and keep the values as the default of 0.
(*) Implement all methods coming from Social Media class
    (*) Direct messaging(String username, String message)
        - print = %message sent to %username
    (*) Post(String body)
        - Should be added to the the ArrayList of Posts of the user
    (*) Notifications(int time)
        - Checks the current time. If the time is between 8 am - 5 pm print "Notification", otherwise print "Sleep mode"
(*) Override the toString method to print all of the information of a Facebook user when they are searched.
(*) Create a sendFriendRequest method that will accept a Facebook user object and send them a friend request. The method should return a boolean of if the friend request was sent (true) or if the friend request was not sent (false).
    - If your friend list is at the 5000 limit then do not send the request and print “You have reached the limit of friends.”
    - If the user you are trying to send the request to has already hit the limit then print “theUsersName cannot accept any more friend request.
    - If both you and the user are under the limit print “Friend request sent to theUsersName” and increase your number of friends by one.


 */
public class FacebookUser extends SocialMedia implements Groups{

    private String username;
    private String password;
    private String full_name;
    private int age;
    private int numberOfFriends;
    private int numberOfGroups;
    private ArrayList<Post> allPosts;

    static {
        platform ="Facebook";
    }

    public FacebookUser(String username, String password){

        if(password.contains(username)){
            System.out.println("Password contained username. Default password created: 'password'");
            this.password = "password";
        }else{
            this.password = password;
        }

        this.username = username;
        personal_URL = "facebook.com/" + this.username;
        accountLength = 0;
        allPosts = new ArrayList<>();
    }

    public FacebookUser(String username, String password, String full_name){

        this(username, password);  // constructor call

        boolean isValidName = true;

        for (int i = 0; i < full_name.length(); i++) {

            if(full_name.charAt(i) == ' '){ continue};
            if( !Character.isLetter(full_name.charAt(i))){
              isValidName = false;
              break;
            }
        }

        if(isValidName){
            this.full_name = full_name;
        }else{
            System.out.println("Invalid name");
            this.full_name = "no name";
        }

    }

    public FacebookUser(String username, String password, String full_name, int age, int numberOfFriends){

       this(username, password, full_name);

        if ( age < 0 ){
            System.out.println("Invalid age");
        }else{
            this.age = age;
        }

        if(numberOfFriends < 0){
            System.out.println("Invalid number of friends");
        }else{
            this.numberOfFriends = numberOfFriends;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public ArrayList<Post> getAllPosts() {
        return allPosts;
    }

    public void setAllPosts(ArrayList<Post> allPosts) {
        this.allPosts = allPosts;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }

    public void setNumberOfFriends(int numberOfFriends) {
        this.numberOfFriends = numberOfFriends;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    @Override
    public void directMessaging(String username, String message) {
        System.out.printf("%s sent to : %s \n", message , username );
        //System.out.println(message + " was sent to : " + username);
    }

    @Override
    public void post(String body) {

        allPosts.add( new Post(body));

    }

    @Override
    public void notifications(int time) { // time will be 24 format
        // 8 am to 17 pm
        if( time >= 8 && time <= 17){
            System.out.println("Notification");
        }else{
            System.out.println("Sleep mode");
        }
    }

    public boolean sendFriendRequest(FacebookUser user, String request){

        boolean isSent = false;

        if(user.numberOfFriends >= 5000){
            System.out.println( user.full_name +" cannot accept any more friend request.");
        }else if(numberOfFriends >= 5000){
             System.out.println("You have reached the limit of friends.");
        }else{
            System.out.println("Friend request sent to " + user.full_name);
            this.numberOfFriends++;
            user.numberOfFriends++;
            isSent = true;
        }

        return isSent;
    }

    @Override
    public String toString() {
        return "FacebookUser{" +
                "username='" + username + '\'' +
                ", full_name='" + full_name + '\'' +
                ", age=" + age +
                ", numberOfFriends=" + numberOfFriends +
                '}';
    }

    @Override
    public void joinGroup(String group) {
        System.out.printf("%s as join %s", full_name, group);
        numberOfGroups++;
    }

    @Override
    public void leaveGroup(String group) {
        System.out.printf( "%s as left %s", full_name, group);
        numberOfGroups--;
    }
}
