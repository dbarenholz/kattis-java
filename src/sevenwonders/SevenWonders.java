import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class SevenWonders {
	public static void main(String[] a) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
		// the word
		String word = r.readLine();
		int len = word.length();
		// A piece of code to count for every single character the amount
		Map<Character, Integer> numChars = new HashMap<Character, Integer>(Math.min(len, 26));
		for (int i = 0; i < len; ++i) {
			char charAt = word.charAt(i);
			if (!numChars.containsKey(charAt)) {
				numChars.put(charAt, 1);
			} else {
				numChars.put(charAt, numChars.get(charAt) + 1);
			}
		}
		// building the string to use
		String map = numChars.toString();
		String properString = map.replace("{", "");
		properString = properString.replace(",", "");
		properString = properString.replace("}", "");
		properString = properString.replace("}", "");
		// ALWAYS CTG, SO REMOVE NLETTERS AS WELL
		properString = properString.replace("C", "");
		properString = properString.replace("T", "");
		properString = properString.replace("G", "");
		properString = properString.replace("=", "");
		// stringtokenizer for the integers
		StringTokenizer s = new StringTokenizer(properString);
		int c;
		int t;
		int g;
		try {
			c = Integer.parseInt(s.nextToken());
		} catch (NoSuchElementException e) {
			c = 0;
		}
		try {
			t = Integer.parseInt(s.nextToken());
		} catch (NoSuchElementException e) {
			t = 0;
		}
		try {
			g = Integer.parseInt(s.nextToken());
		} catch (NoSuchElementException e) {
			g = 0;
		}
		int val = (int) (Math.pow(c, 2) + Math.pow(t, 2) + Math.pow(g, 2));
		// Now the checks for adding 7.
		int add = Math.min(c, t);
		add = Math.min(add, g);
		val += add * 7;
		w.write(val + "\n");

		w.flush();
	}
}
