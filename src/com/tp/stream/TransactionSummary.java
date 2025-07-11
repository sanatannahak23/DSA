package com.tp.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionSummary {

    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("user1", 200.50, "January"),
                new Transaction("user2", 150.75, "January"),
                new Transaction("user1", 300.00, "February"),
                new Transaction("user3", 500.00, "January"),
                new Transaction("user2", 100.00, "February"),
                new Transaction("user1", 50.00, "March"),
                new Transaction("user3", 300.00, "February")
        );

        Map<String, Double> collect = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getUserId,
                        Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(collect);

    }
}
