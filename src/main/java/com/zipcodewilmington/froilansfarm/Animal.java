package com.zipcodewilmington.froilansfarm;

public abstract class Animal<T extends Edible> implements NoiseMaker, Eater<T> {

    private T edible;

    @Override
    public abstract boolean eat(T edible);


    @Override
    public abstract String makeNoise();
}
