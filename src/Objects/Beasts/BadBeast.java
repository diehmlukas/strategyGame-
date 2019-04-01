package Objects.Beasts;

import Objects.Entities.Entity;

public class BadBeast extends Entity {
    private final int defEnergy;

    public BadBeast(int energy, int id, int x, int y) {
        this.defEnergy = -150;
        updateEnergy(energy);
        setId(id);
        getXy().setX(x);
        getXy().setY(y);
    }

    @Override
    public String toString() {
        return "BadBeast{" +
                "defEnergy=" + defEnergy +
                ", " + super.toString();
    }
}
