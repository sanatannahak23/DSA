package com.tp.stream;

//Q. Given a list of transactions, find the sum of transaction amounts for each day using Java streams:

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Transactions {
    public String data;
    public int amount;

    public Transactions(String data, int amount) {
        this.data = data;
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

public class SumOfTransaction {

    public static void main(String[] args) {
        List<Transactions> transactions = Arrays.asList(
                new Transactions("2022-01-01", 100),
                new Transactions("2022-01-01", 200),
                new Transactions("2022-01-02", 300),
                new Transactions("2022-01-02", 400),
                new Transactions("2022-01-03", 500)
        );

        Map<String, Integer> collect = transactions
                .stream()
                .collect(Collectors.groupingBy(Transactions::getData, Collectors.summingInt(Transactions::getAmount)));

    }
}
