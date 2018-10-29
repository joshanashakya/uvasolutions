package others.codility;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by one-1 on 12/18/16.
 */
public class FrogRiverOne {

    public static void main(String[] args) {
        System.out.println(solution(5, new int[]{1}, 1));
    }

    public static int solution(int X, int A[], int N) {
        int time = -1;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i< A.length; i++) {
            set.add(A[i]);
            if(set.size() == X) {
                time = i;
                break;
            }
        }
        return time;
    }
}
