package Logic;

import Objects.Entities.EntitySet;
import Objects.Squirrels.MasterSquirrel;

public class Main {
    public static void main(String[] args) {
        EntitySet entitySet = new EntitySet();
        MasterSquirrel masterSquirrel1 = new MasterSquirrel();

        entitySet.addEntity(masterSquirrel1);
    }
}
