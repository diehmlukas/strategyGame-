package Objects.Beasts;

import Objects.Entities.Entity;

public class GoodBeast extends Entity {
    private final int defEnergy;

    public GoodBeast(int energy,int id, int x, int y) {
        this.defEnergy = 200;
        updateEnergy(energy);
        setId(id);
        getXy().setX(x);
        getXy().setY(y);
    }

    @Override
    public String toString() {
        return "GoodBeast{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
