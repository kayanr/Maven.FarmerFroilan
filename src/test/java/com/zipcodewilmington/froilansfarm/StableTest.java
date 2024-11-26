package com.zipcodewilmington.froilansfarm;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class StableTest {

    @Test
    public void horseListTest1(){
        Store<Horse> horseStore = new Store<>();
        Stable stable = new Stable();
       // List<Horse> horses = new ArrayList<>();
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());

        stable.setHorse(horseStore);

        Assertions.assertFalse(stable.store.horse.isEmpty());
        Assertions.assertEquals(4,stable.store.horse.size());
      //  horses.clear();

    }

    @Test
    public void horseListTest2(){
        Store<Horse> horseStore = new Store<>();
        Stable stable = new Stable();
       // List<Horse> horses = new ArrayList<>();
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());
        horseStore.add(new Horse());

        stable.setHorse(horseStore);

        Assertions.assertFalse(stable.getHorse().isEmpty());
        Assertions.assertEquals(8,stable.getHorse().size());
       // horses.clear();
    }


    @Test
    public void horseListTest3(){
        Stable stable = new Stable();
        List<Horse> horses = new ArrayList<>();

        stable.setHorse(horses);

        Assertions.assertTrue(stable.getHorse().isEmpty());
        Assertions.assertEquals(0,stable.getHorse().size());
        horses.clear();
    }


    //Test to add Horses across 4 Stables
    @Test
    public void addHorseToStableTest(){
        Stable stable = new Stable();
        Store<Horse> horseList = new Store<>();


        for (int i = 1; i <= 10; i++) {
            Horse horse = new Horse(i);
            horseList.add(horse);

        }

        stable.setHorse(horseList);

        Assertions.assertEquals(10,stable.getHorse().size());

    }

    public static class FarmVehicleTest {

        @Test

        public void VehicleMakesNoiseTest (){


            Assertions.assertTrue(Tractor.vehcileMakesNoise);
        }


        @Test

        public void VehicleIsRidableTest(){

        }

        @Test

        public void CanOperateTest(){

        }

        @Test

        public void isVehicleTest(){

        }

        @Test

        public void CanFly(){

        }

        @Test

        public void isAircraftTest(){

        }

        @Test

        public void FertilizeTest(){

        }

        @Test

        public void HarvestTest(){

        }

        @Test

        public void CanOperate(){

        }

    }
}
