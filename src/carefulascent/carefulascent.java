import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class carefulascent {
    public static void main(String[] args) throws IOException {
        (new carefulascent()).run();
    }

    void run() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer s = new StringTokenizer(r.readLine());
        // save the x and y positions of firefly
        int[] pos = { Integer.parseInt(s.nextToken()), Integer.parseInt(s.nextToken()) };

        // the amount of shields to go through
        int nShields = Integer.parseInt(r.readLine());

        // the horizontal distance travelled through shields
        int hor_dist = 0;

        // the effective distance travelled
        double effective = 0.0;

        // for every shield
        for (int i = 0; i < nShields; i++) {
            // create a new string tokenizer
            s = new StringTokenizer(r.readLine());
            // save upper and lower bounds + multiplication factor
            int lower = Integer.parseInt(s.nextToken());
            int upper = Integer.parseInt(s.nextToken());
            double factor = Double.parseDouble(s.nextToken());

            // set the horizontal distance through the shield
            hor_dist += (upper - lower);
            // set the effective distance travelled.
            effective += (upper - lower) * factor;
        }

        // update the effective distance travelled
        effective += (pos[1] - hor_dist);

        // write the output
        w.write((pos[0] / effective) + "\n");
        w.flush();
    }
}
