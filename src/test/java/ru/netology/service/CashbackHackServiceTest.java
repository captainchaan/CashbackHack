package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    void needToBuy(){
        CashbackHackService service = new CashbackHackService();
        int amount = 500;

        int actual = service.remain(amount);
        int expected = 500;


        assertEquals(actual, expected);
    }
}
