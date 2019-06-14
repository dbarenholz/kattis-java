import java.util.Scanner;

public class two {
	void run() {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();
		String even = "Bob";
		String odd = "Alice";
		if (a % 2 == 0) {
			System.out.println(even);
		} else {
			System.out.println(odd);
		}
	}

	public static void main(String[] a) {
		(new two()).run();
	}
}
