import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class faktor {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

		// read input
		StringTokenizer s = new StringTokenizer(r.readLine());
		double a = Double.parseDouble(s.nextToken());
		double i = Double.parseDouble(s.nextToken());

		// calculate output
		double ai = a * i;
		while (ai-- > 0) {
			if (!((ai / a) > i - 1)) {
				break;
			}
		}

		// compensate
		ai++;
		w.write((int) ai + "\n");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new faktor()).run();
	}
}
