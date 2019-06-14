package quickestimate;

import java.io.*;

/**
 * Solution to the quick estimates problem.
 *
 * @author Daniel Barenholz
 */
public class quick_estimates {

    public static void main(String[] a)
            throws IOException {
        (new quick_estimates()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(r.readLine());
        while (n-- > 0) {
            String line = r.readLine();
            int length = line.length();
            w.write(length + "\n");
        }
        w.flush();

    }

}
