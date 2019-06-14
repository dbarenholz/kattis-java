import java.util.Scanner;

public class DiceCup {
	void run() {
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

	public static void main(String[] a) {
		(new DiceCup()).run();
	}
}
