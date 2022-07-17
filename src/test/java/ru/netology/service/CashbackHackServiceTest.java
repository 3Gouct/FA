package ru.netology.service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService ();
        int expected = 100;
        int result = service.remain (900);
        System.out.println (result);

        assertEquals (result, expected);
    }

    @org.testng.annotations.Test
    public void secondTestRemain() {
        CashbackHackService service = new CashbackHackService ();
        int expected = 900;
        int result = service.remain (1100);
        System.out.println (result);

        assertEquals (result, expected);
    }
}