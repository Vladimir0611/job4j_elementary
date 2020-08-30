package ru.job4j;

public class CheckPrimeNumber {
    public static boolean check(int number) {
         boolean rsl = false;
         int index = 2;
        while (index <= number - 1) {
            if (number % index == 0) {
                rsl = false;
break;
            } else {
                rsl = true;
                index += 1;

            }
        }
        return rsl;
    }
}
