import java.util.Locale;
import java.util.Scanner;


public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        long x = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();

        long[] mass = new long[] {};
        for (int i = 0; i == 0;){
            if (x <= c && x <= b){
                if (b <= c) mass = new long[]{x, b, c};
                else mass = new long[]{x, c, b};
                break;
            }

            if (c <= x && c <= b){
                if (x <= b) mass = new long[]{c, x, b};
                else mass = new long[]{c, b, x};
                break;
            }

            if (b <= x && b <= c){
                if (x <= c) mass = new long[]{b, x, c};
                else mass = new long[]{b, c, x};
                break;
            }
        }

        System.out.println(mass[2]);

    }
}