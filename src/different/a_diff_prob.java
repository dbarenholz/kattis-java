import java.util.Scanner;

public class a_diff_prob {
	Scanner sc = new Scanner(System.in);

	void run() {
		while (sc.hasNextLong()) {
			long first = sc.nextLong();
			long second = sc.nextLong();
			long diff = Math.abs(second - first);
			System.out.println(diff);
		}
	}

	public static void main(String[] a) {
		(new a_diff_prob()).run();
	}
}
