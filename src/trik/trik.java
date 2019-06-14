import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class trik {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		// read input
		char[] chars = r.readLine().toCharArray();
		// -1: doesnt exist
		// 1: start position
		// 0: open place
		int[] a = { -1, 1, 0, 0 };

		// for all characters
		for (char c : chars) {
			if (c == 'A') {
				int one = a[1];
				int two = a[2];
				a[1] = two;
				a[2] = one;
			} else if (c == 'B') {
				int two = a[2];
				int three = a[3];
				a[2] = three;
				a[3] = two;
			} else if (c == 'C') {
				int one = a[1];
				int three = a[3];
				a[1] = three;
				a[3] = one;
			}
		}

		// find answer
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				w.write(i + "\n");
			}
		}
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new trik()).run();
	}
}
