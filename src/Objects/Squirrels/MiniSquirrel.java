package Objects.Squirrels;

import Logic.XY;

public class MiniSquirrel extends Squirrels {
    private int energy;
    private final int id;
    private XY xy;

    public MiniSquirrel(int energy, int id, XY xy) {
        this.energy = energy;
        this.id = id;
        this.xy = xy;
    }

    @Override
    public void nextStep(){

    }

    @Override
    public String toString() {
        return "MiniSquirrel{" +
                "energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                "} " + super.toString();
    }
}
