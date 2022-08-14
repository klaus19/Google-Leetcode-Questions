package HardQuestions;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveNumber {

    public int firstMissingPositiveNumber(int[]nums){
        Set<Integer>set = new HashSet<>();
        int count=0;

        for (int num:nums){
            if (num>0){
                set.add(num);
                count++;
            }
        }

        int result=1;

    }

}
