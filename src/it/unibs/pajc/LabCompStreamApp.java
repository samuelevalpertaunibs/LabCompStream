package it.unibs.pajc;

import java.util.stream.IntStream;

public class LabCompStreamApp {
    public static void main(String[] args) {

        IntStream
                .range(0, 26)
                .mapToObj(x -> String.format("%c_%02d", 'a'+x, x))
                .filter(s -> {
                    char ch = s.charAt(0);
                    return (ch >= 'e' && ch <= 'o');
                })
                .map(s -> s.substring(s.length() - 2, s.length()))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);
    }
}
