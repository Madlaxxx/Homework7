package ru.netolgy.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    StatsService service = new StatsService();

    @Test
    public void ShouldSumAllSales() {

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.SumAllSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldMiddleMonthSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.MiddleMonthSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldGetMaxSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.getMaxSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldGetMinSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.getMinSales(sales);

        Assertions.assertEquals(actual, expected);
    }

    @Test
    public void ShouldMinMiddleMonthSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.minMiddleMonthSales(sales);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    public void ShouldMaxMiddleMonthSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.maxMiddleMonthSales(sales);

        Assertions.assertEquals(actual, expected);

    }
}
