package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        for (int index = 0; index < word.length - 1; index++) {
            if (word[index] == pref[index]) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}