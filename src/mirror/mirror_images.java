import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class mirror_images {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int testcases = Integer.parseInt(r.readLine());
		// For all testcases
		for (int test = 1; test <= testcases; test++) {
			w.write("Test " + test + "\n"); // Test #

			StringTokenizer s = new StringTokenizer(r.readLine());
			int row = Integer.parseInt(s.nextToken()); // number of rows
			s.nextToken(); // skip columns

			String[] im = new String[row];

			// For all rows
			for (int i = 0; i < row; i++) {
				// reverse the string
				im[i] = new StringBuilder(r.readLine()).reverse().toString();
			}
			// Now print in reverse order
			for (int i = row - 1; i >= 0; i--) {
				w.write(im[i] + "\n");
			}
		}
		w.flush();
	}

	public static void main(String[] a) throws IOException {
		(new mirror_images()).run();
	}
}
