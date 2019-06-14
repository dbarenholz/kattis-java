import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class grassseed {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		// actual value
		double val = 0;
		// cost
		double cost = Double.parseDouble(r.readLine());
		// number of lawns
		int lawns = Integer.parseInt(r.readLine());
		for (int i = 0; i < lawns; i++) {
			StringTokenizer s = new StringTokenizer(r.readLine());
			double width = Double.parseDouble(s.nextToken());
			double height = Double.parseDouble(s.nextToken());
			val += width * height;
		}
		w.write(cost * val + "\n");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new grassseed()).run();
	}

}
