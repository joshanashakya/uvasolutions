package online.uva.easy;
import java.util.Scanner;
import java.util.regex.Pattern;

public class SecretResearch621 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println(check(sc.next()));
        }
        sc.close();
    }

    private static String check(String n) {
        if (Pattern.matches("1|4|78", n)) {
            return "+";
        } else if (Pattern.matches("(\\d)*35", n)) {
            return "-";
        } else if (Pattern.matches("9(\\d)*4(\\d)*", n)) {
            return "*";
        } else if (Pattern.matches("190(\\d)*", n)) {
            return "?";
        }
        return "?";
    }
}
