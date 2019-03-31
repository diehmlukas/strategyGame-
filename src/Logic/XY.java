package Logic;

import java.util.Random;

public final class XY {
    private int x;
    private int y;
    private int xLength;
    private int yLength;

    //TODO: xLength, yLength set value
    public XY(int x, int y) {
        this.x = x;
        this.y = y;
        this.xLength = ;
        this.yLength = ;
    }

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

    public void generateNewPosition() {
        Random rd = new Random();

        while (true) {
            int rdNo = rd.nextInt(9);

            switch (rdNo) {
                case 0:
                    y--;
                    x--;
                    break;
                case 1:
                    y--;
                    break;
                case 2:
                    y--;
                    x++;
                    break;
                case 3:
                    x--;
                    break;
                case 4:
                    break;
                case 5:
                    x++;
                    break;
                case 6:
                    y++;
                    x--;
                    break;
                case 7:
                    y++;
                    break;
                case 8:
                    y++;
                    x++;
                    break;
            }

            if (!(x < 0 || y < 0 || x > xLength || y > yLength))
                return;
        }
    }
}
