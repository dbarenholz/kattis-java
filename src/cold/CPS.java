package cold;

import java.util.*;

/**
 * Solution to the Cold Puter Science problem.
 *
 * @author Daniel Barenholz
 */
public class CPS {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] a) {
        (new CPS()).run();
    }

    private void run() {
        int cold = 0;
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            if (temp < 0) {
                cold++;
            }
        }
        System.out.println(cold);
    }

}
