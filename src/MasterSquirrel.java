public class MasterSquirrel extends Squirrels {
    private final int defEnergy;

    public MasterSquirrel(int defEnergy) {
        this.defEnergy = defEnergy;
    }

    public boolean isMiniSquirrel(MiniSquirrel miniSquirrel) {

    }

    @Override
    public String toString() {
        return "MasterSquirrel{" +
                "defEnergy=" + defEnergy +
                '}' + super.toString();
    }
}
