import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        long x = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        if (x <= c && x <= b){
            if (b <= c) System.out.println(x + " " + b + " " + c);
            else System.out.println(x + " " + c + " " + b);
            System.exit(0);
        }

        if (c <= x && c <= b){
            if (x <= b) System.out.println(c + " " + x + " " + b);
            else System.out.println(c + " " + b + " " + x);
            System.exit(0);
        }

        if (b <= x && b <= c){
            if (x <= c) System.out.println(b + " " + x + " " + c);
            else System.out.println(b + " " + c + " " + x);
            System.exit(0);
        }

    }
}