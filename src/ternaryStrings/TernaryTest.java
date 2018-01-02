package ternaryStrings;

/**
 * Created by Jimmy on 2016-10-20.
 */
public class TernaryTest {
    public void test(){
        int x = 3;
        int y = 66;
        int z = 8;

        //x = 3, y = 66. Simple example. Ternary expression.
        String res = (x < y) ? "x lesser than y" : "x bigger than y";

        System.out.println();
        System.out.println("In TernaryTest");
        System.out.println();
        System.out.println("res = " + res);

        //x = 3, y = 66, z = 8
        //printout?
        String result = (x > y) ? "x bigger than y" : (y > z) ? "y bigger than z" : "y lesser than z";

        System.out.println();
        System.out.println("result = " + result);

        int i = 6;//16;//5;
        //"%" gives the remainder
        //printout?
        String oddResult = (i % 2 == 0) ? ((i % 4 == 0) ? "i divisible by 4" : "i is even" ): "i is odd";

        System.out.println();
        System.out.println("oddResult = " + oddResult);

        //the logic in the second ternary above
        //if (i % 2 == 0)
            //if (i % 4 == 0)
                //"i divisible by 4"
            //else
                //"i is even"
        //"i is odd"

        //most advanced example of a ternary
        i = 5;
        String divisibleTest = "";
        divisibleTest = i % 2 == 0 ?
                i % 3 == 0 ? "divisible by 2 * 3" : "divisible by 2" :
                i % 3 == 0 ? "divisible by 3" : Integer.toString(i);
        System.out.println();
        System.out.println("divisibleTest = " + divisibleTest);

        //the logic of this ternary
        //if (i % 2 == 0)
            //if (i % 3 == 0)
                //"divisible by 2 * 3"
            //else
                //"divisible by 2"
        //else
            //if (i % 3 == 0)
                //"divisible by 3"
            //else
                //Integer.toString(i); //not divisible by 2 or 3
    }
}
