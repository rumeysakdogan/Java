package day44_Constructor;

/*
    declare:
                Access- Modifier className(Parameter){
                        statements;
                }


  Every class MUST hava a constructor, without constructor -> no class ; without class -> no object !
  if you do not create a constructor in the class ,
             compiler will create one for you as a default one with no arguments.
 */

public class Constructor_Intro {

// the execution of constructor ONLY depends creation of the object from this constructor.
    public Constructor_Intro(String arg){
        System.out.println( "Hello " + arg );
        System.out.println("How are you "+arg);
    }


    public static void main(String[] args) {

       // Constructor_Intro obj1 = new Constructor_Intro(10);

    //    new Constructor_Intro(); // object created by using default no-arg constructor created  by compiler

         Constructor_Intro obj = new Constructor_Intro("Rumeysa");
         Constructor_Intro obj2 = new Constructor_Intro("Dawud");
         Constructor_Intro obj3 = new Constructor_Intro("Zeliha");

    }


}
