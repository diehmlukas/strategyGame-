package Objects.Entities;

import Logic.XY;

public abstract class Entity {
    private int id;
    private int energy;
    private XY xy;

    public void updateEnergy(int delta) {
        energy += delta;
    }

    public int getEnergy() {
        return energy;
    }

    public int getID() {
        return id;
    }

    public XY getXy() {
        return xy;
    }

    public void setXy(XY xy) {
        this.xy = xy;
    }

    public void nextStep() {
        xy.generateNewPosition();
    }

    @Override
    public String toString() {
        return "Entity{" +
                "energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                '}';
    }

    //TODO: Ebenso soll es möglich sein, auf Standardweise zu entscheiden, ob zwei Objekte dieselbe Objects.Entities.Entity repräsentieren. ???
}
