package online.uva.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EventPlanning11559 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int participants = sc.nextInt();
            int budget = sc.nextInt();
            int numHotel = sc.nextInt();
            int numWeek = sc.nextInt();

            int minCost = budget;
            boolean flag = false;

            for (int i = 0; i < numHotel; i++) {
                int price = sc.nextInt();
                int cost = price * participants;
                List<Integer> rooms = new ArrayList<Integer>();
                for (int j = 0; j < numWeek; j++) {
                    rooms.add(sc.nextInt());
                }
                if (cost <= budget) {
                    if (Collections.max(rooms) >= participants) {
                        flag = true;
                    }
                }

                if (flag) {
                    if (minCost > cost) {
                        minCost = cost;
                    }
                }
            }
            if (flag) {
                System.out.println(minCost);
            } else {
                System.out.println("stay home");
            }
        }
        sc.close();
    }
}
