package Objects.Squirrels;

import Logic.XY;
import Objects.Entities.Entity;
import Objects.Entities.EntitySet;
import Objects.Plants.GoodPlant;

import java.io.*;

public class HandOperatedMasterSquirrel extends MasterSquirrel {

    public XY nextPosition(XY currentPosition, EntitySet entitySet) {
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


            }
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
