import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] a = br.readLine().toCharArray();
        int b = Integer.parseInt(br.readLine());
        System.out.println(a[b - 1]);
    }
}