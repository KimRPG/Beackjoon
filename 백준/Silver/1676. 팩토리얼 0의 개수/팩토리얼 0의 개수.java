import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ans = 0;
        for (int i = 1; i <= N; i++) {
            if (i % 125 == 0) {
                ans += 3;
            } else if (i % 25 == 0) {
                ans += 2;
            } else if (i % 5 == 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
