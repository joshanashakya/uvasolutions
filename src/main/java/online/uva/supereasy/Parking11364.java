package online.uva.supereasy;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Travelling salesman problem
public class Parking11364 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for (int i = 0; i < num; i++) {
            int shopCount = in.nextInt();
            List<Integer> pos = new ArrayList<Integer>();
            for (int j = 0; j < shopCount; j++) {
                pos.add(in.nextInt());
            }
            System.out.println(getDistance(sort(pos)));
        }
        in.close();
    }

    private static int getDistance(List<Integer> distance) {
        return (distance.get(distance.size() - 1) - distance.get(0)) * 2;
    }

    private static List<Integer> sort(List<Integer> distance) {
        distance.sort(null);
        return distance;
    }
}
