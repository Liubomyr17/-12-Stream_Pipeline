package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
    Stream<String> onceModifiedStream = Stream.of("abdc", "bbcd", "cbcd").skip(1);
    onceModifiedStream.forEach(System.out::println);
    System.out.println("-------------------------------");

    Stream<String> stream = Stream.of("abc1", "bcd2", "xyz3");
    Stream<String> twiceModifiedStream = stream.skip(1).map(element -> element.substring(0, 3));
    twiceModifiedStream.forEach(System.out::println);

    System.out.println("------------------------------");
        List<String> list = Arrays.asList("abc1", "abc2", "abc3");
        long size = list.stream().skip(1).map(element -> element.substring(0, 3)).sorted().count();
        System.out.println(size);
    }
}
