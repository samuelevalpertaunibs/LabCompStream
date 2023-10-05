package it.unibs.pajc;

import java.util.stream.IntStream;

public class LabCompStreamApp {
    public static void main(String[] args) {

        IntStream
                .range(1, 20)
                .filter((a) -> (a % 2 == 0))
                .map((a) -> (int) Math.pow(a, 2))
                .map((a) -> Math.min(100, a))
                .forEach(System.out::println);
    }
}
