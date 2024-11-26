package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FarmTest {


//    , many ChickenCoop, and a single FarmHouse
//Stable stores many Horse.
//
//    FarmHouse stores many Person
//

    @Test
    public void  stableCountTest1(){
        //Farm stores many Stable

        ArrayList<Stable> stableList = new ArrayList<>();

        Farm farms = new Farm();
        stableList.add(new Stable());
        farms.setStables(stableList);

        Assertions.assertFalse(farms.getStables().isEmpty());
        assertEquals(1,farms.stables.size());

    }

    @Test
    public void  stableCountTest2(){
    Farm farm = new Farm();
    Stable stable = new Stable();
    farm.setStables(stable);

    }

    //    ChickenCoop stores many Chicken
    @Test
    public void chickenCoopCountTest(){
        List<ChickenCoop> chickenCoopList = new ArrayList<>();
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());
        chickenCoopList.add(new ChickenCoop());

        Farm farm = new Farm();
        farm.setChickenCoop(chickenCoopList);

        assertEquals(4,farm.getChickenCoops().size());
        Assertions.assertFalse(farm.getChickenCoops().isEmpty());

    }

    @Test
    public void  chickenCoopCountTest2(){
        Farm farm = new Farm();
        ChickenCoop coop = new ChickenCoop();
        farm.setChickenCoops(coop);

    }

    @Test
    public void farmHouseCountTest(){
        List<FarmHouse> farm1 = new ArrayList<>();
        Farm farm = new Farm();
        //FarmHouse farm1 = new FarmHouse();
        farm1.add(new FarmHouse());
        farm.setHouse(farm1);

        assertEquals(1,farm.getHouse().size());
        Assertions.assertFalse(farm.getHouse().isEmpty());

    }


}
