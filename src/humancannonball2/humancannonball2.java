package humancannonball2;

import java.io.*;
import java.util.*;

/**
 * Solution to the human cannonball problem.
 *
 * @author Daniel Barenholz
 */
public class humancannonball2 {

    public static void main(String[] args)
            throws IOException {
        (new humancannonball2()).run();
    }

    /**
     * Helper function to find if it is safe.
     *
     * @param initVel    initial velocity
     * @param angleInDeg angle in degrees
     * @param horDist    horizontal distance
     * @param loEdge     lower edge
     * @param upEdge     upper edge
     * @return {@code true} if it is safe, {@code false} otherwise
     */
    private boolean findSafe(double initVel, double angleInDeg, double horDist,
                             double loEdge, double upEdge) {
        double G = 9.81;
        double theta = Math.toRadians(angleInDeg);

        // Step 1: find t via x(t)
        double t = (horDist) / (initVel * Math.cos(theta));

        // Step 2: find out if between h1 and h2 via y(t)
        double y = (initVel * t * Math.sin(theta)) - ((G * t * t) / (2.0));

        return (y < (upEdge - 1)) && (y > (loEdge + 1));
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String safe = "Safe\n";
        String notSafe = "Not Safe\n";

        int testcases = Integer.parseInt(r.readLine());
        while (testcases-- > 0) {
            StringTokenizer s = new StringTokenizer(r.readLine());
            double v0 = Double.parseDouble(s.nextToken());
            double angle = Double.parseDouble(s.nextToken());
            double x1 = Double.parseDouble(s.nextToken());
            double h1 = Double.parseDouble(s.nextToken());
            double h2 = Double.parseDouble(s.nextToken());
            w.write(findSafe(v0, angle, x1, h1, h2) ? safe : notSafe);
        }
        w.flush();
    }

}
