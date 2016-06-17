package online.uva.medium;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GreedyGiftGivers119 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = 1;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            Map<String, Integer> friends = new LinkedHashMap<String, Integer>();

            for (int i = 0; i < num; i++) {
                friends.put(sc.next(), 0);
            }
            for (int i = 0; i < num; i++) {
                String giver = sc.next();
                int amt = sc.nextInt();
                int count = sc.nextInt();
                int given = 0;
                for (int j = 0; j < count; j++) {
                    String name = sc.next();
                    friends.put(name, (Integer) (friends.get(name) + amt / count));
                    given += amt / count;
                }
                friends.put(giver, friends.get(giver) - given);
            }
            Set<String> keys = friends.keySet();
            if (line != 1) {
                System.out.println();
            }
            for (String key : keys) {
                System.out.println(key + " " + friends.get(key));
            }
            line++;
        }
        sc.close();
    }
}
