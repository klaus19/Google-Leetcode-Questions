package HardQuestions;

import java.util.Map;
import java.util.TreeMap;

public class AmountofAreaPaintedEachDay {

    public int[] amountPainted(int[][] paint) {

        int[] amountPainted = new int[paint.length];

        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(paint[0][0], paint[0][1]);

        amountPainted[0] = paint[0][1] - paint[0][0];

        for (int i = 1; i < paint.length; i++) {

            int start = paint[i][0];
            int end = paint[i][1];
            int area = end - start;

            // Merge all previous overlappig entries and subtract the area too
            Map.Entry<Integer, Integer> entry;
            while ((entry = treeMap.lowerEntry(end)) != null) {
                int prevStart = entry.getKey();
                int prevEnd = entry.getValue();
                if (prevEnd <= start)
                    break;

                area -= Math.min(end, prevEnd) - Math.max(start, prevStart);
                start = Math.min(start, prevStart);
                end = Math.max(end, prevEnd);
                treeMap.remove(prevStart);
            }

            treeMap.put(start, end);
            amountPainted[i] = area;
        }

        return amountPainted;
    }
}
