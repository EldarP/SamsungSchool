import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int one = in.nextInt();
        int two = in.nextInt();
        int three = in.nextInt();

        if (((one % 2 == 0) && (two % 2 == 0)) ||
                ((one % 2 == 0) && (three % 2 == 0)) ||
                ((two % 2 == 0) && (three % 2 == 0))) {System.out.println("true"); return;}

        System.out.println("false");
    }
}