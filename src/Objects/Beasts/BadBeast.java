package Objects.Beasts;

import Logic.XY;
import Objects.Entities.Entity;

public class BadBeast extends Entity {
    private final int defEnergy;

    public BadBeast(int energy, int id, int x, int y) {
        this.defEnergy = -150;
        updateEnergy(energy);
        setId(id);
        XY xy = new XY(x, y);
        setXy(xy);
    }

    @Override
    public void nextStep() {
        getXy().generateNewPosition();
    }

    @Override
    public String toString() {
        return "BadBeast{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
