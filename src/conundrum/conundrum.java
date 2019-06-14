package conundrum;

import java.io.*;

/**
 * Solution to the conundrum problem.
 *
 * @author Daniel Barenholz
 */
public class conundrum {

    public static void main(String[] a)
            throws IOException {
        (new conundrum()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        // store input in character array
        char[] in = r.readLine().toCharArray();
        // keep track of a counter
        int count = 0;

        // for all characters
        for (int i = 0; i < in.length; i++) {
            // if % 3 isn't P; replace
            if (i % 3 == 0) {
                if (in[i] != 'P') {
                    count++;
                }
            }
            // ifnot E, replace
            if (i % 3 == 1) {
                if (in[i] != 'E') {
                    count++;
                }
            }
            // if not R, replace
            if (i % 3 == 2) {
                if (in[i] != 'R') {
                    count++;
                }
            }
        }
        // output counter
        w.write(count + "\n");
        w.flush();

    }

}
