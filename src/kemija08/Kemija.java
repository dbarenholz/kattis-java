import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Kemija {
	public static void main(String[] a) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer s = new StringTokenizer(r.readLine());
		// String to return
		String ret = "";
		// aiueo + ..
		String pattern = "([aiueo])(..)";
		// While more words do it
		while (s.hasMoreTokens()) {
			// get first word
			String word = s.nextToken();
			// pattern selects three letters, removing two is replacing by first
			// one
			ret += word.replaceAll(pattern, "$1");
			ret += " ";
		}
		w.write(ret);
		w.flush();
	}
}
