package mirror;

import java.io.*;
import java.util.*;

/**
 * Solution to the mirror images problem.
 *
 * @author Daniel Barenholz
 */
public class mirror_images {

    public static void main(String[] a)
            throws IOException {
        (new mirror_images()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int testcases = Integer.parseInt(r.readLine());
        // For all testcases
        for (int test = 1; test <= testcases; test++) {
            w.write("Test " + test + "\n"); // Test #

            StringTokenizer s = new StringTokenizer(r.readLine());
            int row = Integer.parseInt(s.nextToken()); // number of rows
            s.nextToken(); // skip columns

            String[] im = new String[row];

            // For all rows
            for (int i = 0; i < row; i++) {
                // reverse the string
                im[i] = new StringBuilder(r.readLine()).reverse().toString();
            }
            // Now print in reverse order
            for (int i = row - 1; i >= 0; i--) {
                w.write(im[i] + "\n");
            }
        }
        w.flush();
    }

}
