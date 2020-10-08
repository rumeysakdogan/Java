package day60_Collection;

import library.Util;

import java.util.*;

/*
warmup tasks:
	1. write a program that can remove the palindrome string from a list of String
			DO NOT use Lambda expressions

	2. write a program that can remove the even numbers from a Set of Integers
			DO NOT use Lambda expressions

	3. write a program that can remove the duplicated Integers from a List of Integer
			Do Not change the insertion order
 */
public class WarmupForCollections {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>( Arrays.asList("car","stats", "apple" , "rotor", "bike","tree" ));

        Iterator<String> it = list.iterator();

        while( it.hasNext() ){
            boolean isPalindrome = true;
            String temp =it.next();

            for (int i = 0; i < temp.length()/2; i++) {
                if (temp.charAt(i) != temp.charAt(temp.length()-1-i)){
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome){
                it.remove();
            }
        }

        System.out.println(list);

        System.out.println("====================================");

        Set<Integer> s = new HashSet<>( Arrays.asList( 1, 3, 2,4,5,6,7,8,9,0));

        Iterator<Integer> it2 = s.iterator();

        while( it.hasNext()){
            if( it2.next()%2 == 0 ){
                it2.remove();
            }
        }

        System.out.println( s );

        System.out.println("====================================");

        List<Integer> list2 = new ArrayList<>( Arrays.asList( 1,1,3,1,1,1,5,6,7,8,9,9,99,2,2,2,0));

        Set<Integer> l2 = new LinkedHashSet<Integer>(list2);

        System.out.println(l2);
    }
}
