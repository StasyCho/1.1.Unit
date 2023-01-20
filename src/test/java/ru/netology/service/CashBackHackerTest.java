package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashBackHackerTest {

    @Test
    public void testRemain100() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 900;
        int actual = cashBackHacker.remain(amount);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain1() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 999;
        int actual = cashBackHacker.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain999() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1001;
        int actual = cashBackHacker.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemain1000() {
        CashBackHacker cashBackHacker = new CashBackHacker();
        int amount = 1000;
        int actual = cashBackHacker.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}