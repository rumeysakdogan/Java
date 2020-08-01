package day32_MethodOverLoading;

import java.util.Arrays;

public class MethodOverloading {

    public static void main(String[] args) {
        int[] arr = {1,5,9,4, 21};
        Arrays.sort(arr);

        String names[] = {"A", "C", "B"};
        Arrays.sort(names);

    }

    // in order to overload a method:parameters MUST be different

    public static void method(int a){

    }
    public static void method(double d){

    }
}
