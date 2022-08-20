package HotGoogleQuestions;

import java.util.HashMap;
import java.util.Map;

public class SnapShotArray {

    HashMap<Integer, Map<Integer,Integer>>hm ;
    HashMap<Integer,Integer>map;
    int snap_id;

    public SnapShotArray(int length) {
        hm = new HashMap<>();
        map = new HashMap<>();
        snap_id=0;

    }

    public void set(int index, int val) {

        map.put(index,val);
    }

    public int snap() {

        hm.put(snap_id,(HashMap<Integer,Integer>)map.clone());
        return snap_id++;

    }

    public int get(int index, int snap_id) {
        return  hm.get(snap_id).getOrDefault(index,0);
    }
}
/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */