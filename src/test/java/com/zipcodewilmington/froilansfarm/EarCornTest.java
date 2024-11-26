package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EarCornTest {

    @Test
    public void isInstanceOfEdible(){
        EarCorn earcorn = new EarCorn();
        assertTrue(earcorn instanceof Edible);
    }

}