import java.util.Arrays;

public class MathUtils {    

    /**
     * This method calculating first quartile, median, third quartile,
     * and interquartile range(IQR) for an array
     */
    public static void calculateQuartilesData(double[] dataArr) {
        Arrays.sort(dataArr);
        int n = dataArr.length;
        double firstQuartile = 0;
        double thirdQuartile = 0;
        double median = 0;
        if (n == 1){
            median = firstQuartile = thirdQuartile = dataArr[0];
        } else {
            if (n % 2 != 0) {
                int m = ((n + 1) / 2) - 1;
                median = dataArr[m];
                if (m % 2 != 0) {
                    int q1 = ((m + 1) / 2) - 1;
                    firstQuartile = dataArr[q1];
                    int q3 = ((m + 1) / 2) + m;
                    thirdQuartile = dataArr[q3];
                } else {
                    int q1 = ((m + 1) / 2) - 1;
                    firstQuartile = (dataArr[q1] + dataArr[q1 + 1]) / 2;
                    int q3 = ((m + 1) / 2) + m;
                    thirdQuartile = (dataArr[q3] + dataArr[q3 + 1]) / 2;
                }
            } else {
                int m = ((n + 1) / 2) - 1;
                median = (dataArr[m] + dataArr[m + 1]) / 2;
                if (m % 2 == 0) {
                    int q1 = (m + 1) / 2;
                    firstQuartile = dataArr[q1];
                    int q3 = q1 + m + 1;
                    thirdQuartile = dataArr[q3];
                } else {
                    int q1 = ((m + 1) / 2) - 1;
                    firstQuartile = (dataArr[q1] + dataArr[q1 + 1]) / 2;
                    int q3 = q1 + m + 1;
                    thirdQuartile = (dataArr[q3] + dataArr[q3 + 1]) / 2;
                }
            }
        }
        System.out.println("first quartile -- > " + firstQuartile);
        System.out.println("third quartile -- > " + thirdQuartile);
        System.out.println("IQR -- > " + (thirdQuartile - firstQuartile));
        System.out.println("median -- > " + median);
    }  
        
}
