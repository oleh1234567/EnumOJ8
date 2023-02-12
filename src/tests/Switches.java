package tests;

import java.util.stream.IntStream;

import static tests.Films.*;

public class Switches {
    Films film = TERMINATOR;

    public void change() {
        switch (film) {
            case TERMINATOR:
                film = ADOLF_HITLER;
                break;
            case DIE_HARD:
                film = TERMINATOR;
                break;
            case ADOLF_HITLER:
                film = DIE_HARD;
                break;
        }
    }

    public static void main(String[] args) {
        Switches switches = new Switches();
        IntStream.range(0, 10)
                .forEach(i -> {
                    switches.change();
                    System.out.println(switches.film);
                });
    }
}
