package day51_Exceptions;

import library.Util;

public class ExceptionsPractice {

    public static void main(String[] args) {

        System.out.println("Hello");
/*
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }

 */
        Util.sleep(3);

        System.out.println("World!");

/*
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){}


 */
        Util.sleep(5);

        System.out.println("How are you?");

    }

    public static void sleep(double seconds){
        try{
            Thread.sleep((long)seconds * 1000);
        }catch (InterruptedException e){}
    }



}
