import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class symmetricorder {
    public static void main(String[] args) throws IOException {
        (new symmetricorder()).run();
    }

    void run() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = 1;

        int cases = Integer.parseInt(r.readLine());
        while (cases != 0) {
            // We have cases to go through
            List<String> namesEven = new ArrayList<>();
            List<String> namesOdd = new ArrayList<>();
            String[] out = new String[cases];

            // fill the names array
            for (int i = 0; i < cases; i++) {
                if ((i % 2) == 0) {
                    namesEven.add(r.readLine());
                } else {
                    namesOdd.add(r.readLine());
                }
            }

            // First all even indices in order
            for (String name : namesEven) {
                out[namesEven.indexOf(name)] = name;
            }

            // then all uneven indices in reversed order
            List<String> oddReversed = new ArrayList<>();
            for (int i = namesOdd.size() - 1; i >= 0; i--) {
                oddReversed.add(namesOdd.get(i));
            }

            for (String name : oddReversed) {
                out[(namesEven.size()) + oddReversed.indexOf(name)] = name;
            }

            // write out name array
            w.write("SET " + caseNo + "\n");
            for (int i = 0; i < cases; i++) {
                w.write(out[i] + "\n");
            }
            caseNo++;
            cases = Integer.parseInt(r.readLine());
        }
        w.flush();

    }
}
