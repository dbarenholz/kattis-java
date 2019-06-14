package autori;

import java.io.*;

/**
 * Solution to the autori problem.
 *
 * @author Daniel Barenholz
 */
public class autori {

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
				new BufferedWriter(new OutputStreamWriter(System.out));
        String[] words = r.readLine().split("-");
        for (String word : words) {
            w.write(word.charAt(0));
        }
        w.write("\n");
        w.flush();

    }

    public static void main(String[] a)
            throws IOException {
        (new autori()).run();
    }

}
