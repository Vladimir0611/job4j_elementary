package ru.job4j;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println("Размер массива ages равен: " + ages.length);
        String[] surnames = new String[100500];
        System.out.println("Размер массива surnames равен: " + surnames.length);
        float[] princes = new float[40];
        System.out.println("Размер массива princes равен: " + princes.length);

        String[] names = new String[4];
        names[0] = "Alex Alexeev";
        names[1] = "Petr Petrov";
        names[2] = "Ivan Ivanov";
        names[3] = "Maxim Maximov";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
