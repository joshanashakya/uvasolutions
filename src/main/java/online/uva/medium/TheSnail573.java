package online.uva.medium;

import java.util.Scanner;

public class TheSnail573 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        while (n != 0) {
            double h = n;
            double u = sc.nextDouble();
            double d = sc.nextDouble();
            double f = sc.nextDouble();
            checkSnail(h, u, d, f);
            n = sc.nextDouble();
        }
        sc.close();
    }

    private static void checkSnail(double h, double u, double d, double f) {
        int day = 0;
        double initialHeight;
        double fatigueDistance = u * (double) f / 100;
        double distanceClimbed = 0;
        double heightAfterClimb;
        double heightAfterSlide = 0;
        boolean flag = false;

        while (true) {
            day++;

            initialHeight = heightAfterSlide;

            if (day == 1) {
                distanceClimbed = u;
            } else {
                distanceClimbed = distanceClimbed - fatigueDistance;
            }
            //            System.out.println(distanceClimbed);

            heightAfterClimb = initialHeight + distanceClimbed;

            if (heightAfterClimb > h) {
                flag = true;
                break;
            }

            if (heightAfterClimb < 0) {
                break;
            }

            heightAfterSlide = heightAfterClimb - d;

            if (heightAfterSlide < 0) {
                break;
            }

        }
        System.out.println(flag ? "success on day " + day : "failure on day " + day);

    }
}
