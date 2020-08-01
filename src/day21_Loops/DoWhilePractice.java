package day21_Loops;

public class DoWhilePractice {
    public static void main(String[] args) {

        // print numbers from 1-20 on the same line with space

        int i = 1;
        do{
            System.out.print(i+" ");
            i++;
        }while( i <= 20);

        System.out.println();

        // print letters from Z to A on the same line with space

        char ch = 'Z';
        do{
            System.out.print(ch+" ");
            ch--;
        }while( ch >= 'A');
    }
}
