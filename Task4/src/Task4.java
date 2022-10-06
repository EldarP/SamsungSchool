import java.util.Locale;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        long n = in.nextLong();


        if (n >= 0 && (n % 5 == 0) && (n / 100 != 0) && (n / 1000 == 0)) System.out.println("true");
        else System.out.println("false");

    }
}