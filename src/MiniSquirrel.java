public class MiniSquirrel extends Squirrels {
    private final int defEnergy;

    public MiniSquirrel(int defEnergy) {
        this.defEnergy = defEnergy;
    }

    @Override
    public String toString() {
        return "MiniSquirrel{" +
                "defEnergy=" + defEnergy +
                "} " + super.toString();
    }
}
