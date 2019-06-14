package pet;

import java.util.*;

/**
 * Solution to Pet problem.
 * <p>
 * The ugliest possible solution! :D
 * </p>
 *
 * @author Daniel Barenholz
 */
public class Pet {

    public static void main(String[] a) {
        (new Pet()).run();
    }

    // Take sum per row and check which one is largest, return which row it is
    // and the value.
    private void run() {
        Scanner sc = new Scanner(System.in);
        // Take sum per row
        int sumOne = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int sumTwo = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int sumThree =
                sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int sumFour = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        int sumFive = sc.nextInt() + sc.nextInt() + sc.nextInt() + sc.nextInt();
        sc.close();
        // Find out which one is the maximum.
        int[] array = new int[5];
        array[0] = sumOne;
        array[1] = sumTwo;
        array[2] = sumThree;
        array[3] = sumFour;
        array[4] = sumFive;
        Arrays.sort(array);
        int max = array[4];

        if (max == sumOne) {
            System.out.println(1 + " " + max);
        }
        if (max == sumTwo) {
            System.out.println(2 + " " + max);
        }
        if (max == sumThree) {
            System.out.println(3 + " " + max);
        }
        if (max == sumFour) {
            System.out.println(4 + " " + max);
        }
        if (max == sumFive) {
            System.out.println(5 + " " + max);
        }

    }

}
