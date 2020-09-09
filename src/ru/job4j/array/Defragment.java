package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                for (int index1 = index; index1 < array.length; index1++) {
                    if (array[index1] != null) {
                        array[point] = array[index1];
                        array[index1] = null;
                        break;
                    }
                }
            }
        }
            return array;
    }
}
