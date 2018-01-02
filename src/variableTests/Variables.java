package variableTests;

/**
 * Created by Jimmy on 2016-10-18.
 */
public class Variables {
    short s = 25000;
    byte b = 120;

    double d = 793.456;
    float f = 7.1f;

    char c = 'J';
    int intValue = 88;

    {
        //c = intValue;//what is the problem here?
        //c = 77;//this does not work either. Why?
    }

    public Variables(){
        //b = c; //tries to set a byte to a char value
        intValue = c; //c is a char, but it also has an integer value
        //c = intValue;//why doesn't this work?
        c = 77;
        //c = s; //tries to set the char to a short
        //c = b; //tries to set the char to a byte
        //c = -5; //tries to set the char to a negative value

        //first some printouts just to see what the different values look like and how long numbers...
        //...can be printed out
        System.out.println();
        System.out.println("in Variables");

        //octal, hexadecimal and binary values
        byte bOct = 031; //octal. 3 * 8 + 1 = 25
        System.out.println();
        System.out.println("bOct = " + bOct);
        byte bHex = 0x5C;//hexadecimal. 5 * 16 = 80. C = 12. 80 + 12 = 92.
        System.out.println("bHex = " + bHex);
        byte bBin = 0b1010;//binary. 1 * 8 + 1 * 2 = 10
        System.out.println("bBin = " + bBin);

        //doubles
        double dd = 4267e30;//= 4267 * 10^30
        double ddd = 123456789123456789123456789.12345678956;//27 digits and 11 after the decimal point

        System.out.println();
        System.out.println("d = " + d);
        System.out.println("dd = " + dd);
        System.out.println("ddd = " + ddd);
        //float value
        System.out.println("f = " + f);

        //both of these values have now been changed
        System.out.println();
        System.out.println("intValue = " + intValue);
        System.out.println("c = " + c);
    }

    public void setNewValues(){
        int i = 909_000;
        long l = 808_000_000_000L;//note the "L"

        //integer set to a short value
        i = s;
        System.out.println();
        System.out.println("in setNewValues");
        System.out.println("i = " + i);

        //short set to the value of a byte
        s = b;
        System.out.println("s = " + s);

        //integer gets a long value(have to cast)
        i = (int) l;
        System.out.println("i is now = " + i); //will this value be 808_000_000_000L?
        //do you understand why the value above for "i" is what it is?
        System.out.println("ints can max be 2^32 or " + Integer.MAX_VALUE);

        //numeric promotion
        double severalPrimitivesCalculation = b + f / d;
        System.out.println();
        System.out.println("severalPrimitivesCalculation = " + severalPrimitivesCalculation);
        double fPB = d / f / l;
        //float ffPB = d / f / l; //why doesn't this work?
        System.out.println("fPB = " + fPB);
        System.out.printf("fPB = %.15f", fPB); //prints a nicer value, 15 decimals displayed
        System.out.println();

        float floatMultiplication = f * i;
        System.out.println();
        System.out.printf("floatMultiplication = %.5f", floatMultiplication);//prints a nicer value, 5 decimals displayed
        double dfM = f * i;//can also be set to a double, even though it is a float
        System.out.println();
        System.out.printf("dfM = %.2f", dfM);//prints a nicer value, 2 decimals displayed
        System.out.println();

        double longIntDoubleMulti = l * i / d;
        System.out.println();
        System.out.println("l = " + l);
        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.printf("longIntDoubleMulti = %.2f", longIntDoubleMulti);//prints a nicer value, 2 decimals displayed
        System.out.println();

        int shortMultiplication = s * s;
        //short shortMulti = (s - s); //why doesn't this work?
        System.out.println();
        System.out.println("shortMultiplication = " + shortMultiplication);
        b = (byte) shortMultiplication;
        System.out.println("b with shortMultiplication:s value = " + b);//similar to i = (int) l;
    }
}
