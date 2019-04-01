package Objects.Plants;

import Logic.XY;
import Objects.Entities.Entity;

public class BadPlant extends Entity {
    private final int defEnergy;

    public BadPlant() {
        this.defEnergy = -100;
        updateEnergy(defEnergy);
        setId(getIDcount());
        setXy(XY.generateStartPosition());
    }

    public BadPlant(int energy, XY xy) {
        this.defEnergy = -100;
        updateEnergy(energy);
        setId(getIDcount());
        setXy(xy);
    }

    @Override
    public void nextStep() {}

    @Override
    public String toString() {
        return "BadPlant{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
