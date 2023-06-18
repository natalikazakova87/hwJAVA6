package ru.netology.javaqa.hwJAVA6.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void findSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMiddleSalesInMonth() {
        StatsService service = new ru.netology.javaqa.hwJAVA6.stats.StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 15;
        long actualSum = service.middleSalesInMonth(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void findMaxMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        long actual = (int) service.maxMonthSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void findMinMonthSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        long actualMonth = (int) service.minMonthSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void findBelowMiddleSalesInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelowMid = 5;
        long actualBelowMid = service.belowMiddleSalesInMonth(sales);

        Assertions.assertEquals(expectedBelowMid, actualBelowMid);
    }

    @Test
    public void findHigherMiddleSalesInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedHigherMid = 5;
        long actualHigherMid = service.higherMiddleSalesInMonth(sales);

        Assertions.assertEquals(expectedHigherMid, actualHigherMid);
    }
}