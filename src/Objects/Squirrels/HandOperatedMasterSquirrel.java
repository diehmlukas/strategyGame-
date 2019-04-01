package Objects.Squirrels;

import Logic.XY;
import java.io.*;

class HandOperatedMasterSquirrel extends MasterSquirrel {

    static XY nextPosition(XY currentPosition) {
        while (true) {
            int move = readDirection();
            XY out = currentPosition;

            switch (move) {
                case 0:
                    out.setY(currentPosition.getY() - 1);
                    break;
                case 1:
                    out.setY(currentPosition.getY() + 1);
                    break;
                case 2:
                    out.setX(currentPosition.getX() - 1);
                    break;
                case 3:
                    out.setX(currentPosition.getX() + 1);
                    break;
                default:
                    break;
            }

            if (!(out.getX() < 0 || out.getY() < 0 || out.getX() > out.getxLength() || out.getY() > out.getyLength()) && move != -1)
                return out;
        }
    }

    private static int readDirection() {
        int out = -1;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String puffer = in.readLine();
            char dir = puffer.toCharArray()[0];
            System.in.read();
            switch (dir) {
                case 'w' | 'W':
                    out = 0;
                case 's' | 'S':
                    out = 1;
                case 'a' | 'A':
                    out = 2;
                case 'd' | 'D':
                    out = 3;
                default:
                    break;
            }
        }
        catch(IOException e) {
            System.out.println("Please enter a valid sign.");
        }
        return out;
    }
}
