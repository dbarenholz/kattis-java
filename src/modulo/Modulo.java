import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

// TODO: Fix counting different numbers in array

public class Modulo {

	// puts numbers in array
	void run() throws NumberFormatException, IOException {

		// use buffered reader and writer
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		// create a set
		Set<Integer> set = new HashSet<>();
		// add ints mod 42 to set
		for (int i = 0; i < 10; i++) {
			set.add(Integer.parseInt(read.readLine()) % 42);
		}
		write.write(set.size() + "\n");
		write.flush();
	}

	public static void main(String[] a) throws NumberFormatException, IOException {
		(new Modulo()).run();
	}
}
