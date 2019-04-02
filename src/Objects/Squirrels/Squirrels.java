package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.*;
import Objects.Plants.GoodPlant;

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
