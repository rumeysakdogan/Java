package day20_whileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch = 'A';

        while ( ch < 'F' ) {

            if ( ch == 'C'){
                ch++;       // we should add this iterator to print after skipping 'C'
                continue;   // skips everything even iterator
                //break;       exits loop after 'B'
            }

            System.out.println(ch);

            ch++;   // continue skips this iterator
        }

        if(true){
            System.out.println("Started");
        //    System.exit(0);   // it will exit the whole program, stops JVM
        }

        System.out.println("Done");  // this statement will not be printed

        boolean a = true;

        while(a){
            System.out.println("Test started");
            break;
            // System.exit(0);
        }
        System.out.println("Completed");

    }
}
