public interface Entity {
    void updateEnergy(int delta);
    int getEnergy();
    int getID();
    int getX();
    int getY();

    //FIXME: Ebenso soll es möglich sein, auf Standardweise zu entscheiden, ob zwei Objekte dieselbe Entity repräsentieren. ???
    //  Deshalb implementieren wir die für diesen Modus erforderliche Abfrage der Benutzereingabe nicht in der nextStep()-Methode von MasterSquirrel,
    //  sondern tun das in einer Spezialisierung namens HandOperatedMasterSquirrel.
    //  Die Benutzerführung besteht darin, dass in der Konsole der nächste Schritt abgefragt wird.
    //  Damit die Eingabe flott mit einer Hand gemacht werden kann, definieren Sie sich nur 4 Buchstaben, z. B. '1','2','3','4', die auf die vier Richtungen UP, DOWN, RIGHT, LEFT gemappt werden sollen.
    //  Wer zweihändig auch gut koordiniert agieren kann, darf gerne alle 8 Richtungen abdecken. Ein Finger muss dann aber trotzdem schnell auf Enter drücken können ...
}
