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
        try {
            while (badBeasts[badBeastsArrayCount] != badBeast)
                badBeastsArrayCount++;
            badBeasts[badBeastsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your beast hasn't been found!");
        }
    }

    public void deleteEntity(GoodBeast goodBeast) {
        int goodBeastsArrayCount = 0;
        try {
            while (goodBeasts[goodBeastsArrayCount] != goodBeast)
                goodBeastsArrayCount++;
            goodBeasts[goodBeastsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your beast hasn't been found!");
        }
    }

    public void deleteEntity(BadPlant badPlant) {
        int badPlantsArrayCount = 0;
        try {
            while (badPlants[badPlantsArrayCount] != badPlant)
                badPlantsArrayCount++;
            badPlants[badPlantsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your plant hasn't been found!");
        }
    }

    public void deleteEntity(GoodPlant goodPlant) {
        int goodPlantsArrayCount = 0;
        try {
            while (goodPlants[goodPlantsArrayCount] != goodPlant)
                goodPlantsArrayCount++;
            goodPlants[goodPlantsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your plant hasn't been found!");
        }
    }

    public void deleteEntity(MasterSquirrel masterSquirrel) {
        int masterSquirrelsArrayCount = 0;
        try {
            while (masterSquirrels[masterSquirrelsArrayCount] != masterSquirrel)
                masterSquirrelsArrayCount++;
            masterSquirrels[masterSquirrelsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your master squirrel hasn't been found!");
        }
    }

    public void deleteEntity(MiniSquirrel miniSquirrel) {
        int miniSquirrelsArrayCount = 0;
        try {
            while (miniSquirrels[miniSquirrelsArrayCount] != miniSquirrel)
                miniSquirrelsArrayCount++;
            miniSquirrels[miniSquirrelsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your mini squirrel hasn't been found!");
        }
    }

    public void deleteEntity(Wall wall) {
        int wallsArrayCount = 0;
        try {
            while (walls[wallsArrayCount] != wall)
                wallsArrayCount++;
            walls[wallsArrayCount] = null;
        }
        catch(NullPointerException n) {
            System.out.println("Your wall hasn't been found!");
        }
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
