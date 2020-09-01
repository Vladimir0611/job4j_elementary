package ru.job4j.array;

public class Check {

    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length - 1; index++) {
                data[0] = data[index + 1];
                if (data[0] == false) {
                    result = data[0];
                    break;
                }
            }
            return result;
        }
    }
