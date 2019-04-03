package de.hsa.games.fatsquirrel.core;

import de.hsa.games.fatsquirrel.core.objects.XY;
import de.hsa.games.fatsquirrel.core.objects.beasts.BadBeast;
import de.hsa.games.fatsquirrel.core.objects.beasts.GoodBeast;
import de.hsa.games.fatsquirrel.core.objects.entities.Entity;
import de.hsa.games.fatsquirrel.core.objects.squirrels.MasterSquirrel;
import de.hsa.games.fatsquirrel.core.objects.squirrels.MiniSquirrel;

public interface EntityContext {
    public XY getSize();
    public void tryMove(MiniSquirrel miniSquirrel, XY moveDirection );
    public void tryMove(GoodBeast goodBeast, XY moveDirection );
    public void tryMove(BadBeast badBeast, XY moveDirection );
    public void tryMove(MasterSquirrel master, XY moveDirection );
    public PlayerEntity nearestPlayerEntity(XY pos);

    public void kill(Entity entity);
    public void killAndReplace(Entity entity);
    public EntityType getEntity(XY xy);

}
