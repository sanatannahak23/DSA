package com.tp.stream;

public class Transaction {

    private String userId;
    private double amount;
    private String month;

    public Transaction(String userId, double amount, String month) {
        this.userId = userId;
        this.amount = amount;
        this.month = month;
    }

    public String getUserId() {
        return userId;
    }

    public double getAmount() {
        return amount;
    }

    public String getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "userId='" + userId + '\'' +
                ", amount=" + amount +
                ", month='" + month + '\'' +
                '}';
    }
}
