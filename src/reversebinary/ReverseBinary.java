import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReverseBinary {
	// use buffered reader and writer
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

	void run() throws IOException {
		// read the number
		int num = Integer.parseInt(r.readLine());
		// create a binary representation
		String binRep = Integer.toBinaryString(num);
		// Use StringBuilder to reverse the string.
		String reversed = new StringBuilder(binRep).reverse().toString();
		// Parse as integer base 2.
		w.write(Integer.parseInt(reversed, 2) + "\n");
		w.flush();
	}

	public static void main(String[] a) throws IOException {
		(new ReverseBinary()).run();
	}
}
