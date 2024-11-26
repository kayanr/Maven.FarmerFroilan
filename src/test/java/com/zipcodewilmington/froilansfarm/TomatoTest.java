package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TomatoTest {
    @Test
    public void isInstanceOfEdible(){
        Tomato tomato = new Tomato();
        assertTrue(tomato instanceof Edible);
    }

}