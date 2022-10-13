import java.util.Locale;
import java.util.Scanner;


public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        int n = in.nextInt();

        if (n == 100){
            System.out.println("C");
            System.exit(0);
        }

        int a = n % 10; // единицы
        int b = n / 10; // десятки
        int btype = 0;      // тип десятков (первая X или L)
        int atype = 0;

        // РАБОТАЕМ С ДЕСЯТКАМИ

        if (b > 0 && b < 5 || b == 9) {
            System.out.print("X");
            b--;
            btype = 1;
        }
        else if (b > 0){
            System.out.print("L");
            b--;
            btype = 2;
        }


        switch (btype){
            default:
                break;

            case 1:
               if (b < 3) for (int i = b; i > 0; i--) System.out.print("X");

               if (b == 3) System.out.print("L");

               if (b == 8) System.out.print("C");

               break;

            case 2:
                for (int i = b; i > 4; i--) System.out.print("X");
        }

        // ЗАКАНЧИВАЕМ ДЕСЯТКИ И ДЕЛАЕМ ТАК ЖЕ ЕДИНИЦЫ

        if (a > 0 && a < 5 || a == 9) {
            System.out.print("I");
            a--;
            atype = 1;
        }
        else if (a > 0){
            System.out.print("V");
            a--;
            atype = 2;
        }


        switch (atype){
            default:
                break;

            case 1:
                if (a < 3) for (int i = a; i > 0; i--) System.out.print("I");

                if (a == 3) System.out.print("V");

                if (a == 8) System.out.print("X");

                break;

            case 2:
                for (int i = a; i > 4; i--) System.out.print("I");
        }

    }
}