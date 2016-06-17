package online.uva.easy;
import java.util.Scanner;

public class EcologicalPremium10300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            int no = sc.nextInt();
            long budget = 0;
            for (int j = 0; j < no; j++) {
                budget += getPremium(sc.nextLong(), sc.nextLong(), sc.nextLong());
            }
            System.out.println(budget);
        }
        sc.close();
    }

    private static long getPremium(long size, long animalNo, long friendliness) {
        return size * friendliness;
    }
}
