package de.hsa.games.fatsquirrel.core.objects;

import java.util.Random;

public final class XY {
    public final int x;
    public final int y;
    public final Vectors upperRight = new Vectors(1, -1);
    public final Vectors upperMiddle = new Vectors(0, -1);
    public final Vectors upperLeft = new Vectors(-1, -1);
    public final Vectors midRight = new Vectors(1, 0);
    public final Vectors midLeft = new Vectors(-1, 0);
    public final Vectors lowerLeft = new Vectors(-1, 1);
    public final Vectors lowerMiddle = new Vectors(0, 1);
    public final Vectors lowerRight = new Vectors(1, 1);

    public XY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final static class Vectors {
        public final int x;
        public final int y;

        Vectors(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    @Override
    public String toString() {
        return "XY{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public XY generateNewPosition() {
        Random rd = new Random();

        while (true) {
            int rdNo = rd.nextInt(9);
            XY out = new XY(x, y);

            switch (rdNo) {
                case 0:
                    out = new XY(x + upperLeft.x, y + upperLeft.y);
                    break;
                case 1:
                    out = new XY(x + upperMiddle.x, y + upperMiddle.y);
                    break;
                case 2:
                    out = new XY(x + upperRight.x, y + upperRight.y);
                    break;
                case 3:
                    out = new XY(x + midLeft.x, y + midLeft.y);
                    break;
                case 4:
                    out = new XY(x, y);
                    break;
                case 5:
                    out = new XY(x + midRight.x, y + midRight.y);
                    break;
                case 6:
                    out = new XY(x + lowerLeft.x, y + lowerLeft.y);
                    break;
                case 7:
                    out = new XY(x + lowerMiddle.x, y + lowerMiddle.y);
                    break;
                case 8:
                    out = new XY(x + lowerRight.x, y + lowerRight.y);
                    break;
            }

            if (!(out.x < 0 || out.y < 0))
                return out;
        }
    }
}
