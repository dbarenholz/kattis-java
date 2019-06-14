import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

// TODO FIX THIS
public class Server {
	// use buffered reader and writer
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

	void run() throws IOException {
		w.write(findNumber() + "\n");
		w.flush();
	}

	int findNumber() throws IOException {
		StringTokenizer s = new StringTokenizer(r.readLine());
		// Amount of numbers
		int n = Integer.parseInt(s.nextToken());
		// Max minutes possible
		int t = Integer.parseInt(s.nextToken());
		// count number of times we can help
		int counter = 0;
		// For n amount, add one each time then test if it's larger than T, if
		// so subtract one and print it, else, continue
		int value = 0;
		// Read the line
		s = new StringTokenizer(r.readLine());
		// loop over all possible numbers
		for (int i = 0; i < n; i++) {
			// add the number to value50
			value += Integer.parseInt(s.nextToken());
			// test if the value has become larger than possible
			if (value > t) {
				// if so, subtract one from counter and return
				return counter;
				// else continue
			} else {
				counter++;
			}
		}
		return counter;

	}

	public static void main(String[] a) throws IOException {
		(new Server()).run();
	}
}
