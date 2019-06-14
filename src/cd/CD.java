package cd;

import java.io.*;
import java.util.*;

/**
 * Solution to the CD problem.
 *
 * @author Daniel Barenholz
 */
public class CD {

    // use buffered reader and writer
    private BufferedReader r =
            new BufferedReader(new InputStreamReader(System.in));
    private BufferedWriter w =
            new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] a)
            throws IOException {
        (new CD()).run();
    }

    private void run()
            throws IOException {
        while (true) {
            // StringTokenizer : gives all tokens one by one
            StringTokenizer s = new StringTokenizer(r.readLine());
            // Number CD from person 1
            int n = Integer.parseInt(s.nextToken());
            // Number CD from person 2
            int m = Integer.parseInt(s.nextToken());
            // check if we're at the end of the test cases
            if (n == 0 && m == 0) {
                break;
            }
            // create three sets to keep track of the numbers
            Set<Integer> setOne = new HashSet<>();
            Set<Integer> bothSets = new HashSet<>();
            Set<Integer> setTwo = new HashSet<>();
            // add for the first set
            for (int i = 0; i < n; i++) {
                int cd = Integer.parseInt(r.readLine());
                setOne.add(cd);
                bothSets.add(cd);
            }
            // add for the second set
            for (int i = 0; i < m; i++) {
                int cd = Integer.parseInt(r.readLine());
                setTwo.add(cd);
                bothSets.add(cd);
            }
            // write the answer
            w.write(setOne.size() + setTwo.size() - bothSets.size() + "\n");
        }
        // needed for bufferedwriter
        w.flush();
    }

}
