package online.uva.easy;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoansomeCarBuyer10114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int duration = sc.nextInt();
            if (duration < 0) {
                break;
            }
            double payment = sc.nextDouble();
            double loan = sc.nextDouble();
            int record = sc.nextInt();
            Map<Integer, Double> monthPer = new HashMap<Integer, Double>();
            for (int i = 0; i < record; i++) {
                monthPer.put(sc.nextInt(), sc.nextDouble());
            }
            int months = getMonths(duration, payment, loan, monthPer);
            System.out.println(months == 1 ? months + " month" : months + " months");
        }
        sc.close();
    }

    private static int getMonths(int duration, double payment, double loan, Map<Integer, Double> monthPer) {
        int num = 0;
        double rate = monthPer.get(0);
        double value = getValue((payment + loan), rate);
        for (int i = 1; i <= duration; i++) {
            if (loan < value) {
                break;
            }
            if (monthPer.get(i) != null) {
                rate = monthPer.get(i);
            }
            value = getValue(value, rate);
            loan = getLoan(payment, loan);
            num = i;
        }
        return num;
    }

    private static double getValue(double value, double rate) {
        return (value - value * rate);
    }

    private static double getLoan(double payment, double loan) {
        return (loan - payment);
    }
}
