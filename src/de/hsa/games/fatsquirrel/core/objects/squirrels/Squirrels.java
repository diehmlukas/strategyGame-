package de.hsa.games.fatsquirrel.core.objects.squirrels;

import de.hsa.games.fatsquirrel.core.objects.Wall;
import de.hsa.games.fatsquirrel.core.objects.XY;
import de.hsa.games.fatsquirrel.core.objects.beasts.BadBeast;
import de.hsa.games.fatsquirrel.core.objects.beasts.GoodBeast;
import de.hsa.games.fatsquirrel.core.objects.entities.Entity;
import de.hsa.games.fatsquirrel.core.objects.entities.EntitySet;
import de.hsa.games.fatsquirrel.core.objects.plants.BadPlant;
import de.hsa.games.fatsquirrel.core.objects.plants.GoodPlant;

public abstract class Squirrels extends Entity {
    @Override
    public abstract void nextStep();

    public boolean checkTargetPosition(XY nextPosition, EntitySet entitySet) {
        for (int i = 0; i < entitySet.getEntities().length; i++) {
            Entity entity = entitySet.getEntities()[i];
            if (entity instanceof GoodPlant && entity.getXy().x == nextPosition.x
                    && entity.getXy().y == nextPosition.y)
            return true;
        }
        return false;
    }
}
