package online.uva.easy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class LumberjackSequencing11942 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Lumberjacks:");
        for (int i = 0; i < n; i++) {
            List<Integer> nums = new LinkedList<Integer>();
            for (int j = 0; j < 10; j++) {
                nums.add(sc.nextInt());
            }
            System.out.println(check(nums) ? "Ordered" : "Unordered");
        }
        sc.close();
    }

    private static boolean check(List<Integer> nums) {
        Iterator iterator = nums.iterator();
        Integer n1 = (Integer) iterator.next();
        Integer n2 = (Integer) iterator.next();

        if (n1 < n2) {
            return lessThan(nums);
        } else if (n1 > n2) {
            return moreThan(nums);
        } else {
            for (int i = 0; i < nums.size() - 1; i++) {
                nums.remove(n1);
                return check(nums);
            }
        }
        return false;
    }

    private static boolean moreThan(List<Integer> nums) {
        boolean flag = true;
        Iterator iterator = nums.iterator();
        Integer n1 = (Integer) iterator.next();
        while (iterator.hasNext()) {
            Integer n2 = (Integer) iterator.next();
            if (n1 < n2) {
                flag = false;
                break;
            }
            n1 = n2;
        }
        return flag;
    }

    private static boolean lessThan(List<Integer> nums) {
        boolean flag = true;
        Iterator iterator = nums.iterator();
        Integer n1 = (Integer) iterator.next();
        while (iterator.hasNext()) {
            Integer n2 = (Integer) iterator.next();
            if (n1 > n2) {
                flag = false;
                break;
            }
            n1 = n2;
        }
        return flag;
    }

}
