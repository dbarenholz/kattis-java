package oddities;

import java.io.*;

/**
 * Solution to the Oddities problem.
 *
 * @author Daniel Barenholz
 */
public class Oddities {

    // use buffered reader and writer
    private BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter w =
            new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] a)
            throws IOException {
        (new Oddities()).run();
    }

    private void run()
            throws IOException {
        // StringTokenizer : gives all tokens one by one
        int amountOfLines = Integer.parseInt(r.readLine());
        // loop through all lines
        for (int i = 0; i < amountOfLines; i++) {
            // create new tokenizer for each line
            int num = Integer.parseInt(r.readLine());
            if (num % 2 == 0) {
                w.write(num + " is even \n");
            } else {
                w.write(num + " is odd \n");

            }
        }
        w.flush();

    }

}
