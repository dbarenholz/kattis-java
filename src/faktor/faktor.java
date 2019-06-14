package faktor;

import java.io.*;
import java.util.*;

/**
 * Solution to the Faktor problem
 *
 * @author Daniel Barenholz
 */
public class faktor {

    public static void main(String[] a)
            throws IOException {
        (new faktor()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));

        // read input
        StringTokenizer s = new StringTokenizer(r.readLine());
        double a = Double.parseDouble(s.nextToken());
        double i = Double.parseDouble(s.nextToken());

        // calculate output
        double ai = a * i;
        while (ai-- > 0) {
            if (! ((ai / a) > i - 1)) {
                break;
            }
        }

        // compensate
        ai++;
        w.write((int) ai + "\n");
        w.flush();

    }

}
