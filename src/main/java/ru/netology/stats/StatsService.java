package ru.netology.stats;

public class StatsService {
    public long totalSellingCount(long[] sales) {
        long totalSelling = 0;
        for (long sale : sales) {
            totalSelling = totalSelling + sale;
        }
        return totalSelling;
    }

    public long averageSellingCount(long[] sales) {
        long averageSelling = totalSellingCount(sales) / sales.length;
        return averageSelling;
    }

    public int maxAmountMonth(long[] sales) {
        int maxMonth = 0;
        long maxAmountSelling = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= maxAmountSelling) {
                maxAmountSelling = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minAmountMonth(long[] sales) {
        int minMonth = 0;
        long minAmountSelling = sales[0];
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= minAmountSelling) {
                minAmountSelling = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public long lessThanAverage(long[] sales) {
        long lessThanAverage = 0;
        for (long sale : sales) {
            if (sale < averageSellingCount(sales)) {
                lessThanAverage++;
            }
        }
        return lessThanAverage;
    }

    public long moreThanAverage(long[] sales) {
        long moreThanAverage = 0;
        for (long sale : sales) {
            if (sale < averageSellingCount(sales)) {
                moreThanAverage++;
            }
        }
        return moreThanAverage;
    }
}
