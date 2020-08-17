package ru.job4j.ru.job4j.condition;

import ru.job4j.condition.SqArea;

public class SqAreaTest {
    public static double square(int p, int k) {
        double L = p / (2 * (k + 1)) * k;
        double h = p / (2 * (k + 1));
        double rsl = L * h;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}
