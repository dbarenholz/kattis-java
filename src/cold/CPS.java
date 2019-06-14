import java.util.Scanner;

public class CPS {
	Scanner sc = new Scanner(System.in);

	void run() {
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

	public static void main(String[] a) {
		(new CPS()).run();
	}
}
