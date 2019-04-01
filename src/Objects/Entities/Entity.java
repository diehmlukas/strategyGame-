package Objects.Entities;

import Logic.XY;

public abstract class Entity {
    private int id;
    private int energy;
    private XY xy;
    private int IDcount = 0;

    public int getIDcount() {
        return IDcount++;
    }

    public void updateEnergy(int delta) {
        energy += delta;
    }

    public int getEnergy() {
        return energy;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean compareEntities(Entity entity, Entity entity2) {
        if (entity.equals(entity2))
            return true;
        else
            return false;
    }
}
