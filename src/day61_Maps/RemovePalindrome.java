package day61_Maps;

import library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
warmup tasks:
	1. write a program that can remove the palindrome string from a list of String
			DO NOT use Lambda expressions


 */
public class RemovePalindrome {

    public static void main(String[] args) {

        String[] words = {"level", "kayak", "ana", "java", "python", "cybertek"};

        List<String> list = new ArrayList<>();
            list.addAll( Arrays.asList(words));

        Iterator<String> it = list.iterator();

        while( it.hasNext() ){
            String each = it.next();
            String reverse = Util.reverseString(each);

            if ( each.equals(reverse)){
                it.remove();
            }
        }

        System.out.println( list);
    }
}
