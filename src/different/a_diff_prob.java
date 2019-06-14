package different;

import java.util.*;

/**
 * Solution to a different problem.
 *
 * @author Daniel Barenholz
 */
public class a_diff_prob {

    private Scanner sc = new Scanner(System.in);

    public static void main(String[] a) {
        (new a_diff_prob()).run();
    }

    private void run() {
        while (sc.hasNextLong()) {
            long first = sc.nextLong();
            long second = sc.nextLong();
            long diff = Math.abs(second - first);
            System.out.println(diff);
        }
    }

}
