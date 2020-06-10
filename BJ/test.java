package com.example.example06;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class StreamSample {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "banana", "strawberry", "orange", "melon");
        System.out.println("■ これまでの書き方(forでループする)");
        List<String> upperLongFruits1 = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() > 5) {
                String upperCase = fruit.toUpperCase();
                upperLongFruits1.add(upperCase);
            }
        }
        System.out.println("■ Stream APIでの書き方");
        List<String> upperLongFruits2 = fruits.stream()
                .filter(s -> s.length() > 5)
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
    }
}
