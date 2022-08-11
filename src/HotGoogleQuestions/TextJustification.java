package HotGoogleQuestions;

//Given an array of strings words and a width maxWidth,
// format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.

import java.util.ArrayList;
import java.util.List;

public class TextJustification {


    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0, n = words.length;
        while (i < n) {
            int j = i + 1;
            int lineLength = words[i].length();
            while (j < n && (lineLength + words[j].length() + (j - i - 1) < maxWidth)) {
                lineLength += words[j].length();
                j++;
            }
            int diff = maxWidth - lineLength;
            int noOfWords = j - i;
            if (noOfWords == 1 || j >= n)
                result.add(leftJustify(words, diff, i, j));
            else
                result.add(middleJustify(words, diff, i, j));
            i = j;
        }
        return result;
    }

    private String leftJustify(String[] words, int diff, int i, int j) {
        StringBuilder sb = new StringBuilder(words[i]);
        int spacesOnRight = diff - (j - i - 1);
        for (int k = i + 1; k < j; k++) {
            sb.append(" " + words[k]);
        }
        sb.append(" ".repeat(spacesOnRight));
        return sb.toString();
    }

    private String middleJustify(String[] words, int diff, int i, int j) {
        StringBuilder sb = new StringBuilder(words[i]);
        int spacesNeeded = j - i - 1;
        int spaces = diff / spacesNeeded;
        int extraSpaces = diff % spacesNeeded;
        for (int k = i + 1; k < j; k++) {
            int spacesToApply = spaces + (extraSpaces-- > 0 ? 1 : 0);
            sb.append(" ".repeat(spacesToApply) + words[k]);
        }
        return sb.toString();

    }


}