package day08_LogicalOperations;

public class Practice3 {

    public static void main(String[] args) {

        int b = 2;

        boolean res = ++b ==2  ||  --b == 2 &&  --b ==2;
        System.out.println(res);

        boolean x = true, z = true;
        int y = 20;
        x = (y !=10) || (z=false);
        System.out.println(x);

        boolean A = true;
        boolean  B = !A;

        boolean C = A != B  && A == !B  && !A == B;
        //         true  != false   && true == true  && false == false
        //              true        &&      true     &&     true
        //                                  true
        System.out.println(C);

        }
    }

