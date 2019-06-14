import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DetailedDifferences {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		int testcases = Integer.parseInt(r.readLine());

		while (testcases-- > 0) {
			String c = "";
			char[] a = r.readLine().toCharArray();
			w.write(makeString(a) + "\n");
			char[] b = r.readLine().toCharArray();
			w.write(makeString(b) + "\n");

			for (int i = 0; i < a.length; i++) {
				c += (a[i] == b[i]) ? "." : "*";
			}
			w.write(c + "\n");

		}
		w.flush();

	}

	private String makeString(char[] carr) {
		String ret = "";
		for (char c : carr) {
			ret += c;
		}
		return ret;
	}

	public static void main(String[] a) throws IOException {
		(new DetailedDifferences()).run();
	}
}
