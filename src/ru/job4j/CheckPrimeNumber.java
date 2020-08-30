package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
         boolean rsl = false;
        for (int index = 2; index <= number - 1;) {
            if (number % index == 0) {
                rsl = false;
            } else {
               rsl = true;
            }
            break;
        }
        return rsl;
    }
}
