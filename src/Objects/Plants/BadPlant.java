package Objects.Plants;

import Logic.XY;
import Objects.Entities.Entity;

public class BadPlant extends Entity {
    private final int defEnergy;

    public BadPlant(int energy, int id, int x, int y) {
        this.defEnergy = -100;
        updateEnergy(energy);
        setId(id);
        XY xy = new XY(x, y);
        setXy(xy);
    }

    @Override
    public void nextStep(){}

    @Override
    public String toString() {
        return "BadPlant{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
