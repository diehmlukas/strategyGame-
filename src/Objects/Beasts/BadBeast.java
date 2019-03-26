package Objects.Beasts;

public class BadBeast implements MovableObjects {
    private final int defEnergy;

    public BadBeast(int defEnergy) {
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

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public String toString() {
        return "Objects.Beasts.BadBeast{" +
                "defEnergy=" + defEnergy +
                '}';
    }
}
