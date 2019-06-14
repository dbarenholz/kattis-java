package speedlimit;

import java.io.*;
import java.util.*;

/**
 * Solution to the speed limit problem.
 *
 * @author Daniel Barenholz
 */
public class speedlimit {

    private BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
    private String m = " miles\n";

    public static void main(String[] a)
            throws IOException {
        (new speedlimit()).run();
    }

    private void run()
            throws IOException {
        int testcases = Integer.parseInt(r.readLine());
        while (testcases != - 1) {
            int result = 0;
            int previousTValue = 0;
            for (int i = 0; i < testcases; i++) {
                StringTokenizer st = new StringTokenizer(r.readLine());
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                result += s * (t - previousTValue);
                previousTValue = t;
            }
            w.write(result + m);
            testcases = Integer.parseInt(r.readLine());
        }
        w.flush();
    }

}
