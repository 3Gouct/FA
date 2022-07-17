package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService ();
        int amount = 900;
        int expected = 100;
        int result = service.remain (amount);
        System.out.println (result);

        assertEquals (result, expected);
    }
}