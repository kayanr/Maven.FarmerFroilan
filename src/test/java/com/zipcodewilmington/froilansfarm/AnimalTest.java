package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {
    //Eater can eat an Edible object.
    @Test
    public void EaterCanEatEdibleTest() {
        String name = "Froilan";
        Eater eater = new Person(name);
        Edible edible = new Egg();
        assertTrue(eater.eat(edible));
    }

    //NoiseMaker can makeNoise
    @Test
    public void NoiseMakerCanMakeNoiseTest() {
        String name = "Froilan";
        String noise = "Hello!";
        //To be continued...
        NoiseMaker noiseMaker = new Person(name);
        assertEquals(noise, noiseMaker.makeNoise());

    }

    //Animal is a NoiseMaker and Eater
    @Test
    public void AnimalIsNoiseMakerAndEaterTest() {
        String noise = "Neigh!";
        Animal animal = new Horse();
        NoiseMaker noiseMaker = new Horse();
        Eater eater = new Horse();

        assertEquals(noise, noiseMaker.makeNoise());
        //Make test to test that Animal is an Eater use the concrete Horse class
        // assertTrue(eater.eat())

    }


    //Horse is an Animal and Rideable
    @Test
    public void HorseIsAnimalAndRideableTest() {

        Animal animal = new Horse();
        Rideable rideable = new Horse();

        assertTrue(rideable.ride());

    }

    //Chicken is an Animal and a Produce
    @Test
    public void ChickenIsAnimalProduceTest() {

    //Animal<EarCorn> animal = new Chicken<EarCorn>();

    //Edible edible = new EarCorn();
    //Produce<Egg> produce = new Chicken<Egg>();

    // which yield an EdibleEgg if hasBeenFertilized flag is false.
}

    @Test
    public void ChickenIsAnAnimalTest(){
        Chicken chicken = new Chicken();
        assertTrue(chicken instanceof Animal);
    }

    @Test
    public void ChickenIsAProduceTest(){

        Chicken chicken = new Chicken();
        assertTrue(chicken instanceof Produce);
    }
    @Test
    public void ChickenMakesNoiseTest(){

        String noise = "Cluck!";
        Chicken chicken = new Chicken();
        assertEquals(noise, chicken.makeNoise());
    }

   @Test
   public void ChickenEatsTest(){
        Chicken chicken = new Chicken();
        EarCorn edibleFood = new EarCorn();
        assertTrue(chicken.eat((EarCorn) edibleFood));
   }

   @Test
    public void ChickenYieldsEdibleEggWhenNotFertilized(){
        Chicken chicken = new Chicken();
        chicken.setHasBeenFertilized(false);
        Egg egg = chicken.yield();
        assertNotNull(egg);

   }


}
