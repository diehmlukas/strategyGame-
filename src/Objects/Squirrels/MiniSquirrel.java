package Objects.Squirrels;

public class MiniSquirrel extends Squirrels {
    private final int parentID;

    public MiniSquirrel(int parentID) {
        this.parentID = parentID;
    }

    @Override
    public String toString() {
        return "MiniSquirrel{" +
                ", parentID=" + parentID +
                ", " + super.toString();
    }

    int getParentID() {
        return parentID;
    }
}
