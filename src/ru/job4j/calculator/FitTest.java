package ru.job4j.calculator;

import ru.job4j.converter.Converter;

public class FitTest {

    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {

        short height = 187;
        double woman = ru.job4j.Fit.womanWeight(height);
        double man = ru.job4j.Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        System.out.println("Man 187 is " + woman);
    }

}
