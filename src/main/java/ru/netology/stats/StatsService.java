package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long sumAllSales = 0;
        for (long i = sumAllSales; i < sales.length; i++) {
            sumAllSales = sumAllSales + sales[(int) i];
        }
        return sumAllSales;
    }

    public long mediumSumSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maxMontSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minMonthSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int amountMonthsUnderMean(long[] sales) {
        long amountMonth = 0;

        for (long salesMonth : sales) {
            if (salesMonth < mediumSumSales(sales)) {
                amountMonth = amountMonth + 1;
            }
        }
        return (int) amountMonth;
    }

    public int amountMonthOverMean(long[] sales) {
        long amountMonth = 0;

        for (long salesMonth : sales) {
            if (salesMonth > mediumSumSales(sales)) {
                amountMonth = amountMonth + 1;
            }
        }
        return (int) amountMonth;
    }
}