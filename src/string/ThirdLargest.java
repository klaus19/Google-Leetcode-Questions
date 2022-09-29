package string;

import java.util.Arrays;

public class ThirdLargest {


    public static void main(String[] args) {
        String[] words={"Word","Longer Word","Longest Word Here"};
        Arrays.sort(words,(s1,s2)->Integer.compare(s2.length(),s1.length()));


        System.out.println(words[0]);


    }
}
