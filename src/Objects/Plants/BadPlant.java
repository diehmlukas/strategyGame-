package Objects.Plants;

import Objects.Entities.Entity;

public class BadPlant extends Entity {
    private final int defEnergy;

    public BadPlant() {
        this.defEnergy = -100;
    }

    @Override
    public String toString() {
        return "BadPlant{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
