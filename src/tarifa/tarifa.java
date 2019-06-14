import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class tarifa {
	void run() throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		int x = Integer.parseInt(r.readLine()); // per month
		int n = Integer.parseInt(r.readLine()); // lines
		int a = n + 1; // n + 1 months
		int sum = 0; // calculate sum
		while (n-- > 0) {
			sum += Integer.parseInt(r.readLine());
		} // return value
		int ret = a * x - sum;
		w.write(ret + "\n");
		w.flush();

	}

	public static void main(String[] a) throws IOException {
		(new tarifa()).run();
	}
}
