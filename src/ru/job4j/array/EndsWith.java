package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
    boolean result = true;
        for (int index = word.length - post.length; index < word.length; index++) {
        if (word[index] == post[index - word.length + post.length]) {
            result = true;
        } else {
            result = false;
            break;
        }
    }
        return result;
}
}

