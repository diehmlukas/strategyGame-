package Objects.Entities;

import Logic.XY;

public abstract class Entity {
    private int id;
    private int energy;
    private XY xy;

    public void updateEnergy(int delta) {
        energy += delta;
    }

    public int getEnergy() {
        return energy;
    }

    public int getID() {
        return id;
    }

    public XY getXy() {
        return xy;
    }

    public void setXy(XY xy) {
        this.xy = xy;
    }

    public void nextStep() {

    }

    @Override
    public String toString() {
        return "Entity{" +
                "energy=" + energy +
                ", id=" + id +
                ", xy=" + xy +
                '}';
    }

    //FIXME: Ebenso soll es möglich sein, auf Standardweise zu entscheiden, ob zwei Objekte dieselbe Objects.Entities.Entity repräsentieren. ???
    //  Deshalb implementieren wir die für diesen Modus erforderliche Abfrage der Benutzereingabe nicht in der nextStep()-Methode von Objects.Squirrels.MasterSquirrel,
    //  sondern tun das in einer Spezialisierung namens Objects.Squirrels.HandOperatedMasterSquirrel.
    //  Die Benutzerführung besteht darin, dass in der Konsole der nächste Schritt abgefragt wird.
    //  Damit die Eingabe flott mit einer Hand gemacht werden kann, definieren Sie sich nur 4 Buchstaben, z. B. '1','2','3','4', die auf die vier Richtungen UP, DOWN, RIGHT, LEFT gemappt werden sollen.
    //  Wer zweihändig auch gut koordiniert agieren kann, darf gerne alle 8 Richtungen abdecken. Ein Finger muss dann aber trotzdem schnell auf Enter drücken können ...
}
