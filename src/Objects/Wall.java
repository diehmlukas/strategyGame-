package Objects;

import Logic.XY;
import Objects.Entities.Entity;

public class Wall extends Entity {
    private final int defEnergy;

    public Wall() {
        this.defEnergy = -10;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public Wall(int energy, XY xy) {
        this.defEnergy = -10;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    @Override
    public String toString() {
        return "Wall{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
