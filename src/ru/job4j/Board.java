package ru.job4j;

public class Board {
    public static void paint(int width, int height) {
        int sum = 0;
        for (int row = 1; row <= height; row++) {
            for (int cell = 1; cell <= width; cell++) {
                sum = row + cell;
                if (sum % 2 == 0) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
            }
        }

        public static void main (String[]args){
            paint(3, 3);
            System.out.println();
            paint(4, 4);
        }
}
