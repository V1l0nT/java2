package src.lab1;

public class Main {
    public static void main(String[] args) {
        String str1 = "abc123def456ghi";
        String str2 = "xyz789uvw123";

        StringSumComparator comparator = new StringSumComparator();
        int result = comparator.compare(str1, str2);

        if (result < 0) {
            System.out.println(str1 + " меньше, чем " + str2);
        } else if (result > 0) {
            System.out.println(str1 + " больше, чем " + str2);
        } else {
            System.out.println(str1 + " равно " + str2);
        }
    }
}
