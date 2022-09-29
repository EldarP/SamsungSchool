import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        byte aByte = -128;
        short aShort = 30000;
        int aInt = 2000000000;
        long aLong = 2000000000000000000l;


        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(aInt);
        System.out.println(aLong);


        double aDouble = 8.1234567891011121314151617181920212223;
           float aFloat = 8.33478487478f;
        System.out.println(aDouble);

            Scanner in = new Scanner(System.in);
           in.useLocale(Locale.US);
           aFloat = in.nextFloat();

        //boolean aBoolean = true;
        boolean aBoolean = false;

        System.out.println(aBoolean);

        char aChar = 97;

        System.out.println((char)( aChar + 1));
        System.out.println((int)( aChar + 1));
        System.out.println((char)( 98+1));




        int a = 10, b = 5;
        int res;

        res = a + b;

        System.out.println(res);

        res = a - b;

        System.out.println(res);

        res = a * b;

        System.out.println(res);

        res = a / b;

        System.out.println(res);

        int i = 0;
        System.out.println(++i);  // i++; i += 1;
        System.out.println(i--); // i -= 1;
        System.out.println(i);

        i += 5; // i = i + 5;
        i /= 2; // i = i / 2;
        i %= 2; // i = i % 2;
        i *= 2; // i = i * 2;



    }

}