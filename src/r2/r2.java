import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class r2 {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer s = new StringTokenizer(r.readLine());
		// Read two ints
		int a = Integer.parseInt(s.nextToken());
		int b = Integer.parseInt(s.nextToken());
		w.write((2 * b) - a + "");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new r2()).run();
	}
}
