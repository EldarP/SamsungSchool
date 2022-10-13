import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        int n;
        int r = 0;

        while (true){
           n = in.nextInt();
           r++;
           if (n < 0) break;
        }

        System.out.println(r);

        }
}