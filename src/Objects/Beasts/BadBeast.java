package Objects.Beasts;

import Logic.XY;
import Objects.Entities.Entity;

public class BadBeast extends Entity {
    private final int defEnergy;

    public BadBeast() {
        this.defEnergy = -150;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public BadBeast(int energy, XY xy) {
        this.defEnergy = -150;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    @Override
    public String toString() {
        return "BadBeast{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
