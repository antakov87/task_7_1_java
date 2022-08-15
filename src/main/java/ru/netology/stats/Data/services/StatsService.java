package ru.netology.stats.Data.services;

public class StatsService {
    public int sumAllSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageAmountSales(long[] sales) {
        int sum = sumAllSales(sales);
        return sum / 12;
    }

    public int maxSales(long[] sales) {
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

    public int minSales(long[] sales) {
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

    public int salesBelowAverage(long[] sales) {
        int counter = 0;
        int avgSum = averageAmountSales(sales);
        for (long sale : sales) {
            if (avgSum > sale) {
                counter++;
            }
        }
        return counter;
    }

    public int salesUnderAverage(long[] sales) {
        int counter = 0;
        int avgSum = averageAmountSales(sales);
        for (long sale : sales) {
            if (avgSum < sale) {
                counter++;
            }
        }
        return counter;
    }

}
