package online.uva.supereasy;
import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(check(sc.nextInt(), sc.nextInt()));
        }
        sc.close();
    }

    private static String check(int num1, int num2) {
        if (num1 < num2) {
            return "<";
        } else if (num1 > num2) {
            return ">";
        } else {
            return "=";
        }
    }

}
