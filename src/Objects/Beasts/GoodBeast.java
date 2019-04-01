package Objects.Beasts;

import Logic.XY;
import Objects.Entities.Entity;

public class GoodBeast extends Entity {
    private final int defEnergy;

    public GoodBeast() {
        this.defEnergy = 200;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public GoodBeast(int energy, XY xy) {
        this.defEnergy = 200;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    @Override
    public String toString() {
        return "GoodBeast{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
