package online.uva.supereasy;
import java.util.Scanner;

public class AutomaticAnswer11547 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(getTensNum(sc.nextInt()));
        }
        sc.close();
    }

    private static int getTensNum(int n) {
        int num = (((((((n * 567) / 9) + 7492) * 235) / 47) - 498) % 100) / 10;
        if (num < 0) {
            return num * (-1);
        } else {
            return num;
        }
    }
}
