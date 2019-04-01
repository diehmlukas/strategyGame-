package Objects;

import Objects.Entities.Entity;

public class Wall extends Entity {
    private final int defEnergy;

    public Wall(int energy, int id, int x, int y) {
        this.defEnergy = -10;
        updateEnergy(energy);
        setId(id);
        getXy().setX(x);
        getXy().setY(y);
    }

    @Override
    public void nextStep() {}

    @Override
    public String toString() {
        return "Wall{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
