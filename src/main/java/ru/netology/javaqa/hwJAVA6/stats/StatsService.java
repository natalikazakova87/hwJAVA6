package ru.netology.javaqa.hwJAVA6.stats;
public class StatsService {
    public long sumAllSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    public long middleSalesInMonth(long[] sales) {
        long sum = sumAllSales(sales);
        long mid = sum / sales.length;

        return mid;
    }

    public long maxMonthSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long minMonthSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long belowMiddleSalesInMonth(long[] sales) {
        long mid = middleSalesInMonth(sales);
        long belowMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < mid) {
                belowMid++;
            }
        }
        return belowMid;
    }

    public long higherMiddleSalesInMonth(long[] sales) {
        long mid = middleSalesInMonth(sales);
        long belowMid = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > mid) {
                belowMid++;
            }
        }
        return belowMid;
    }

}