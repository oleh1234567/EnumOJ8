package tests;

import java.util.Arrays;
import java.util.stream.Stream;

import static tests.Films.*;

public class ConstructorsTests {
    public static void main(String[] args) {
        Stream.of(Films.values())
                .forEach(e -> System.out.println(e + " " + e.getDescription()));
    }
}
