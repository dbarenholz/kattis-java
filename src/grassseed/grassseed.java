package grassseed;

import java.io.*;
import java.util.*;

/**
 * Solution to the Grass Seed Inc problem
 *
 * @author Daniel Barenholz
 */
public class grassseed {

    public static void main(String[] a)
            throws IOException {
        (new grassseed()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        // actual value
        double val = 0;
        // cost
        double cost = Double.parseDouble(r.readLine());
        // number of lawns
        int lawns = Integer.parseInt(r.readLine());
        for (int i = 0; i < lawns; i++) {
            StringTokenizer s = new StringTokenizer(r.readLine());
            double width = Double.parseDouble(s.nextToken());
            double height = Double.parseDouble(s.nextToken());
            val += width * height;
        }
        w.write(cost * val + "\n");
        w.flush();

    }

}
