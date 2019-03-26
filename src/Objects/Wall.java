package Objects;

import Logic.XY;
import Objects.Entities.*;

public class Wall implements Entity {
    private int energy;
    private final int defEnergy;
    private final int id;
    private XY xy;

    public Wall(int id, XY xy) {
        this.defEnergy = -10;
        this.energy = defEnergy;
        this.id = id;
        this.xy = xy;
    }

    @Override
    public void updateEnergy(int delta) {
        energy += delta;
    }

    @Override
    public int getEnergy() {
        return energy;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public int getX() {
        return xy.getX();
    }

    @Override
    public int getY() {
        return xy.getY();
    }

    @Override
    public String toString() {
        return "Wall{" +
                "energy=" + energy +
                ", defEnergy=" + defEnergy +
                ", id=" + id +
                ", xy=" + xy +
                '}';
    }
}
