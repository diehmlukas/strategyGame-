package de.hsa.games.fatsquirrel.core.objects.plants;

import de.hsa.games.fatsquirrel.core.objects.XY;
import de.hsa.games.fatsquirrel.core.objects.entities.Entity;

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
