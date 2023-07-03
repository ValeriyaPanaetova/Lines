package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void statisticSaleSum() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statisticSaleSum(sale);

        // Задаём контрольное значение
        long expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleAverageMonth() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        double actual = (double) service.statisticSaleAverageMonth(sale);

        // Задаём контрольное значение
        double expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMax() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statisticSaleMax(sale);

        // Задаём контрольное значение
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticSaleMin() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statisticSaleMin(sale);

        // Задаём контрольное значение
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthUnderAverage() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statisticMonthUnderAverage(sale);

        // Задаём контрольное значение
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void statisticMonthOverAverage() {
        StatsService service = new StatsService();
        // Подготавливаем данные:
        int[] sale = new int[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Вызываем метод
        int actual = (int) service.statisticMonthOverAverage(sale);

        // Задаём контрольное значение
        long expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}