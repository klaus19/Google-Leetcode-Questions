import java.util.HashMap;

public class Logger {

    HashMap<String,Integer>times;

    public Logger(){
        times = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp,String msg){
        // 1.Is the message unique
        // 2.Has it been 10 seconds since we've last seen it

        if (times.containsKey(msg)){
           if(timestamp-times.get(msg)>=10){
               times.put(msg,timestamp);
               return true;
           }
           return false;
        }else {
            times.put(msg,timestamp);
            return true;
        }

    }
}
