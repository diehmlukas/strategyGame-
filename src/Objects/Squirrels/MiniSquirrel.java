package Objects.Squirrels;

public class MiniSquirrel extends Squirrels {
    private final int parentID;

    public MiniSquirrel(int parentID) {
        this.parentID = parentID;
    }

    @Override
    public void nextStep() {
        getXy().generateNewPosition();
    }

    @Override
    public String toString() {
        return "MiniSquirrel{" +
                ", parentID=" + parentID +
                ", " + super.toString();
    }

    public int getParentID() {
        return parentID;
    }
}
