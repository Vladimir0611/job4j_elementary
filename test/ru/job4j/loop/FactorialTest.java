package ru.job4j;

import org.junit.Test;
import ru.job4j.Counter;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
            int rsl = ru.job4j.Factorial.calc(5);
            int expected = 120;
            assertThat(rsl, is(expected));
    }
        @Test
        public void whenCalculateFactorialForZeroThenOne() {
        int rsl = ru.job4j.Factorial.calc(0);
        int expected = 1;
        assertThat(rsl, is(expected));
    }
}