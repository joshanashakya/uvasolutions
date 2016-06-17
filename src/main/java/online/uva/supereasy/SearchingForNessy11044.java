package online.uva.supereasy;
import java.util.Scanner;

public class SearchingForNessy11044 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(count(in.nextInt(), in.nextInt()));
        }
        in.close();
    }

    private static int count(int n, int m) {
        int count = 0;
        if (6 <= n && m <= 10000) {
            for (int i = 0; i < n && n - i >= 3; i = i + 3) {
                for (int j = 0; j < m && m - j >= 3; j = j + 3) {
                    count += 1;
                }
            }
        }
        return count;
    }
}
