import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class conundrum {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		// store input in character array
		char[] in = r.readLine().toCharArray();
		// keep track of a counter
		int count = 0;

		// for all characters
		for (int i = 0; i < in.length; i++) {
			// if % 3 isn't P; replace
			if (i % 3 == 0) {
				if (in[i] != 'P') {
					count++;
				}
			}
			// ifnot E, replace
			if (i % 3 == 1) {
				if (in[i] != 'E') {
					count++;
				}
			}
			// if not R, replace
			if (i % 3 == 2) {
				if (in[i] != 'R') {
					count++;
				}
			}
		}
		// output counter
		w.write(count + "\n");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new conundrum()).run();
	}

}
