package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rsl = number > 1;
            for (int index = 2; index < number; index++) {
                if (number % index == 0) {
                    rsl = false;
                    break;
                }
        }
        return rsl;
    }
}
