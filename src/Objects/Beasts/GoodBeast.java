package Objects.Beasts;

import Objects.Entities.*;

public class GoodBeast extends Entity implements MovableObjects {
    private final int defEnergy;

    public GoodBeast(int defEnergy) {
        this.defEnergy = defEnergy;
    }

    @Override
    public void nextStep(int x, int y) {

    }

    @Override
    public void updateEnergy(int delta) {

    }

    @Override
    public int getEnergy() {
        return 0;
    }

    public int getID() {
        return 0;
    }

    public int getX() {
        return 0;
    }

    public int getY() {
        return 0;
    }

    @Override
    public String toString() {
        return "Objects.Beasts.GoodBeast{" +
                "defEnergy=" + defEnergy +
                '}';
    }
}
