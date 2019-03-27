package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.Entity;
import Objects.Entities.EntitySet;

public class MasterSquirrel extends Squirrels {
    private final int defEnergy;
    private int energy;
    private final int id;
    private XY xy;

    public MasterSquirrel(int id, XY xy) {
        this.defEnergy = 1000;
        this.energy = defEnergy;
        this.id = id;
        this.xy = xy;
    }

    public boolean isMiniSquirrel(Entity entity, EntitySet entitySet) {
        for (int i = 0; i < entitySet.getMiniSquirrels().length; i++) {
            if (entity.equals(entitySet.getMiniSquirrels()[i]))
                return true;
        }
        return false;
    }

    @Override
    public void nextStep() {
        //functionality implemented in HandOperatedMasterSquirrel
    }

    @Override
    public String toString() {
        return "MasterSquirrel{" +
                "defEnergy=" + defEnergy +
                ", energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                "} " + super.toString();
    }
}
