package Objects.Plants;

import Logic.XY;
import Objects.Entities.Entity;

public class GoodPlant extends Entity {
    private final int defEnergy;

    public GoodPlant() {
        this.defEnergy = 100;
    }

    @Override
    public String toString() {
        return "GoodPlant{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
