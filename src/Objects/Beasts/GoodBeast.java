package Objects.Beasts;

import Objects.Entities.Entity;

public class GoodBeast extends Entity {
    private final int defEnergy;

    public GoodBeast() {
        this.defEnergy = 200;
    }

    @Override
    public String toString() {
        return "GoodBeast{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
