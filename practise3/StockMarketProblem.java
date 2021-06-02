package com.java.learning.practise3;

public class StockMarketProblem {
    public static void main(String[] args) {
        int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};
        getMaxProfit(arr);
    }

    private static void getMaxProfit(int[] nums) {
        int buy_day = 0;
        int sell_day = 1;
        int buy_price = Integer.MIN_VALUE;
        int sell_price = Integer.MIN_VALUE;
        int profit = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                buy_price = nums[i];
                sell_price = nums[j];
                if (profit < (sell_price - buy_price)) {
                    profit = sell_price - buy_price;
                    buy_day = i;
                    sell_day = j;
                }

            }
        }

        System.out.println("Best profit when bought on day " + buy_day + " with price "+nums[buy_day]+" and sold on " + sell_day + " with price "+nums[sell_day]+" , with a profit of: " + profit);

    }
}
