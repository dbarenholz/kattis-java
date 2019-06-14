package alphabetspam;

import java.io.*;

/**
 * Solution to the alphabetspam problem.
 *
 * @author Daniel Barenholz
 */
public class alphabetspam {

    private void run()
            throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w =
                new BufferedWriter(new OutputStreamWriter(System.out));
        // read line
        String characters = r.readLine();
        // Double characters : string
        // Single characters : characters
        char whitespace = '_';
        double length = characters.length();
        double whitespaces = 0;
        double lower = 0;
        double upper = 0;

        for (int i = 0; i < length; i++) {
            // count whitespaces
            if (characters.charAt(i) == whitespace) {
                whitespaces++;
            }
            // count lower case letters
            if (Character.isLowerCase(characters.charAt(i))) {
                lower++;
            }
            // count upper case letters
            if (Character.isUpperCase(characters.charAt(i))) {
                upper++;
            }
        }
        double symb = length - whitespaces - lower - upper;

        double a = whitespaces / length;
        double b = lower / length;
        double c = upper / length;
        double d = symb / length;
        w.write(a + "\n");
        w.write(b + "\n");
        w.write(c + "\n");
        w.write(d + "\n");
        w.flush();

    }

    public static void main(String[] a)
            throws IOException {
        (new alphabetspam()).run();
    }

}
