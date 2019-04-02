package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.*;
import Objects.Plants.GoodPlant;

public abstract class Squirrels extends Entity {

    public boolean checkTargetPosition(XY nextPosition, EntitySet entitySet) {
        Entity entity = entitySet.onPosition(nextPosition);
        if (entity instanceof GoodPlant && entity.getXy().getX() == nextPosition.getX()
                && entity.getXy().getY() == nextPosition.getY())
            return true;
        else
            return false;
    }
}
