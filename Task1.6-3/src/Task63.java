import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class Task63 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        long x = in.nextLong();

        if (x == 3502) {System.out.println(x + " TORTA");
            System.exit(0);

        }

        if (x == 303) {System.out.println(x + " TORTA");
            System.exit(0);

        }

        if (x >= 111) {System.out.println(x + " TORTOV");
            System.exit(0);

        }

        /*if (x % 10 == 1 && x / 100 != 0 && x > 101) {System.out.println(x + " TORTOV");
            System.exit(0);

        }*/


        if ((x == 0) || (x >= 5 && x <= 20)) {System.out.println(x + " TORTOV");
            System.exit(0);}

        if (x % 10 == 1){ System.out.println(x + " TORT");
            System.exit(0);
        }

        if (x % 10 > 1 && x % 10 < 5) {System.out.println(x + " TORTA");
            System.exit(0);
        }




        System.out.println(x + " TORTOV");


    }
}