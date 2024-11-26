package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoiseMakerTest {

    @Test
    void makeNoise() {
    }
//
//    @Test
//    void  tractorMakesNoise(){
//        NoiseMaker tractor = new Tractor();
//
//        String noise = tractor.makeNoise();
//
//        assertEquals("Vroom", noise);
//    }

    @Test
    void chickenMakesNoise() {
        NoiseMaker chicken = new Chicken();

        String noise = chicken.makeNoise();

        assertEquals("Cluck!", noise);
    }
}