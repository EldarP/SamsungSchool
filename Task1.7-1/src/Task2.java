import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        int n;
        int r = 0;

        while (true){
           n = in.nextInt();
           if (n > 10) r += n;
           if (n % 5 == 0) break;
        }

        System.out.println(r);

        }
}