import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class planina {
    public static void main(String[] args) throws IOException {
        (new planina()).run();
    }

    int calculate(int n) {
        return (int) Math.pow(Math.pow(2, n) + 1, 2);

    }

    void run() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter w = new BufferedWriter(new OutputStreamWriter(System.out));
        w.write(calculate(Integer.parseInt(r.readLine())) + "\n");
        w.flush();
    }
}
