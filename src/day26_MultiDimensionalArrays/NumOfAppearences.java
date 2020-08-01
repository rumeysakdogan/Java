package day26_MultiDimensionalArrays;
/*
write a program that can return the number of appearances of "java" and "python" anywhere in the sentence
 ex:
        input : I love Java, Python is cool
        output: 1 Java 1 Python

        input: Java Java Python Python Python
        output: 2 Java 3 Python
 */
public class NumOfAppearences {
    public static void main(String[] args) {

        String str = "Java Java Python Python Python";

        String[] arr = str.split(" ");

        int countJava = 0;
        int countPython = 0;

        for (String each : arr){

            if(each.contains("Java")){
                countJava++;
            }
            if(each.contains("Python")){
                countPython++;
            }
        }

        System.out.println(countJava+" Java "+countPython+" Python");

    }
}
