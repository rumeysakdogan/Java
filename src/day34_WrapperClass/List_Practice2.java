package day34_WrapperClass;

import java.util.ArrayList;

public class List_Practice2 {

    public static void main(String[] args) {

        ArrayList<Integer>  list = new ArrayList<>();
            list.add(100);
            list.add(30);
            list.add(410);
            list.add(310);
            list.add(210);

        Integer max = Integer.MIN_VALUE;
        Integer min = Integer.MAX_VALUE;

        for (Integer each : list){
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
