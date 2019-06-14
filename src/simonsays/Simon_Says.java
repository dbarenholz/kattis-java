package simonsays;

import java.io.*;
import java.util.*;

/**
 * Solution to the Simon Says problem.
 *
 * @author Daniel Barenholz
 */
public class Simon_Says {

    // use buffered reader and writer
    private BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] a)
            throws IOException {
        (new Simon_Says()).run();
    }

    private void run()
            throws IOException {
        // StringTokenizer : gives all tokens one by one
        StringTokenizer s = new StringTokenizer(r.readLine());
        int amountOfLines = Integer.parseInt(s.nextToken());
        // loop through all lines
        for (int i = 0; i < amountOfLines; i++) {
            // create new tokenizer for each line
            s = new StringTokenizer(r.readLine());
            if (s.nextToken().equals("Simon")) {
                if (s.nextToken().equals("says")) {
                    // print everything
                    while (s.hasMoreTokens()) {
                        w.write(s.nextToken() + " ");
                    }
                    w.write("\n");
                    w.flush();
                }
            }
        }
    }

}
