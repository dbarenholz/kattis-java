package r2;

import java.io.*;
import java.util.*;

/**
 * Solution to the R2 problem.
 *
 * @author Daniel Barenholz
 */
public class r2 {

    public static void main(String[] a)
            throws IOException {
        (new r2()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());
        // Read two ints
        int a = Integer.parseInt(s.nextToken());
        int b = Integer.parseInt(s.nextToken());
        w.write((2 * b) - a + "");
        w.flush();

    }

}
