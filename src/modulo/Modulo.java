package modulo;

import java.io.*;
import java.util.*;

/**
 * Solution to the Modulo problem.
 *
 * @author Daniel Barenholz
 */
public class Modulo {

    public static void main(String[] a)
            throws NumberFormatException, IOException {
        (new Modulo()).run();
    }

    // puts numbers in array
    private void run()
            throws NumberFormatException, IOException {

        // use buffered reader and writer
        BufferedReader read =
                new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter write =
                new BufferedWriter(new OutputStreamWriter(System.out));
        // create a set
        Set<Integer> set = new HashSet<>();
        // add ints mod 42 to set
        for (int i = 0; i < 10; i++) {
            set.add(Integer.parseInt(read.readLine()) % 42);
        }
        write.write(set.size() + "\n");
        write.flush();
    }

}
