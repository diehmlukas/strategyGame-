package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.Entity;

public class MasterSquirrel extends Squirrels {
    private final int defEnergy;

    public MasterSquirrel() {
        this.defEnergy = 1000;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public MasterSquirrel(int energy, XY xy) {
        this.defEnergy = 1000;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    public boolean isMiniSquirrel(Entity entity) {
        if (entity instanceof MiniSquirrel && ((MiniSquirrel) entity).getParentID() == getID())
            return true;
        else
            return false;
    }

    @Override
    public void nextStep() {
        setXy(HandOperatedMasterSquirrel.nextPosition(getXy()));
    }

    @Override
    public String toString() {
        return "MasterSquirrel{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
