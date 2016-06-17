package online.uva.medium;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BlowingFuses661 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        int sequencecount = 1;
        while (n != 0 && m != 0 && c != 0) {
            Map<Integer, Boolean> deviceStatus = new HashMap<Integer, Boolean>();
            Map<Integer, Integer> deviceConsumption = new HashMap<Integer, Integer>();
            Map<Integer, Integer> consumptionSequence = new HashMap<Integer, Integer>();
            for (int i = 1; i <= n; i++) {
                deviceStatus.put(i, false);
                deviceConsumption.put(i, sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                int device = sc.nextInt();
                deviceStatus.put(device, !deviceStatus.get(device));
                int devCon = deviceConsumption.get(device);
                if (deviceStatus.get(device)) {
                    if (i == 0) {
                        consumptionSequence.put(i, devCon);
                    } else {
                        consumptionSequence.put(i, consumptionSequence.get(i - 1) + devCon);
                    }
                } else {
                    consumptionSequence.put(i, consumptionSequence.get(i - 1) - devCon);
                }
            }
            int max = Collections.max(consumptionSequence.values());
            System.out.println("Sequence " + sequencecount);
            if (max > c) {
                System.out.println("Fuse was blown.\n");
            } else {
                System.out.println("Fuse was not blown.");
                System.out.println("Maximal power consumption was " + max + " amperes.\n");
            }
            n = sc.nextInt();
            m = sc.nextInt();
            c = sc.nextInt();
            sequencecount++;
        }
        sc.close();
    }
}
