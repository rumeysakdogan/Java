package day28_Recap;
/*

 */
public class Email {
    public static void main(String[] args) {

        String email = "cybertek@gmail.com";

        String name = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));

        System.out.println("name: "+name);
        System.out.println("domain: "+domain);


    }
}
