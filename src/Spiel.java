public class Spiel {
    private Spieler[] spieler;

    public Spiel(int anzahlSpieler){
        spieler = new Spieler[anzahlSpieler];
        for(int i=0; i<spieler.length; i++){
            spieler[i]= new Spieler("Spieler " + (i+1));
        }
    }

    private void spielZuruecksetzen(){
        for(int u = 0; u < spieler.length; u++){
            spieler[u].setFeld(0);
        }
    }
    int k;
    int q;
    private void spielerZiehen(Spieler spieler, int wuerfel){
        k = spieler.getFeld();
        spieler.setFeld(wuerfel + k);

        if(spieler.getFeld() == 100 ) {
            q = spieler.getFeld();
            System.out.println(spieler.getName() + " hat gewonnen! " + spieler.getFeld() + ".");
        }
        else if(spieler.getFeld() > 100){
            k = spieler.getFeld();
            spieler.setFeld( k - wuerfel);
            System.out.println(spieler.getName() + " wuerfelt eine " + wuerfel + " kann nicht ziehen " + spieler.getFeld() + ".");
        }

        else if (spieler.getFeld() < 100) {
            System.out.println(spieler.getName() + " wuerfelt eine " + wuerfel + " rueckt vor auf Feld " + spieler.getFeld() + ".");

        }
    }

    public void spielen(){
        q=0;
        spielZuruecksetzen();
        for (int z = 0; z <100; z = q) {

                for (int i = 0; i < spieler.length; i++) {
                    int w = (int) (Math.random() * 6 + 1);
                    spielerZiehen(spieler[i], w);
                    if(q==100){
                        break;
                    }
                    if (w == 6) {
                        for (int u = 6; u == 6; u = w) {
                            w = (int) (Math.random() * 6 + 1);
                            spielerZiehen(spieler[i], w);
                        }
                    }

                }


        }

    }
}
