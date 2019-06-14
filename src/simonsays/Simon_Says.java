import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Simon_Says {
	// use buffered reader and writer
	BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

	void run() throws IOException {
			// StringTokenizer : gives all tokens one by one
			StringTokenizer s = new StringTokenizer(r.readLine());
			int amountOfLines = Integer.parseInt(s.nextToken());
			// loop through all lines
			for (int i = 0 ; i < amountOfLines ; i ++) {
				// create new tokenizer for each line
				s = new StringTokenizer(r.readLine());
				if(s.nextToken().equals("Simon")) {
					if(s.nextToken().equals("says")) {
						// print everything
						while (s.hasMoreTokens()) {
							w.write(s.nextToken() + " ");
						}
						w.write("\n");
						w.flush();
					}
				}
			}
	}
	
	public static void main(String[] a) throws IOException {
		(new Simon_Says()).run();
	}
}
