package spavanac;

import java.io.*;
import java.util.*;

/**
 * Solution to the spavanac problem.
 *
 * @author Daniel Barenholz
 */
public class spavanac {

    public static void main(String[] a)
            throws IOException {
        (new spavanac()).run();
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());
        int hours = Integer.parseInt(s.nextToken());
        int minutes = Integer.parseInt(s.nextToken());
        int a = 15 + minutes;
        int b = minutes - 45;
        // If more than 45 mins, just subtract the number:
        if (minutes >= 45) {
            w.write(hours + " " + b + "\n");
        } else {
            // Otherwise, subtract one from the hours and write 15 + mins
            // Check for 0.
            if (hours == 0) {
                w.write("23 " + a + "\n");
            } else {
                int less = -- hours;
                w.write(less + " " + a + "\n");
            }
        }
        w.flush();

    }

}
