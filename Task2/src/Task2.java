import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        float n = in.nextFloat();

        if ((n >= -3.0 && n <= 5.0) || (n >= 9.0 && n <= 15.0)) System.out.println("true");
        else System.out.println("false");
    }
}