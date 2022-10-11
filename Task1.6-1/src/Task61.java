import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task61 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        long x = in.nextLong();

        if (x / 10 == 0 && x >= 0){
            System.out.println("DIGIT");
            System.exit(0);
        }

        if (x / 100 == 0 && x >= 0){
            System.out.println("NUM");
            System.exit(0);
        }

        System.out.println("OTHERS");

    }
}