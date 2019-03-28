package Objects.Beasts;

import Objects.Entities.Entity;

public class BadBeast extends Entity {
    private final int defEnergy;

    public BadBeast() {
        this.defEnergy = -150;
    }

    @Override
    public String toString() {
        return "BadBeast{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
