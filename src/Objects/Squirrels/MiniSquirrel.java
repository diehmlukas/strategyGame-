package Objects.Squirrels;

public class MiniSquirrel extends Squirrels {
    private final int defEnergy;

    public MiniSquirrel(int defEnergy) {
        this.defEnergy = defEnergy;
    }

    @Override
    public String toString() {
        return "Objects.Squirrels.Objects.Squirrels.MiniSquirrel{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
