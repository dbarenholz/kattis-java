import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class everywhere {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int testCases = Integer.parseInt(r.readLine());
		// for every test case
		for (int i = 0; i < testCases; i++) {
			// create a set
			Set<String> words = new HashSet<>();
			// with this many input words
			int numberOfWords = Integer.parseInt(r.readLine());
			// add all words to the set
			for (int j = 0; j < numberOfWords; j++) {
				words.add(r.readLine());
			}
			// output size of the set.
			w.write(words.size() + "\n");
		}
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new everywhere()).run();
	}

}
