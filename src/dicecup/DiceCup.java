package dicecup;

import java.util.*;

/**
 * Solution to the Dice cup problem.
 *
 * @author Daniel Barenholz
 */
public class DiceCup {

    public static void main(String[] a) {
        (new DiceCup()).run();
    }

    private void run() {
        Scanner sc = new Scanner(System.in);
        // add one to the numbers
        int a = sc.nextInt() + 1;
        int b = sc.nextInt() + 1;
        sc.close();
        if (a >= b) {
            // swap digits
            int temp = a;
            a = b;
            b = temp;
        }
        while (a <= b) {
            System.out.println(a);
            a++;
        }
    }

}
