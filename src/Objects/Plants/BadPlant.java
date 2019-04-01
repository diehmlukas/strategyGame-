package Objects.Plants;

import Objects.Entities.Entity;

public class BadPlant extends Entity {
    private final int defEnergy;

    public BadPlant(int energy, int id, int x, int y) {
        this.defEnergy = -100;
        updateEnergy(energy);
        setId(id);
        getXy().setX(x);
        getXy().setY(y);
    }

    @Override
    public void nextStep() {}

    @Override
    public String toString() {
        return "BadPlant{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
