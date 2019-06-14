package kemija08;

import java.io.*;
import java.util.*;

/**
 * Solution to the Kemija problem.
 *
 * @author Daniel Barenholz
 */
public class Kemija {

    public static void main(String[] a)
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());
        // String to return
        StringBuilder ret = new StringBuilder();
        // aiueo + ..
        String pattern = "([aiueo])(..)";
        // While more words do it
        while (s.hasMoreTokens()) {
            // get first word
            String word = s.nextToken();
            // pattern selects three letters, removing two is replacing by first
            // one
            ret.append(word.replaceAll(pattern, "$1"));
            ret.append(" ");
        }
        w.write(ret.toString());
        w.flush();
    }

}
