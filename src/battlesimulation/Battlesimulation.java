import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Battlesimulation {
	public static void main(String[] a) throws IOException {
		(new Battlesimulation()).run();
	}

	/*
	 * @return '+' if the char[] is a combo move, '-' otherwise
	 */
	char isCombo(char[] arr) {
		// RBK || RKB || BKR || BRK || KRB || KBR
		return ((arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[0] != arr[2])) ? '+' : '-';
	}

	/*
	 * match the character
	 */
	char match(char c) {
		switch (c) {
		case 'R': // an S in case of R
			return 'S';
		case 'B': // a K in case of B
			return 'K';
		case 'L': // an H in case of L
			return 'H';
		}
		return '~';
	}

	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		char[] in = r.readLine().toCharArray();

		for (int i = 0; i < (in.length); i++) {

			char[] t = null; // initialize a temp array

			try {
				t = new char[] { in[i], in[i + 1], in[i + 2] };
			} catch (ArrayIndexOutOfBoundsException e) {
				// impossible, so we have to process the last 2 characters
				try {
					while (true) {
						sb.append(match(in[i]));
						i++;
					}
				} catch (ArrayIndexOutOfBoundsException e2) {
					break;
				}
			}

			switch (isCombo(t)) {
			case '+': // if a combo
				sb.append('C'); // write a c
				i += 2; // add 2 to index
				break;
			case '-': // if not a combo
				sb.append(match(in[i])); // match the character
				break;
			}
		}
		sb.append("\n");
		w.write(sb.toString()); // write the output
		w.flush();

	}

}
