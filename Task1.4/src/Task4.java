import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        in.useLocale(Locale.ENGLISH);

        double x = in.nextDouble();
        double y = in.nextDouble();

        /*x = Math.toRadians(x);
        y = Math.toRadians(y);*/

        System.out.println(y > x * x - 2 && y < x || y > x * x - 2 && y < -x ? "YES":"NO");

    }
}