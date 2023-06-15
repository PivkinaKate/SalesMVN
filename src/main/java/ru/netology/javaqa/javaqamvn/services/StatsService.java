package ru.netology.javaqa.javaqamvn.services;
public class StatsService {



    public long sumSales (long[] sales) {
        long sumSales = 0;
        for (long sale : sales) {
            sumSales += sale;
        }
        return sumSales;

    }

    public long middleSales (long [] sales) {
        long sumSales = sumSales(sales);
        long middleSales = sumSales / sales.length;

        return middleSales;

    }

    public int maxSales (long [] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]){
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }


    public  int minSales (long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lowMiddleSales (long[] sales) {
        int quantityMonth = 0;
        for (long sale : sales) {
            if (sale < middleSales(sales))
                quantityMonth++;
        }
        return quantityMonth;
    }

    public int highMiddleSales (long[] sales) {
        int quantityMonth = 0;
        for (long sale : sales) {
            if (sale > middleSales(sales))
                quantityMonth++;
        }
        return quantityMonth;
    }




}
