package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Stable> stables = new ArrayList<>();
    List<ChickenCoop> chickenCoops = new ArrayList<>();
    List<FarmHouse> house = new ArrayList<>();



//Set and Get number of Stables on Farm
    public void setStables(Stable stable){

        stables.add(stable);
    }

    public void setStables(List<Stable> stables){

        this.stables = stables;
    }


    public List<Stable> getStables(){

        return stables;
    }

    //Set and Get number Of ChickenCoops

    public void setChickenCoops(ChickenCoop chicken){

        chickenCoops.add(chicken);
    }


    public void setChickenCoop(List<ChickenCoop> chickenCoops){

        this.chickenCoops = chickenCoops;
    }


    public List<ChickenCoop> getChickenCoops(){

        return chickenCoops;
    }

    public void setHouse(List<FarmHouse> house1){

        this.house = house1;
    }

    public List<FarmHouse> getHouse() {

        return house;
    }
}
