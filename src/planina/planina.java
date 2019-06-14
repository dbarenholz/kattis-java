package planina;

import java.io.*;

/**
 * Solution to the planina problem.
 *
 * @author Daniel Barenholz
 */
public class planina {

    public static void main(String[] args)
            throws IOException {
        (new planina()).run();
    }

    /**
     * Helper function for computations
     *
     * @param n integer to compute with
     * @return the calculation necessary
     */
    private int calculate(int n) {
        return (int) Math.pow(Math.pow(2, n) + 1, 2);

    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        w.write(calculate(Integer.parseInt(r.readLine())) + "\n");
        w.flush();
    }

}
