import java.util.Arrays;
import java.util.Scanner;

public class ABC {
	Scanner sc = new Scanner(System.in);

	void run() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int[] numbers = new int[] { x, y, z };
		Arrays.sort(numbers);

		int a = numbers[0];
		int b = numbers[1];
		int c = numbers[2];

		String abcString = sc.next();

		if (abcString.equals("ABC")) {
			print(a, b, c);
		} else if (abcString.equals("ACB")) {
			print(a, c, b);
		} else if (abcString.equals("BAC")) {
			print(b, a, c);
		} else if (abcString.equals("BCA")) {
			print(b, c, a);
		} else if (abcString.equals("CAB")) {
			print(c, a, b);
		} else if (abcString.equals("CBA")) {
			print(c, b, a);
		}
	}

	void print(int first, int middle, int last) {
		System.out.println(first + " " + middle + " " + last);
	}

	public static void main(String[] a) {
		(new ABC()).run();
	}
}
