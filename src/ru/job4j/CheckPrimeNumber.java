package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean rsl = number > 1;
        int n = 2;
        while(n < number) {
            for (int index = n; index < number; index++) {
                if (number % index == 0) {
                    rsl = false;
                    continue;
                }
            }
            break;
        }
        return rsl;
    }
}
