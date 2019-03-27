package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.EntitySet;
import Objects.Entities.MovableObjects;

public abstract class Squirrels implements MovableObjects {
    private int energy;
    private int id;
    private XY xy;

    public void nextStep() {
        //do nothing. Functionality implemented in child classes
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

    public boolean checkTargetPosition(XY nextPosition, EntitySet entitySet) {
        for (int i = 0; i < entitySet.getGoodPlants().length; i++) {
            if (entitySet.getGoodPlants()[i] != null && entitySet.getGoodPlants()[i].getX() == nextPosition.getX() && entitySet.getGoodPlants()[i].getY() == nextPosition.getY())
                return true;
        }
        return false;
    }
}
