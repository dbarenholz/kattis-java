package dst;

import java.io.*;
import java.util.*;

/**
 * Solution to the DST problem.
 *
 * @author Daniel Barenholz
 */
public class dst {

    public static void main(String[] a)
            throws IOException {
        (new dst()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        // input
        int n = Integer.parseInt(r.readLine());
        while (n-- > 0) {
            // read a line
            StringTokenizer s = new StringTokenizer(r.readLine());
            // F : add stuff, B: subtract stuff
            String fb = s.nextToken();
            // value to add/subtr
            int d = Integer.parseInt(s.nextToken()); // value to add / sub
            int h = Integer.parseInt(s.nextToken()); // hours
            int m = Integer.parseInt(s.nextToken()); // minutes

            // if nothing to add or subtract
            if (d == 0) {
                // then just output hours and minutes
                w.write(h + " " + m + "\n");
            } else if (fb.equals("F")) {
                int sum = m + d;
                // we have to account for 2 hours
                if (sum >= 60) {
                    h++;
                    sum -= 60;
                    // second hour
                    if (sum >= 60) {
                        h++;
                        sum -= 60;
                    }
                }
                h = (h % 24); // remove unnecessary hours
                String out = h + " " + sum + "\n";
                w.write(out);
            } else if (fb.equals("B")) {
                // subtract
                int min = m - d;
                if (min < 0) { // 2 hours
                    h--;
                    min += 60;
                    if (min < 0) {
                        h--;
                        min += 60;
                    }
                }
                // negative hours, add 24 to it
                if (h < 0) {
                    h += 24;
                }
                String out = h + " " + min + "\n";
                w.write(out);
            }

        }
        w.flush();

    }

}
