import java.util.Locale;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);
        float n = in.nextFloat();

        if ((n >= -2.0 && n <= 3.0) || (n >= 6.0 && n <= 9.0)) System.out.println("false");
        else System.out.println("true");
    }
}