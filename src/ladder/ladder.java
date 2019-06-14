package ladder;

import java.io.*;
import java.util.*;

/**
 * Solution to the ladder problem.
 *
 * @author Daniel Barenholz
 */
public class ladder {

    public static void main(String[] a)
            throws IOException {
        (new ladder()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // read input
        StringTokenizer s = new StringTokenizer(r.readLine());
        int h = Integer.parseInt(s.nextToken());
        int v = Integer.parseInt(s.nextToken());
        // h / sin(v)
        int out = (int) Math.ceil(h / Math.sin(Math.toRadians(v)));
        w.write(out + "\n");
        w.flush();

    }

}
