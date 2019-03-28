package Objects;

import Objects.Entities.Entity;

public class Wall extends Entity {
    private final int defEnergy;

    public Wall() {
        this.defEnergy = -10;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
