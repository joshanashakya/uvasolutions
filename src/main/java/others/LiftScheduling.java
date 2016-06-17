package others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LiftScheduling {
    public static void main(String[] args) {

        Request request = new Request();
        request.getRequestNo().add(5);
        request.getRequestNo().add(3);
        request.getRequestNo().add(-1);

        List<Integer> requestNos = request.getRequestNo();

        Lift lift = new Lift("upward", 0);

        String liftDirection = lift.getLiftDirection();

        int floorNo = lift.getFloorNo();

        Collections.sort(requestNos);

        Set<Integer> nums = new HashSet<Integer>(requestNos);

        List<Integer> stop = new LinkedList<Integer>();

        schedule(nums, liftDirection, floorNo, stop);

        System.out.println(stop);

    }

    private static void schedule(Set<Integer> requestNos, String liftDirection, int floorNo, List<Integer> stop) {

        switch (liftDirection) {
        case "upward":
            for (int num : requestNos) {
                if (floorNo <= num) {
                    stop.add(num);
                }
            }
            requestNos.removeAll(stop);
            while (requestNos.size() != 0) {
                schedule(requestNos, "downward", Collections.max(stop), stop);
            }
            break;
        case "downward":
            for (int num : requestNos) {
                if (floorNo >= num) {
                    stop.add(num);
                }
            }
            requestNos.removeAll(stop);
            while (requestNos.size() != 0) {
                schedule(requestNos, "upward", Collections.min(stop), stop);
            }
            break;
        }
    }

    private static class Request {
        List<Integer> requestNo = new ArrayList<Integer>();

        public List<Integer> getRequestNo() {
            return requestNo;
        }

    }

    private static class Lift {
        String liftDirection; // moving downward/ upward
        int floorNo; // where is it

        public Lift(String liftDirection, int floorNo) {
            this.liftDirection = liftDirection;
            this.floorNo = floorNo;
        }

        public String getLiftDirection() {
            return liftDirection;
        }

        public int getFloorNo() {
            return floorNo;
        }

    }
}
