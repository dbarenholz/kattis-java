import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class quick_estimates {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(r.readLine());
		while (n-- > 0) {
			String line = r.readLine();
			int length = line.length();
			w.write(length + "\n");
		}
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new quick_estimates()).run();
	}
}
