import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class speedlimit {
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
	String m = " miles\n";

	void run() throws IOException {
		int testcases = Integer.parseInt(r.readLine());
		while (testcases != -1) {
			int result = 0;
			int previousTValue = 0;
			for (int i = 0; i < testcases; i++) {
				StringTokenizer st = new StringTokenizer(r.readLine());
				int s = Integer.parseInt(st.nextToken());
				int t = Integer.parseInt(st.nextToken());
				result += s * (t - previousTValue);
				previousTValue = t;
			}
			w.write(result + m);
			testcases = Integer.parseInt(r.readLine());
		}
		w.flush();
	}

	public static void main(String[] a) throws IOException {
		(new speedlimit()).run();
	}
}
