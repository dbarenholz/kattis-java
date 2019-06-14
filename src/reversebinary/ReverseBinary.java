package reversebinary;

import java.io.*;

/**
 * Solution to the Reverse Binary problem.
 *
 * @author Daniel Barenholz
 */
public class ReverseBinary {

    // use buffered reader and writer
    private BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter w =
            new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] a)
            throws IOException {
        (new ReverseBinary()).run();
    }

    private void run()
            throws IOException {
        // read the number
        int num = Integer.parseInt(r.readLine());
        // create a binary representation
        String binRep = Integer.toBinaryString(num);
        // Use StringBuilder to reverse the string.
        String reversed = new StringBuilder(binRep).reverse().toString();
        // Parse as integer base 2.
        w.write(Integer.parseInt(reversed, 2) + "\n");
        w.flush();
    }

}
