package bela;

import java.io.*;
import java.util.*;

/**
 * Solution to the Bela problem.
 *
 * @author Daniel Barenholz
 */
public class Bela {

    public static void main(String[] a)
            throws IOException {
        (new Bela()).run();
    }

    private void run()
            throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());

        int hands = 4 * Integer.parseInt(s.nextToken());
        char dom = s.nextToken().toCharArray()[0];

        int ret = 0;
        while (hands-- > 0) {
            char[] currentPair = r.readLine().toCharArray();
            switch (currentPair[0]) {
                case 'A':
                    ret += 11;
                    break;
                case 'K':
                    ret += 4;
                    break;
                case 'Q':
                    ret += 3;
                    break;
                case 'J':
                    ret += (dom == currentPair[1]) ? 20 : 2;
                    break;
                case 'T':
                    ret += 10;
                    break;
                case '9':
                    ret += (dom == currentPair[1]) ? 14 : 0;
                    break;
            }
        }

        w.write(ret + "\n");
        w.flush();

    }

}
