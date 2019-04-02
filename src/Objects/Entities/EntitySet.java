package Objects.Entities;

import Logic.XY;

public class EntitySet {
    private int arraySize;
    private Entity[] entities;

    public EntitySet() {
        this.arraySize = 1000;
        entities = new Entity[arraySize];
    }

    public void addEntity(Entity entity) {
        int count = 0;
        try {
            while (entities[count] != null)
                count++;
            entities[count] = entity;
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("Too many objects! Your new object has been ignored.");
        }
    }

    public void deleteEntity(Entity entity) {
        int count = 0;
        while (entities[count] != entity && count < entities.length)
            count++;
        entities[count] = null;
    }

    public Entity[] getEntities() {
        return entities;
    }

    public void callNextStep() {
        for (int i = 0; i < entities.length; i++) {
            if (entities[i] != null)
                entities[i].nextStep();
        }
    }

    public Entity onPosition(XY xy) {
        for (int i = 0; i < entities.length; i++) {
            if (entities[i].getXy().equals(xy))
                return entities[i];
        }
        return null;
    }
}
