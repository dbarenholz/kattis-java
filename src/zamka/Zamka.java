import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Zamka {
	// Takes the sum of all digits
	static int sumD(int i) {
		int temp = i;
		int sum = 0;
		while (temp > 0) {
			sum += temp % 10;
			temp = temp / 10;
		}
		return sum;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int l = Integer.parseInt(r.readLine()); // l < n < d
		int d = Integer.parseInt(r.readLine()); // l < m < d
		int x = Integer.parseInt(r.readLine()); // n.sumDigit = x,
		Set<Integer> set = new HashSet<>();

		while (l <= d) {
			// if the sum equals to x
			if (sumD(l) == x) {
				// add to set
				set.add(l);
			}
			l++;
		}
		// Collections.min(set);
		// System.out.println(set);
		w.write(Collections.min(set) + "\n");
		w.write(Collections.max(set) + "\n");
		w.flush();

	}
}
