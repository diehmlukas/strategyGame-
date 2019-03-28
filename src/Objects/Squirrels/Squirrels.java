package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.*;
import Objects.Plants.GoodPlant;

public abstract class Squirrels extends Entity {

    public boolean checkTargetPosition(XY nextPosition, EntitySet entitySet) {
        Entity[] entities = entitySet.getEntities();
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] instanceof GoodPlant && entities[i].getXy().getX() == nextPosition.getX() && entities[i].getXy().getY() == nextPosition.getY())
                return true;
        }
        return false;
    }
}
