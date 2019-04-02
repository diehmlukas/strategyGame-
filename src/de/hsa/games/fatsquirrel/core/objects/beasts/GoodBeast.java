package de.hsa.games.fatsquirrel.core.objects.beasts;

import de.hsa.games.fatsquirrel.core.objects.XY;
import de.hsa.games.fatsquirrel.core.objects.entities.Entity;

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
