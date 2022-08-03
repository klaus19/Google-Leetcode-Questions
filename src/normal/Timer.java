package normal;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Timer {

   int currenTime;
    int defaultTime;

    public void getCount(Duration loopInvisible){

        loopInvisible = Duration.of(10, ChronoUnit.SECONDS);
        int sec = currenTime-defaultTime;
        System.out.println(loopInvisible.getSeconds()-sec);
    }

    public static void main(String[] args) {
        Timer tr = new Timer();

        tr.getCount(Duration.ZERO);
    }
}
