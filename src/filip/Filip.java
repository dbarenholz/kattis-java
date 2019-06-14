package filip;

import java.io.*;
import java.util.*;

/**
 * Solution to the Filip problem
 *
 * @author Daniel Barenholz
 */
public class Filip {

    public static void main(String[] a)
            throws IOException {
        (new Filip()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());

        int a = Integer.parseInt(new StringBuilder(s.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(s.nextToken()).reverse().toString());
        w.write((a > b ? a : b) + "\n");
        w.flush();

    }

}
