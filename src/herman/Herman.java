package herman;

import java.io.*;

/**
 * Solution to the Herman problem.
 *
 * @author Daniel Barenholz
 */
public class Herman {

    public static void main(String[] a)
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        int radius = Integer.parseInt(r.readLine());
        double pi = Math.PI;
        double normalArea = pi * Math.pow(radius, 2);
        double taxiCab = 2 * Math.pow(radius, 2);
        w.write(normalArea + "\n");
        w.write(taxiCab + "\n");
        w.flush();
    }

}
