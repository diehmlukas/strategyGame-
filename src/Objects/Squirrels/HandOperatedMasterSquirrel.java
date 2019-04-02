package Objects.Squirrels;

import Logic.XY;

import java.io.*;

public class HandOperatedMasterSquirrel extends MasterSquirrel {

    public static XY nextPosition(XY currentPosition) {
        while (true) {
            int move = readDirection();
            XY out = new XY(currentPosition.x, currentPosition.y);

            switch (move) {
                case 0:
                    out = new XY( currentPosition.x + currentPosition.upperMiddle.x, currentPosition.y + currentPosition.upperMiddle.y);
                    break;
                case 1:
                    out = new XY( currentPosition.x + currentPosition.lowerMiddle.x, currentPosition.y + currentPosition.lowerMiddle.y);
                    break;
                case 2:
                    out = new XY( currentPosition.x + currentPosition.midLeft.x, currentPosition.y + currentPosition.midLeft.y);
                    break;
                case 3:
                    out = new XY( currentPosition.x + currentPosition.midRight.x, currentPosition.y + currentPosition.midRight.y);
                    break;
                default:
                    break;
            }

            if ((out.y < 0 || out.x < 0) && move != -1)
                return currentPosition;
            else
                return out;
        }
    }

    private static int readDirection() {
        int out = -1;
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String puffer = in.readLine();
            char dir = puffer.toCharArray()[0];

            switch (dir) {
                case 'w' | 'W':
                    out = 0;
                    break;
                case 's' | 'S':
                    out = 1;
                    break;
                case 'a' | 'A':
                    out = 2;
                    break;
                case 'd' | 'D':
                    out = 3;
                    break;
                default:
                    System.out.println("Please enter a valid sign.");
                    break;
            }
        }
        catch(Exception e) {
            System.out.println("Your input has been rejected. Try again!");
        }
        return out;
    }
}
