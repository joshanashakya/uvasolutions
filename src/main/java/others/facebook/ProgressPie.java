package others.facebook;

import java.util.Scanner;

/**
 * Created by one-1 on 1/7/17.
 */
public class ProgressPie {
    public static void main(String[] args) {
        int centerx = 50;
        int centery = 50;
        int radius = 50;
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int caseNo = 1;
        while (caseNo <= no) {
            int percentage = sc.nextInt();
            double point1 = sc.nextDouble();
            double point2 = sc.nextDouble();

            String color = null;

            if (percentage > 0) {
                double degree = ((double) percentage / 100) * 360;
                double x = calculatex(degree, centerx, radius);
                double y = calculatey(degree, centery, radius);

                double xplus = x + Math.pow(10, -6);
                double xminus = x - Math.pow(10, -6);

                double yplus = y + Math.pow(10, -6);
                double yminus = y - Math.pow(10, -6);

                if ((point1 <= x && point2 <= y)) {
                    color = "black";
                } else {
                    color = "white";
                }
            } else {
                color = "white";
            }
            System.out.println(String.format("Case #%d: %s", caseNo, color));
            caseNo++;
        }
    }

    private static double calculatex(double degree, int centerx, int radius) {
        return centerx + radius * Math.cos(degree * Math.PI /180);
    }

    private static double calculatey(double degree, int centery, int radius) {
        return centery + radius * Math.sin(degree * Math.PI /180);
    }
}
