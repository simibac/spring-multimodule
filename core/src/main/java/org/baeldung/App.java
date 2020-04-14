package org.baeldung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class, args);
        RandomNumberServiceImpl randomNumberService = new RandomNumberServiceImpl();
        randomNumberService.flipCoin();
    }
}
