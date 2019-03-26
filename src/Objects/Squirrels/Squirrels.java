package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.*;

public abstract class Squirrels implements MovableObjects {
    private int energy;
    private int id;
    private XY xy;

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
        return "Squirrels{" +
                "energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                '}';
    }
}
