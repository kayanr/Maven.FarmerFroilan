package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TomatoPlantTest {

    @Test
    public void isCrop(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        Crop<?> crop = new Crop<>();
        assertTrue(tomatoPlant instanceof Crop<?>);
    }
    @Test
    public void checkInitialState(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        assertFalse(tomatoPlant.hasBeenFertilized(), "Hasn't been fertilized yet.");

        assertFalse(tomatoPlant.hasBeenHarvested(), "Hasn't been harvested yet.");
    }

    @Test
    public void checkFertilized(){
        TomatoPlant tomatoPlant = new TomatoPlant();

        tomatoPlant.fertilize();
        assertTrue(tomatoPlant.hasBeenFertilized(), "The tomato plant has been fertilized.");
    }

    @Test
    public void checkHarvest(){
        TomatoPlant tomatoPlant = new TomatoPlant();
        tomatoPlant.fertilize();
        tomatoPlant.harvest();
        assertTrue(tomatoPlant.hasBeenFertilized(), "The cornstalk has been harvested.");
    }
}
