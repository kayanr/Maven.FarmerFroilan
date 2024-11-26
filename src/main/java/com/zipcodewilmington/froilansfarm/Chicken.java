package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Egg> {
private int chickenId;
private boolean hasBeenFertilized;

    public Chicken(int chickenId) {
        this.chickenId = chickenId;
    }

    public Chicken() {
    }

    @Override
    public boolean eat(Edible edible) {
        return false;
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }

    public int getChickenId() {
        return chickenId;
    }

    @Override
    public Egg yield() {
       return null;
    }

    @Override
    public boolean hasBeenFertilized() {
        return false;
    }

    @Override
    public void fertilize() {

    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
