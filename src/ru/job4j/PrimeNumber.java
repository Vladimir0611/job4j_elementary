package ru.job4j;

public class PrimeNumber {
    public static int calc(int finish) {
        int count = 0;
        boolean rsl = false;
        int index = 2;
        for (int number = 2; number <= finish; number++) {
            if (number % index == 0) {
                count = count;
                index += 1;
            } else if (number % index == 0) {
                count = count;
            } else {
                count = count + 1;

            }
            index = 2;
        }
        return count;
    }
}



