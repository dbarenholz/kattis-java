import java.util.Scanner;

public class cetvrta {
	Scanner sc = new Scanner(System.in);

	void run() {
		int x = 0;
		int y = 0;

		int[] xVal = new int[3];
		int[] yVal = new int[3];

		for (int i = 0; i < 3; i++) {
			xVal[i] = sc.nextInt();
			yVal[i] = sc.nextInt();
		}

		for (int i = 0; i < 3; i++) {
			// System.out.println(yVal[i]);
		}

		if (xVal[0] == xVal[1]) {
			x = xVal[2];
		} else if (xVal[1] == xVal[2]) {
			x = xVal[0];
		} else {
			x = xVal[1];
		}

		if (yVal[0] == yVal[1]) {
			y = yVal[2];
		} else if (yVal[1] == yVal[2]) {
			y = yVal[0];
		} else {
			y = yVal[1];
		}

		System.out.println(x + " " + y);
	}

	public static void main(String[] a) {
		(new cetvrta()).run();
	}
}
