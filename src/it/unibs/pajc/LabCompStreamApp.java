package it.unibs.pajc;

import java.util.stream.IntStream;

public class LabCompStreamApp {
    public static void main(String[] args) {

        IntStream
                .range(0, 26)
                .mapToObj(x -> String.format("%c_%d", 'a'+x, x))
                .filter((x) -> (int)x.charAt(0) >= 'e')
                .filter((x) -> (int)x.charAt(0) <= 'o')
                .forEach((x) -> System.out.printf("%c\n", x.charAt(0)));
    }
}
