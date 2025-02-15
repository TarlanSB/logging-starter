package ru.tsb.loggingstarter;

public class LoggingStarterAutoConfiguration {

    public static void println(String str) {
        System.out.println("Вызван из gradle библиотеки: " + str);
    }
}