import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class autori {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] words = r.readLine().split("-");
		for (String word : words) {
			w.write(word.charAt(0));
		}
		w.write("\n");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new autori()).run();
	}
}
