package detaileddifferences;

import java.io.*;

/**
 * Solution to the detailed differences problem.
 *
 * @author Daniel Barenholz
 */
public class DetailedDifferences {

    public static void main(String[] a)
            throws IOException {
        (new DetailedDifferences()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));

        int testcases = Integer.parseInt(r.readLine());

        while (testcases-- > 0) {
            String c = "";
            char[] a = r.readLine().toCharArray();
            w.write(makeString(a) + "\n");
            char[] b = r.readLine().toCharArray();
            w.write(makeString(b) + "\n");

            for (int i = 0; i < a.length; i++) {
                c += (a[i] == b[i]) ? "." : "*";
            }
            w.write(c + "\n");

        }
        w.flush();

    }

    /**
     * Creates a string from a character array.
     *
     * @param carr character array
     * @return String from character array
     */
    private String makeString(char[] carr) {
        StringBuilder ret = new StringBuilder();
        for (char c : carr) {
            ret.append(c);
        }
        return ret.toString();
    }

}
