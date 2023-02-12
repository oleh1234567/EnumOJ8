package tests;

import java.util.Arrays;
import java.util.stream.Stream;

import static tests.Films.*;


public class EnClass {
    public static void main(String[] args) {
        Stream.of(Films.values())
                .peek(e -> System.out.println(e + " ordinal = " + e.ordinal()))
                .peek(e -> System.out.print(e.compareTo(DIE_HARD) + " "))
                .peek(e -> System.out.print((e == DIE_HARD) + " "))
                .peek(e -> System.out.println(e.equals(DIE_HARD)))
                .peek(e -> System.out.println(e.getDeclaringClass()))
                .peek(e -> System.out.println(e.name()))
                .forEach(e -> System.out.println("********************"));

        Arrays.stream("TERMINATOR DIE_HARD ADOLF_HITLER".split(" "))
                .forEach(s -> System.out.println(Enum.valueOf(Films.class, s)));

    }
}