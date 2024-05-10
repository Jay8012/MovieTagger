package de.jay8012;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        long start = System.currentTimeMillis();
        Controller.start(args);
        System.out.println(System.currentTimeMillis() - start);
       }
}
