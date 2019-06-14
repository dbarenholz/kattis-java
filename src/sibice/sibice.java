package sibice;

import java.io.*;
import java.util.*;

/**
 * Solution to the sibice problem.
 *
 * @author Daniel Barenholz
 */
public class sibice {

    public static void main(String[] a)
            throws IOException {
        (new sibice()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());

        int N = Integer.parseInt(s.nextToken());
        int W = Integer.parseInt(s.nextToken());
        int H = Integer.parseInt(s.nextToken());

        String fit = "DA\n";
        String notFit = "NE\n";

        while (N-- > 0) { // while n is larger than zero, each loop it subtracts
            // one after comparison
            int c = Integer.parseInt(r.readLine());
            if (c * c <= H * H + W * W) {
                w.write(fit);
            } else {
                w.write(notFit);
            }

        }

        w.flush();

    }

}
