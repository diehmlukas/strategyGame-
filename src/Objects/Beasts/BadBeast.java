package Objects.Beasts;

import Logic.XY;
import Objects.Entities.*;

public class BadBeast implements MovableObjects {
    private final int defEnergy;
    private int energy;
    private final int id;
    private XY xy;

    public BadBeast(int energy, int id, XY xy) {
        this.defEnergy = -150;
        this.energy = defEnergy;
        this.id = id;
        this.xy = xy;
    }

    @Override
    public void nextStep() {

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
        return "BadBeast{" +
                "defEnergy=" + defEnergy +
                ", energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                '}';
    }
}
