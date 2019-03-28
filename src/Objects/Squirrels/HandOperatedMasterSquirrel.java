package Objects.Squirrels;

import Logic.XY;
import java.io.*;

public class HandOperatedMasterSquirrel extends MasterSquirrel {

    private static int readDirection() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            String puffer = in.readLine();
            char dir = puffer.toCharArray()[0];
            switch (dir) {
                case 'w' | 'W':
                    return 0;
                case 's' | 'S':
                    return 1;
                case 'a' | 'A':
                    return 2;
                case 'd' | 'D':
                    return 3;
                default:
                    break;
            }
        }
        catch(IOException e) {
            System.out.println("Please enter a valid sign.");
        }
        return -1;
    }

    //TODO: check map borders exception
    public static XY nextPosition(XY currentPosition) {
        int move = readDirection();
        XY out = currentPosition;

        while (true) {
            if (move == -1)
                move = readDirection();
            else {
                switch (move) {
                    case 0:
                        out.setY(currentPosition.getY() - 1);
                        return out;
                    case 1:
                        out.setY(currentPosition.getY() + 1);
                        return out;
                    case 2:
                        out.setX(currentPosition.getX() - 1);
                        return out;
                    case 3:
                        out.setX(currentPosition.getX() + 1);
                        return out;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Objects.Squirrels.HandOperatedMasterSquirrel{} " + super.toString();
    }
}
