package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatsServiceTest {
    StatsService service = new StatsService();
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
            void shouldFindSum () {
        long expected = 180;
        long actual = service.shouldFindSum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindAverage() {
        long expected = 15;
        long actual = service.shouldFindAverage(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMax() {
        long expected = 8;
        long actual = service.shouldFindMonthWithMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMax() {
        long expected = 20;
        long actual = service.shouldFindMax(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMin() {
        long expected = 7;
        long actual = service.shouldFindMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthWithMin() {
        long expected = 9;
        long actual = service.shouldFindMonthWithMin(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthLessThenAverage() {
        long expected = 5;
        long actual = service.shouldFindMonthLessThenAverageCount(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindMonthMoreThenAverage() {
        long expected = 5;
        long actual = service.shouldFindMonthMoreThenAverageCount(purchases);
        assertEquals(expected, actual);
    }

}