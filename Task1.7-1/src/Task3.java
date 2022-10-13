import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        int n;
        int r = 0;

        while (true){
            n = in.nextInt();

            if (n > 99 || n < 10) break;

            r += n % 10 + n / 10;

        }

        System.out.println(r);

    }
}