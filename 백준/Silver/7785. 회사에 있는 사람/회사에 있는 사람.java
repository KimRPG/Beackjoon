import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        TreeSet<String> set = new TreeSet<>((o1, o2) -> {
            return o2.compareTo(o1);});
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String command = st.nextToken();

            if (command.equals("enter")) {
                set.add(name);
            }
            else{
                set.remove(name);
            }
        }

        for (String string : set) {
            sb.append(string).append("\n");
        }

        System.out.println(sb);
    }
}
