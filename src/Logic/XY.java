package Logic;

public class XY {
    private int x;
    private int y;

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //TODO: setter?!
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Logic.XY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public XY generateNewPosition(XY currentPosition) {

    }
}
