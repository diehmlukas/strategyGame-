package Logic;

import Objects.Beasts.BadBeast;
import Objects.Beasts.GoodBeast;
import Objects.Entities.EntitySet;
import Objects.Plants.BadPlant;
import Objects.Plants.GoodPlant;
import Objects.Squirrels.MasterSquirrel;
import Objects.Wall;

public class Main {
    public static void main(String[] args) {
        EntitySet entitySet = new EntitySet();
        MasterSquirrel masterSquirrel1 = new MasterSquirrel(1000, 0, 9, 9);
        BadPlant badPlant = new BadPlant(-40, 1, 89, 0);
        GoodPlant goodPlant = new GoodPlant(40, 2, 45, 34);
        BadBeast badBeast = new BadBeast(-100, 3, 56, 78);
        GoodBeast goodBeast = new GoodBeast(100, 4, 32, 78);
        Wall wall = new Wall(-10, 5, 0, 0);

        entitySet.addEntity(masterSquirrel1);
        entitySet.addEntity(badPlant);
        entitySet.addEntity(goodPlant);
        entitySet.addEntity(badBeast);
        entitySet.addEntity(goodBeast);
        entitySet.addEntity(wall);

        while (true) {
            for (int i = 0; i < entitySet.getEntities().length; i++) {
                if (entitySet.getEntities()[i] != null) {
                    System.out.println(entitySet.getEntities()[i].toString());
                }
            }

            entitySet.callNextStep();
        }

    }
}
