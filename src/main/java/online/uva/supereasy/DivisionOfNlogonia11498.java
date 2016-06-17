package online.uva.supereasy;
import java.util.Scanner;

public class DivisionOfNlogonia11498 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            int divN = in.nextInt();
            int divM = in.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println(getCountry(divN, divM, in.nextInt(), in.nextInt()));
            }
        }
        in.close();
    }

    private static String getCountry(int n, int m, int x, int y) {
        if (x < n && y < m) {
            return "SO";
        } else if (x < n && y > m) {
            return "NO";
        } else if (x > n && y < m) {
            return "SE";
        } else if (x > n && y > m) {
            return "NE";
        } else {
            return "divisa";
        }

    }
}
