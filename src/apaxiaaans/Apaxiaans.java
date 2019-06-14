package apaxiaaans;

import java.io.*;

/**
 * Solution to the Apaxiaans problem.
 *
 * @author Daniel Barenholz
 */
public class Apaxiaans {

    public static void main(String[] a)
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        String s = r.readLine();
        String pattern = "([a-zA-Z])(\\1{1,})";
        String sh = s.replaceAll(pattern, "$1");
        w.write(sh);
        w.flush();
    }

}
