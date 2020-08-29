package day47_Encapsulation;
/*
task:
    1. create class Credentials
            instance variables:
                    public name
                    public age
                    private username
                    private password
                    getter & setter
                    add a constructor to set name & age
    then create CredentialsObjects class and test it.
 */
public class Credentials {

    public String name;
    public int age;
    private String userName;
    private String password;
    public static String companyName;

    static {
        companyName  = "FaceBook";
    }

    public Credentials(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setUserName(String userName){
        this.userName = userName;
    }

    public String getUserName(){
        return userName;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPassword(){
        return password;
    }


}
