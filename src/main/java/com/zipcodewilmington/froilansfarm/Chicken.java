package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal<EarCorn> implements Produce<Egg> {
private int chickenId;
private boolean hasBeenFertilized;
    private Egg edible;

    public Chicken(int chickenId) {
        this.chickenId = chickenId;
    }

    public Chicken() {
          this.hasBeenFertilized = false;
    }

    /*@Override
    public boolean eat(Edible edible) {
        return false;
    }*/

    @Override
    public boolean eat(EarCorn edible) {
        if (edible == null) {
            throw new IllegalArgumentException("There is no edible ear corn.");
        }
        return true;
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
        if (hasBeenFertilized) {
            return null;
        } return edible;
    }

    @Override
    public boolean hasBeenFertilized() {
        if(hasBeenFertilized){
            return true;
        }
        return false;
    }

    @Override
    public void fertilize() {
       this.hasBeenFertilized = true;
    }

    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }
}
