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

    public XY generateNewPosition(XY currentPosition) {
        Random rd = new Random();
        XY out = currentPosition;

        while (true) {
            int rdNo = rd.nextInt(9);

            switch (rdNo) {
                case 0:
                    out.setY(currentPosition.getY() - 1);
                    out.setX(currentPosition.getX() - 1);
                    break;
                case 1:
                    out.setY(currentPosition.getY() - 1);
                    break;
                case 2:
                    out.setY(currentPosition.getY() - 1);
                    out.setX(currentPosition.getX() + 1);
                    break;
                case 3:
                    out.setX(currentPosition.getX() - 1);
                    break;
                case 4:
                    break;
                case 5:
                    out.setX(currentPosition.getX() + 1);
                    break;
                case 6:
                    out.setY(currentPosition.getY() + 1);
                    out.setX(currentPosition.getX() - 1);
                    break;
                case 7:
                    out.setY(currentPosition.getY() + 1);
                    break;
                case 8:
                    out.setY(currentPosition.getY() + 1);
                    out.setX(currentPosition.getX() + 1);
                    break;
            }

            if (!(out.getX() < 0 || out.getY() < 0 || out.getX() > xLength || out.getY() > yLength))
                return out;
        }
    }
}
