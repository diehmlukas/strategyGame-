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
        int badPlantsArrayCount = 0;
        try {
            while (badPlants[badPlantsArrayCount] != null)
                badPlantsArrayCount++;
            badPlants[badPlantsArrayCount] = badPlant;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many bad plants! Your new plant has been ignored.");
        }
    }

    public void addEntity(GoodPlant goodPlant) {
        int goodPlantsArrayCount = 0;
        try {
            while (goodPlants[goodPlantsArrayCount] != null)
                goodPlantsArrayCount++;
            goodPlants[goodPlantsArrayCount] = goodPlant;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many good plants! Your new plant has been ignored.");
        }
    }

    public void addEntity(MasterSquirrel masterSquirrel) {
        int masterSquirrelsArrayCount = 0;
        try {
            while (masterSquirrels[masterSquirrelsArrayCount] != null)
                masterSquirrelsArrayCount++;
            masterSquirrels[masterSquirrelsArrayCount] = masterSquirrel;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many master squirrels! Your new master squirrel has been ignored.");
        }
    }

    public void addEntity(MiniSquirrel miniSquirrel) {
        int miniSquirrelsArrayCount = 0;
        try {
            while (miniSquirrels[miniSquirrelsArrayCount] != null)
                miniSquirrelsArrayCount++;
            miniSquirrels[miniSquirrelsArrayCount] = miniSquirrel;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many mini squirrels! Your new mini squirrel has been ignored.");
        }
    }

    public void addEntity(Wall wall) {
        int wallsArrayCount = 0;
        try {
            while (walls[wallsArrayCount] != null)
                wallsArrayCount++;
            walls[wallsArrayCount] = wall;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many walls! Your new wall has been ignored.");
        }
    }

    public void deleteEntity(BadBeast badBeast) {
        int badBeastsArrayCount = 0;
            while (badBeasts[badBeastsArrayCount] != badBeast && badBeastsArrayCount < badBeasts.length)
                badBeastsArrayCount++;
            badBeasts[badBeastsArrayCount] = null;
    }

    public void deleteEntity(GoodBeast goodBeast) {
        int goodBeastsArrayCount = 0;
            while (goodBeasts[goodBeastsArrayCount] != goodBeast && goodBeastsArrayCount < goodBeasts.length)
                goodBeastsArrayCount++;
            goodBeasts[goodBeastsArrayCount] = null;
    }

    public void deleteEntity(BadPlant badPlant) {
        int badPlantsArrayCount = 0;
            while (badPlants[badPlantsArrayCount] != badPlant && badPlantsArrayCount < badPlants.length)
                badPlantsArrayCount++;
            badPlants[badPlantsArrayCount] = null;
    }

    public void deleteEntity(GoodPlant goodPlant) {
        int goodPlantsArrayCount = 0;
            while (goodPlants[goodPlantsArrayCount] != goodPlant && goodPlantsArrayCount < goodPlants.length)
                goodPlantsArrayCount++;
            goodPlants[goodPlantsArrayCount] = null;
    }

    public void deleteEntity(MasterSquirrel masterSquirrel) {
        int masterSquirrelsArrayCount = 0;
            while (masterSquirrels[masterSquirrelsArrayCount] != masterSquirrel && masterSquirrelsArrayCount < masterSquirrels.length)
                masterSquirrelsArrayCount++;
            masterSquirrels[masterSquirrelsArrayCount] = null;
    }

    public void deleteEntity(MiniSquirrel miniSquirrel) {
        int miniSquirrelsArrayCount = 0;
            while (miniSquirrels[miniSquirrelsArrayCount] != miniSquirrel && miniSquirrelsArrayCount < miniSquirrels.length)
                miniSquirrelsArrayCount++;
            miniSquirrels[miniSquirrelsArrayCount] = null;
    }

    public void deleteEntity(Wall wall) {
        int wallsArrayCount = 0;
            while (walls[wallsArrayCount] != wall && wallsArrayCount < walls.length)
                wallsArrayCount++;
            walls[wallsArrayCount] = null;
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

    public MiniSquirrel[] getMiniSquirrels() {
        return miniSquirrels;
    }

    public GoodPlant[] getGoodPlants() {
        return goodPlants;
    }

    public BadBeast[] getBadBeasts() {
        return badBeasts;
    }

    public BadPlant[] getBadPlants() {
        return badPlants;
    }

    public GoodBeast[] getGoodBeasts() {
        return goodBeasts;
    }

    public MasterSquirrel[] getMasterSquirrels() {
        return masterSquirrels;
    }

    public Wall[] getWalls() {
        return walls;
    }
}
