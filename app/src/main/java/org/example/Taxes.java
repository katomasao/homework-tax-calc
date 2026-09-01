package org.example;


public class Taxes {
    static final int rateByEMS = 15;
    static final int rateByEarnings = 6;

    public static int byEarnings(int earnings) {
        return earnings * rateByEarnings / 100;
    }

    public static int byEarningsMinusSpendings(int earnings, int spendings) {
        int tax = (earnings - spendings) * rateByEMS / 100;
        return Math.max(tax, 0);
    }

}
