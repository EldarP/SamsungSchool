import java.util.Locale;
import java.util.Scanner;


public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.ENGLISH);

        int cur_num;
        int[] mass = new int[4];

        for (int i = 0; i < 4; i++)
            mass[i] = in.nextInt();

        for (int i = 0; i < 4; i++){
            cur_num = mass[i];
            for (int k = i + 1; k < 4; k++){
                System.out.println("ll");
                if (cur_num == mass[k] * -1) {
                    System.out.println("true");
                    return;
                }
            }
        }

        System.out.println("false");
    }
}