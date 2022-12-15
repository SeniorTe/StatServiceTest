package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {

    @Test
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(statisticSales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindMediumSumSales() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMediumSum = 15;
        long actualMediumSum = service.mediumSumSales(statisticSales);

        Assertions.assertEquals(expectedMediumSum, actualMediumSum);
    }

    @Test
    public void shouldFindMonthMaxSales() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthMax = 8;
        long actualMonthMax = service.maxMontSales(statisticSales);

        Assertions.assertEquals(expectedMonthMax, actualMonthMax);
    }

    @Test
    public void shouldFindMonthMinSales() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMonthMin = 9;
        long actualMonthMin = service.minMonthSales(statisticSales);

        Assertions.assertEquals(expectedMonthMin, actualMonthMin);
    }

    @Test
    public void shouldFindAmountMonthUnderMean() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountMonthUMean = 5;
        long actualAmountMonthUMean = service.amountMonthsUnderMean(statisticSales);

        Assertions.assertEquals(expectedAmountMonthUMean, actualAmountMonthUMean);
    }

    @Test
    public void shouldFindAmountMonthOverMean() {
        StatsService service = new StatsService();

        long[] statisticSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAmountMonthOMean = 5;
        long actualAmountMonthOMean = service.amountMonthOverMean(statisticSales);

        Assertions.assertEquals(expectedAmountMonthOMean, actualAmountMonthOMean);
    }
}