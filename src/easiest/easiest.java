import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class easiest {
    public static void main(String[] args) throws IOException {
        (new easiest()).run();
    }

    void run() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        // always read
        while (true) {
            // the number
            int n = Integer.parseInt(r.readLine());
            // as long as not 0
            if (n != 0) {
                int p = 11;
                // find the correct p
                while (sumDigit(n) != sumDigit(n * p)) {
                    p++;
                }
                // and print it
                w.write(p + "\n");
            } else {
                // if it is 0, we stop
                break;
            }
        }
        w.flush();
    }

    /**
     * @param a
     * @return sum of all digits of a
     */
    int sumDigit(int a) {
        int sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        return sum;
    }
}
