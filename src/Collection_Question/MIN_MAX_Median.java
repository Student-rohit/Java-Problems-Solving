package Question;

import java.util.*;

public class MIN_MAX_Median {

    public static List<Integer> medians(List<Integer> values, int k) {

        Collections.sort(values);

        int n = values.size();
        int mid = (k - 1) / 2;

        int minMedian = values.get(mid);
        int maxMedian = values.get(n - k + mid);

        return Arrays.asList(maxMedian, minMedian);
    }

    public static void main(String[] args) {

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        int k = 3;

        List<Integer> result = medians(values, k);

        System.out.println(result);
    }
}