package mainPackage;

import ternaryStrings.TernaryTest;
import variableTests.Variables;

import java.util.Scanner;

/**
 * Created by Jimmy on 2016-10-18.
 */
public class Loops {
    int nonStaticNumber = 1;
    static int staticNumber = 55;

    public static void main(String[] args) {
        int nonInitialized;
        //System.out.println(nonInitialized);//what is the problem with this line? (repetition)

        int num = 100;
        //num = nonStaticNumber;//the problem is...?
        num = staticNumber;
        System.out.println("num = " + num);

        System.out.println();
        System.out.println("Loop with continue");
        //what will this block print?
        START: for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 2 | j == 3){
                    System.out.println("i was 2 or j was 3. Let us see:");
                    System.out.println("i is " + i);
                    System.out.println("j is " + j);
                    System.out.println();
                    continue START;
                    //System.out.println("hej");
                }
            }
            System.out.println("in the outer loop now and i is " + i);
        }

        System.out.println();
        System.out.println("Same loop with break");
        //what will this block print with a break statement instead?
        BREAKSTART: for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                if(i == 2 | j == 3){
                    System.out.println("i was 2 or j was 3. Let us see:");
                    System.out.println("i is " + i);
                    System.out.println("j is " + j);
                    System.out.println();
                    break BREAKSTART;
                }
            }
            System.out.println("in the outer loop now and i is " + i);
        }

        Scanner sc = new Scanner(System.in);
        String written = "";
        while(true){//eternal loop - careful! Good for menus.
            System.out.println("Continue?");
            written = sc.nextLine();
            if(written.equals("y")  | written.equals("yes")){
                System.out.println();
                break;
            }
        }

        Variables v = new Variables();
        v.setNewValues();

        System.out.println();

        for(;;){//another eternal loop
            System.out.println("Do you really want to continue?");
            written = sc.nextLine();
            if(written.equals("y")  | written.equals("yes")){
                System.out.println();
                break;
            }
        }

        TernaryTest tt = new TernaryTest();
        tt.test();
    }
}
