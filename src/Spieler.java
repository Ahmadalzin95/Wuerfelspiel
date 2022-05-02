public class Spieler {

    private String name;
    private int feld = 0;

    public Spieler(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int getFeld(){
        return feld;
    }

    public void setFeld(int feld){
        this.feld = feld;
    }
}
