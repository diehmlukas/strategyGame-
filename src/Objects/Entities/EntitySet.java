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

    public void addEntity(GoodBeast goodBeast) {
            int goodBeastsArrayCount = 0;
            try {
                while (goodBeasts[goodBeastsArrayCount] != null)
                    goodBeastsArrayCount++;
                goodBeasts[goodBeastsArrayCount] = goodBeast;
            }
            catch (ArrayIndexOutOfBoundsException a){
                System.out.println("Too many good beats! Your new beast has been ignored.");
            }
    }

    public void addEntity(BadPlant badPlant) {
        int badPlantArrayCount = 0;
        try {
            while (badPlant[badPlantArrayCount] != null)
                badPlantArrayCount++;
            badPlant[badPlantArrayCount] = badPlant;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many bad plant! Your new beast has been ignored.");
        }
    }

    public void addEntity(GoodPlant goodPlant) {
        int goodPlantArrayCount = 0;
        try {
            while (goodPlant[goodPlantArrayCount] != null)
                goodPlantArrayCount++;
            goodPlant[goodPlantArrayCount] = goodPlant;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many good Plant! Your new beast has been ignored.");
        }
    }

    public void addEntity(MasterSquirrel masterSquirrel) {
        int masterSquirrelArrayCount = 0;
        try {
            while (masterSquirrel[masterSquirrelArrayCount] != null)
                masterSquirrelArrayCount++;
            masterSquirrel[masterSquirrelArrayCount] = masterSquirrel;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many master Squirrel! Your new beast has been ignored.");
        }
    }

    public void addEntity(MiniSquirrel miniSquirrel) {
        int miniSquirrelArrayCount = 0;
        try {
            while (miniSquirrel[miniSquirrelArrayCount] != null)
                miniSquirrelArrayCount++;
            miniSquirrel[miniSquirrelArrayCount] = miniSquirrel;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many mini Squirrel! Your new beast has been ignored.");
        }
    }

    public void addEntity(Wall wall) {
        int wallArrayCount = 0;
        try {
            while (wall[wallArrayCount] != null)
                wallArrayCount++;
            wall[wallArrayCount] = wall;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many wall! Your new beast has been ignored.");
        }
    }

    public void deleteEntity(BadBeast badBeast) {
        int badBeastsArrayCount = 0;
        while (badBeasts[badBeastsArrayCount] != badBeast)
            badBeastsArrayCount++;
        badBeasts[badBeastsArrayCount] = null;
    }

    public void deleteEntity(GoodBeast goodBeast) {
        int goodBeastArrayCount = 0;
        while (goodBeast[goodBeastArrayCount] != goodBeast)
            goodBeastArrayCount++;
        goodBeast[goodBeastArrayCount] = null;
    }

    public void deleteEntity(BadPlant badPlant) {
        int badPlantArrayCount = 0;
        while (badPlant[badPlantArrayCount] != badPlant)
            badPlantArrayCount++;
        badPlant[badPlantArrayCount] = null;
    }

    public void deleteEntity(GoodPlant goodPlant) {
        int goodPlantArrayCount = 0;
        while (goodPlant[goodPlantArrayCount] != goodPlant)
            goodPlantArrayCount++;
        goodPlant[goodPlantArrayCount] = null;
    }

    public void deleteEntity(MasterSquirrel masterSquirrel) {
        int masterSquirrelArrayCount = 0;
        while (masterSquirrel[masterSquirrelArrayCount] != masterSquirrel)
            masterSquirrelArrayCount++;
        badBeasts[masterSquirrelArrayCount] = null;
    }

    public void deleteEntity(MiniSquirrel miniSquirrel) {
        int miniSquirrelArrayCount = 0;
        while (miniSquirrel[miniSquirrelArrayCount] != miniSquirrel)
            miniSquirrelArrayCount++;
        miniSquirrel[miniSquirrelArrayCount] = null;
    }

    public void deleteEntity(Wall wall) {
        int wallArrayCount = 0;
        while (wall[wallArrayCount] != wall)
            wallArrayCount++;
        wall[wallArrayCount] = null;
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
