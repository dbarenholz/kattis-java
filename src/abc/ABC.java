package abc;

import java.util.*;

/**
 * Solution to the ABC problem.
 *
 * @author Daniel Barenholz
 */
public class ABC {

    private Scanner sc = new Scanner(System.in);

    private void run() {
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] numbers = new int[] {x, y, z};
        Arrays.sort(numbers);

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        String abcString = sc.next();

        switch (abcString) {
            case "ABC":
                print(a, b, c);
                break;
            case "ACB":
                print(a, c, b);
                break;
            case "BAC":
                print(b, a, c);
                break;
            case "BCA":
                print(b, c, a);
                break;
            case "CAB":
                print(c, a, b);
                break;
            case "CBA":
                print(c, b, a);
                break;
        }
    }

    private void print(int first, int middle, int last) {
        System.out.println(first + " " + middle + " " + last);
    }

    public static void main(String[] a) {
        (new ABC()).run();
    }

}
