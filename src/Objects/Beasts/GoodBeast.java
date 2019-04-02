package Objects.Beasts;

import Logic.XY;
import Objects.Entities.Entity;

public class GoodBeast extends Entity {
    private final int defEnergy;

    public GoodBeast(int energy, int id, int x, int y) {
        this.defEnergy = 200;
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
        return "GoodBeast{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
