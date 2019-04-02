package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.Entity;

public class MasterSquirrel extends Squirrels {
    private final int defEnergy;

    public MasterSquirrel(int energy, int id, int x, int y) {
        this.defEnergy = 1000;
        updateEnergy(energy);
        setId(id);
        XY xy = new XY(x, y);
        setXy(xy);
    }

    MasterSquirrel() {
        defEnergy = 1000;
    }

    public boolean isMiniSquirrel(Entity entity) {
        return  (entity instanceof MiniSquirrel && ((MiniSquirrel) entity).getParentID() == getID());
    }

    @Override
    public void nextStep() {
        setXy(HandOperatedMasterSquirrel.nextPosition(getXy()));
    }

    @Override
    public String toString() {
        return "MasterSquirrel{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
