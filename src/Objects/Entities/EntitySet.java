package Objects.Entities;

import Objects.Beasts.BadBeast;
import Objects.Beasts.GoodBeast;
import Objects.Plants.BadPlant;
import Objects.Plants.GoodPlant;
import Objects.Squirrels.MasterSquirrel;
import Objects.Squirrels.MiniSquirrel;
import Objects.Wall;

import java.util.Arrays;

public class EntitySet {
    private int arraySize;
    private BadBeast[] badBeasts;
    private GoodBeast[] goodBeasts;
    private BadPlant[] badPlants;
    private GoodPlant[] goodPlants;
    private MasterSquirrel[] masterSquirrels;
    private MiniSquirrel[] miniSquirrels;
    private Wall[] walls;

    public EntitySet() {
        this.arraySize = 100;
        this.badBeasts = new BadBeast[arraySize];
        this.goodBeasts = new GoodBeast[arraySize];
        this.badPlants = new BadPlant[arraySize];
        this.goodPlants = new GoodPlant[arraySize];
        this.masterSquirrels = new MasterSquirrel[arraySize];
        this.miniSquirrels = new MiniSquirrel[arraySize];
        this.walls = new Wall[arraySize];
    }

    public void addEntity(BadBeast badBeast) {
        int badBeastsArrayCount = 0;
        try {
            while (badBeasts[badBeastsArrayCount] != null)
                badBeastsArrayCount++;
            badBeasts[badBeastsArrayCount] = badBeast;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many bad beats! Your new beast has been ignored.");
        }
    }

    //TODO: complete remaining classes
    public void addEntity(GoodBeast goodBeast) {
        entities.add(goodBeast);
    }

    public void addEntity(BadPlant badPlant) {
        entities.add(badPlant);
    }

    public void addEntity(GoodPlant goodPlant) {
        entities.add(goodPlant);
    }

    public void addEntity(MasterSquirrel masterSquirrel) {
        entities.add(masterSquirrel);
    }

    public void addEntity(MiniSquirrel miniSquirrel) {
        entities.add(miniSquirrel);
    }

    public void addEntity(Wall wall) {
        entities.add(wall);
    }

    public void deleteEntity(BadBeast badBeast) {
        entities.remove(badBeast);
    }

    public void deleteEntity(GoodBeast goodBeast) {
        entities.remove(goodBeast);
    }

    public void deleteEntity(BadPlant badPlant) {
        entities.remove(badPlant);
    }

    public void deleteEntity(GoodPlant goodPlant) {
        entities.remove(goodPlant);
    }

    public void deleteEntity(MasterSquirrel masterSquirrel) {
        entities.remove(masterSquirrel);
    }

    public void deleteEntity(MiniSquirrel miniSquirrel) {
        entities.remove(miniSquirrel);
    }

    public void deleteEntity(Wall wall) {
        entities.remove(wall);
    }

    public void callNextStep() {
        for (int i = 0; i < arraySize; i++) {
            badBeasts[i].nextStep();
            goodBeasts[i].nextStep();
            badPlants[i].nextStep();
            goodPlants[i].nextStep();
            miniSquirrels[i].nextStep();
            masterSquirrels[i].nextStep();
        }
    }

    @Override
    public String toString() {
        return "EntitySet{" +
                "arraySize=" + arraySize +
                ", badBeasts=" + Arrays.toString(badBeasts) +
                ", goodBeasts=" + Arrays.toString(goodBeasts) +
                ", badPlants=" + Arrays.toString(badPlants) +
                ", goodPlants=" + Arrays.toString(goodPlants) +
                ", masterSquirrels=" + Arrays.toString(masterSquirrels) +
                ", miniSquirrels=" + Arrays.toString(miniSquirrels) +
                ", walls=" + Arrays.toString(walls) +
                '}';
    }
}
