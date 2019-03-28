package Objects.Squirrels;

import Objects.Entities.Entity;

public class MasterSquirrel extends Squirrels {
    private final int defEnergy;

    public MasterSquirrel() {
        this.defEnergy = 1000;
    }

    public boolean isMiniSquirrel(Entity entity) {
        if (entity instanceof MiniSquirrel && ((MiniSquirrel) entity).getParentID() == getID())
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "MasterSquirrel{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
