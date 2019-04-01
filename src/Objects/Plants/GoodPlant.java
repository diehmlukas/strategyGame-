package Objects.Plants;

import Objects.Entities.Entity;

public class GoodPlant extends Entity {
    private final int defEnergy;

    public GoodPlant(int energy, int id, int x, int y) {
        this.defEnergy = 100;
        updateEnergy(energy);
        setId(id);
        getXy().setX(x);
        getXy().setY(y);
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
