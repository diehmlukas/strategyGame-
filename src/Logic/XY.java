package Logic;

import javax.swing.plaf.ColorUIResource;
import java.time.temporal.ChronoUnit;
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

    //TODO: probably implementation with switch-case
    public XY generateNewPosition(XY currentPosition) {
        int possiblePosition[][] = new int[2][9];
        Random rd = new Random();
        int rdNo = rd.nextInt(9);

        possiblePosition[0][0] = -1;
        possiblePosition[1][0] = -1;
        possiblePosition[0][1] = -1;
        possiblePosition[1][1] = 0;
        possiblePosition[0][2] = -1;
        possiblePosition[1][2] = 1;
        possiblePosition[0][3] = 0;
        possiblePosition[1][3] = -1;
        possiblePosition[0][4] = 0;
        possiblePosition[1][4] = 0;
        possiblePosition[0][5] = 0;
        possiblePosition[1][5] = 1;
        possiblePosition[0][6] = 1;
        possiblePosition[1][6] = -1;
        possiblePosition[0][7] = 1;
        possiblePosition[1][7] = 0;
        possiblePosition[0][8] = 1;
        possiblePosition[1][8] = 1;






        for (int i = 0; i < possiblePosition[1].length; i++) {
            for (int y = -1; y < 2; y++) {
                for (int x = -1; x < 2; x++) {
                    possiblePosition[i].setX(currentPosition.getX() + x);
                    possiblePosition[i].setY(currentPosition.getY() + y);
                }
            }
        }

        if (currentPosition.y == 0 && currentPosition.x == 0){ //top left corner

        }
        else if (currentPosition.y == 0 && currentPosition.x != 0 && currentPosition.x != xLength) { //space between top left corner and top right corner

        }
        else if (currentPosition.y == 0 && currentPosition.x == xLength) { //top right corner

        }
        else if (currentPosition.y != 0 && currentPosition.y != yLength && currentPosition.x == xLength) { // space between top right corner and bottom right corner

        }
        else if (currentPosition.y == yLength && currentPosition.x == xLength) { //bottom right corner

        }
        else if (currentPosition.y == yLength && currentPosition.x != 0 && currentPosition.x != xLength) { //space between bottom right corner and bottom left corner

        }
        else if (currentPosition.y == yLength && currentPosition.x == 0) { // bottom left corner

        }
        else if (currentPosition.y != 0 && currentPosition.x != yLength && currentPosition.x == 0) { //space between bottom left corner and top left corner

        }
        else { //everything in between

        }
    }
}
