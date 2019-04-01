package Logic;

import Objects.Beasts.BadBeast;
import Objects.Beasts.GoodBeast;
import Objects.Entities.EntitySet;
import Objects.Plants.BadPlant;
import Objects.Plants.GoodPlant;
import Objects.Squirrels.MasterSquirrel;
import Objects.Wall;

public class Main {
    public static void main(String[] args) throws Exception {
        EntitySet entitySet = new EntitySet();
        MasterSquirrel masterSquirrel1 = new MasterSquirrel();
        BadPlant badPlant = new BadPlant();
        GoodPlant goodPlant = new GoodPlant();
        BadBeast badBeast = new BadBeast();
        GoodBeast goodBeast = new GoodBeast();
        Wall wall = new Wall();

        entitySet.addEntity(masterSquirrel1);
        entitySet.addEntity(badPlant);
        entitySet.addEntity(goodPlant);
        entitySet.addEntity(badBeast);
        entitySet.addEntity(goodBeast);
        entitySet.addEntity(wall);

        while (true) {
            for (int i = 0; i < entitySet.getEntities().length; i++) {
                if (entitySet.getEntities()[i] != null)
                    entitySet.getEntities()[i].toString();
            }

            entitySet.callNextStep();
        }

    }
}
