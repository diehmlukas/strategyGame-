package Objects.Plants;

import Logic.XY;
import Objects.Entities.Entity;

public class GoodPlant extends Entity {
    private final int defEnergy;

    public GoodPlant(int energy, int id, int x, int y) {
        this.defEnergy = 100;
        updateEnergy(energy);
        setId(id);
        XY xy = new XY(x, y);
        setXy(xy);
    }

    @Override
    public void nextStep() {}

    @Override
    public String toString() {
        return "GoodPlant{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
