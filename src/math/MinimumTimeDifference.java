package math;

import java.util.List;

public class MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {

        boolean[]time_seen = new boolean[24*60]; //1440

        for (String time:timePoints){
            String[]time_splits = time.split(":");

            int hour = Integer.parseInt(time_splits[0]);
            int minutes = Integer.parseInt(time_splits[1]);

            if ( time_seen[(hour*60)+minutes]) return 0;

            time_seen[(hour*60)+minutes]=true;


        }

        Integer first_time_seen = null;
        Integer prev_time_seen = null;
        Integer minimum_difference = Integer.MAX_VALUE;

        for (int i=0;i<1440;i++){
            if (time_seen[i]){
                if (first_time_seen==null){
                    first_time_seen=i;
                    prev_time_seen=i;
                }
                else {
                    minimum_difference = Math.min(minimum_difference,Math.min(i-prev_time_seen,
                            1440-i+prev_time_seen));
                    prev_time_seen=i;
                }
            }
        }
        minimum_difference = Math.min(minimum_difference,Math.min(prev_time_seen-first_time_seen,
                1440-prev_time_seen+first_time_seen));


        return minimum_difference;
    }

}
