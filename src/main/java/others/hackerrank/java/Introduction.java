package others.hackerrank.java;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by one-1 on 10/23/16.
 */
public class Introduction {
//    static Scanner sc = new Scanner(System.in);
//    static boolean flag = true;
//    static int B = sc.nextInt();
//    static int H = sc.nextInt();
//
//    static {
//        try {
//            if(B <= 0 || H <= 0) {
//                flag = false;
//                throw new Exception("Breadth and height must be positive");
//            }
//        } catch (Exception ex) {
//            System.out.println(ex);
//        }
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        Calendar c = Calendar.getInstance();
        c.set(Integer.parseInt(year), Integer.parseInt(month) - 1, Integer.parseInt(day));
        int d = c.get(Calendar.DAY_OF_WEEK);
        switch(d) {
            case 1:
                System.out.println("SUNDAY");
                break;
            case 2:
                System.out.println("MONDAY");
                break;
            case 3:
                System.out.println("TUESDAY");
                break;
            case 4:
                System.out.println("WEDNESDAY");
                break;
            case 5:
                System.out.println("THURSDAY");
                break;
            case 6:
                System.out.println("FRIDAY");
                break;
            case 7:
                System.out.println("SATURDAY");
                break;
        }
    }

//    private void printArea() {
//        if(flag){
//            int area=B*H;
//            System.out.print(area);
//        }
//    }

    private void datatypes() {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            try {
                long x = sc.nextLong();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) {
                    System.out.println("* byte");
                }
                if (x >= -32768 && x <= 32767) {
                    System.out.println("* short");
                }
                if (x >= -2147483648 && x <= 2147483647) {
                    System.out.println("* int");
                }

                System.out.println("* long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }
        }
    }

    private void ifElse() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 != 0 || (6 <= n && n <= 20)) {
            System.out.println("Weird");
        } else {
            System.out.println("Not Weird");
        }
        sc.close();
    }
}
