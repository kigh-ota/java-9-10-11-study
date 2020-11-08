package kigh;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        var message = "Hello"; // https://openjdk.java.net/jeps/286
        System.out.println(message);

        Path.of("data.txt");
    }
}
