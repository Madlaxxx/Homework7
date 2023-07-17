package ru.netolgy.stats;

public class StatsService {

    public long SumAllSales(long[] sales) {
        long sumsales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumsales += sales[i];
        }
        return sumsales;
    }

    public long MiddleMonthSales(long[] sales) {
        long sumsales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumsales += sales[i];
        }
        long middlesales = sumsales / 12;

        return middlesales;
    }

    public long getMaxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long getMinSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int minMiddleMonthSales(long[] sales) {
        int minMiddleSales = 0;
        for (long sale : sales) {
            if (sale < MiddleMonthSales(sales)) {
                minMiddleSales++;
            }
        }
        return minMiddleSales;
    }

    public int maxMiddleMonthSales(long[] sales) {
        int maxMiddleSales = 0;
        for (long sale : sales) {
            if (sale > MiddleMonthSales(sales)) {
                maxMiddleSales++;
            }
        }
        return maxMiddleSales;
    }
}