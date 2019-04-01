package Objects.Plants;

import Logic.XY;
import Objects.Entities.Entity;

public class GoodPlant extends Entity {
    private final int defEnergy;

    public GoodPlant() {
        this.defEnergy = 100;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public GoodPlant(int energy, XY xy) {
        this.defEnergy = 100;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    @Override
    public void nextStep() {}

    @Override
    public String toString() {
        return "GoodPlant{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
