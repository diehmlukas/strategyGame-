package Objects.Entities;

import Logic.XY;

public abstract class Entity {
    private int id;
    private int energy;
    private XY xy;

    public XY getXy() {
        return xy;
    }

    public abstract void nextStep();

    @Override
    public String toString() {
        return "energy=" + energy +
                ", id=" + id +
                ", x=" + xy.x +
                ", y=" + xy.y +
                '}';
    }

    public boolean compareEntities(Entity entity, Entity entity2) {
        return  (entity.equals(entity2));
    }

    protected Entity() {
        xy = new XY(-1, -1);
    }

    protected void updateEnergy(int delta) {
        energy += delta;
    }

    protected int getEnergy() {
        return energy;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected int getID() {
        return id;
    }

    protected void setXy(XY xy) {
        this.xy = xy;
    }
}
