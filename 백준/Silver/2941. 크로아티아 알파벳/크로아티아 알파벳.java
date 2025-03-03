import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        br.close();

        // 크로아티아 알파벳을 "X"로 변환
        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String s : croatian) {
            str = str.replace(s, "X");
        }

        System.out.println(str.length());
    }
}
