import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class bus {
	// use buffered reader and writer
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

	void run() throws IOException {
		// first number
		int n = Integer.parseInt(r.readLine());
		// StringTokenizer : gives all tokens one by one
		StringTokenizer s = new StringTokenizer(r.readLine());
		List<Integer> l = new ArrayList<>();
		// put all numbers in set
		for (int i = 0; i < n; i++) {
			l.add(Integer.parseInt(s.nextToken()));
		}
		// sort list
		Collections.sort(l);
		for (int i = 0; i < l.size(); i++) {
			int j;
			for (j = i + 1; j < l.size(); j++) {
				if (l.get(j) > l.get(j - 1) + 1) {
					break;
				}
			}
			j--;
			// int i = leftside incl
			// int j = rightside incl
			if (i == j) {
				w.write(l.get(j) + " ");
			} else if (l.get(i) == l.get(j) - 1) {
				w.write(l.get(i) + " ");
				w.write(l.get(j) + " ");
			} else {
				w.write(l.get(i) + "-" + l.get(j) + " ");
			}
			w.flush();
			i = j;
		}
	}

	public static void main(String[] a) throws IOException {
		(new bus()).run();
	}
}
