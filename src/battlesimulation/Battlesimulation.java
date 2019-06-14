package battlesimulation;

import java.io.*;

/**
 * Solution to the Battlesimulation problem.
 *
 * @author Daniel Barenholz
 */
public class Battlesimulation {

    public static void main(String[] a)
            throws IOException {
        (new Battlesimulation()).run();
    }

    /**
     * Helper function to check if {@code arr} is a combo move.
     *
     * @param arr character array that is or is not a combo move
     * @return '+' if the char[] is a combo move, '-' otherwise
     */
    private char isCombo(char[] arr) {
        // RBK || RKB || BKR || BRK || KRB || KBR
        return ((arr[0] != arr[1]) && (arr[1] != arr[2]) && (arr[0] != arr[2])) ? '+' : '-';
    }

    /**
     * Helper function to match a character.
     *
     * @param c character to match
     * @return 'S' if {@code c == 'R'}, 'H' if {@code c == 'L'}. 'K' if
     * {@code c
     * == 'B'}, Returns '~' otherwise.
     */
    private char match(char c) {
        switch (c) {
            case 'R': // an S in case of R
                return 'S';
            case 'B': // a K in case of B
                return 'K';
            case 'L': // an H in case of L
                return 'H';
        }
        return '~';
    }

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
				new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        char[] in = r.readLine().toCharArray();

        for (int i = 0; i < (in.length); i++) {

            char[] t; // initialize a temp array

            try {
                t = new char[] {in[i], in[i + 1], in[i + 2]};
            } catch (ArrayIndexOutOfBoundsException e) {
                // impossible, so we have to process the last 2 characters
                try {
                    while (true) {
                        sb.append(match(in[i]));
                        i++;
                    }
                } catch (ArrayIndexOutOfBoundsException e2) {
                    break;
                }
            }

            switch (isCombo(t)) {
                case '+': // if a combo
                    sb.append('C'); // write a c
                    i += 2; // add 2 to index
                    break;
                case '-': // if not a combo
                    sb.append(match(in[i])); // match the character
                    break;
            }
        }
        sb.append("\n");
        w.write(sb.toString()); // write the output
        w.flush();

    }

}
