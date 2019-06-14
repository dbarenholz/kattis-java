import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Apaxiaans {
	public static void main(String[] a) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		String s = r.readLine();
		// Replace all multiple occurrences by a the first occurence
		// see -
		// http://stackoverflow.com/questions/20171598/replace-multiple-consecutive-occurrences-of-a-character-with-a-single-occurrence
		String pattern = "([a-zA-Z])(\\1{1,})";
		String sh = s.replaceAll(pattern, "$1");
		w.write(sh);
		w.flush();
	}
}
