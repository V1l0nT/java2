package src.lab1;

import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSumComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        int sum1 = getNumberSum(s1);
        int sum2 = getNumberSum(s2);
        return Integer.compare(sum1, sum2);
    }

    private int getNumberSum(String str) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }
        return sum;
    }
}