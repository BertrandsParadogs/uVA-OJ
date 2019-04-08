import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = r.readLine()) != null) {
            String[] tokens = s.split("\\s");
            getOutput(Integer.parseInt(tokens[0]), Integer.parseInt(tokens[1]));
        }
    }

    private static void getOutput(int i, int j) {
        System.out.printf("%d %d ", i, j);
        if (i > j) {
            int tmp = j;
            j = i;
            i = tmp;
        }
        int max = 0;
        int curLen = 0;

        while (i <= j) {
            int n = i;
            curLen = 1;
            while (n != 1) {
                if (n%2 == 1) {
                    n = 3*n + 1;
                    curLen++;
                }
                n >>= 1;
                curLen++;
            }
            max = Math.max(max, curLen);
            i++;
        }
        System.out.println(max);
    }
}