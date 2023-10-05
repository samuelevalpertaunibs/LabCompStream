package it.unibs.pajc;

import java.util.stream.IntStream;

public class LabCompStreamApp {
    public static void main(String[] args) {

        IntStream
                .range(1, 20)
                .mapToObj(x -> String.format("File_%02d", x))
                .forEach(System.out::println);
    }
}
