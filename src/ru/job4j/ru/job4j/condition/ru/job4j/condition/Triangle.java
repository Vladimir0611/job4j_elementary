package ru.job4j.ru.job4j.condition.ru.job4j.condition;

public class Triangle {

        public static boolean exist(double ab, double ac, double bc) {
            boolean t1 = (ab + ac) > bc;
            boolean t2 = (bc + ac) > ab;
            boolean t3 = (bc + ab) > ac;
            return t1 && t2 && t3;
        }
    }
