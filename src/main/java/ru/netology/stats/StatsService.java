package ru.netology.stats;

public class StatsService {
    public long shouldFindSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }

    public long shouldFindAverage(long[] purchases) {
        return shouldFindSum(purchases) / purchases.length;
    }

    public long shouldFindMonthWithMax(long[] purchases) {
        long max = shouldFindMax(purchases);
        int numberOfMonth = 0;
        int numberOfMonthWithMax = 0;
        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (purchase == max) {
                numberOfMonthWithMax = numberOfMonth;
            }
        }
        return numberOfMonthWithMax;
    }

    public long shouldFindMax(long[] purchases) {
        long max = purchases[0];
        for (long purchase : purchases) {
            if (purchase > max) {
                max = purchase;
            }
        }
        return max;
    }


    public long shouldFindMonthWithMin(long[] purchases) {
        long min = shouldFindMin(purchases);
        int numberOfMonth = 0;
        int numberOfMonthWithMin = 0;
        for (long purchase : purchases) {
            numberOfMonth += 1;
            if (purchase == min) {
                numberOfMonthWithMin = numberOfMonth;
            }
        }
        return numberOfMonthWithMin;
    }


    public long shouldFindMin(long[] purchases) {
        long min = purchases[0];
        for (long purchase : purchases) {
            if (purchase < min) {
                min = purchase;
            }
        }
        return min;
    }

    public long shouldFindMonthLessThenAverageCount(long[] purchases) {
        long average = shouldFindAverage(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase < average) {
                count += 1;
            }
        }
        return count;
    }

    public long shouldFindMonthMoreThenAverageCount(long[] purchases) {
        long average = shouldFindAverage(purchases);
        int count = 0;
        for (long purchase : purchases) {
            if (purchase > average) {
                count += 1;
            }
        }
        return count;
    }
}