package ru.job4j;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
          amount = (int) (amount * (1 + (0.01 * percent)) - salary);
          year++;
        }
        return year;
    }

}
