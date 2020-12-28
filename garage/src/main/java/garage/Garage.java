
package garage;

public class Garage {
    
    private VeicoloAMotore[] posti;

    //Constructor
    public Garage() {
        posti = new VeicoloAMotore[15];
    }
    
    //toString
    @Override
    public String toString(){
        String stampa = "------- Garage -------";
        for(int p = 0; p<15; p++){
            stampa += "\n Posto " + p + ": " + posti[p]; 
        }
        return stampa;
    }

    //
    public int aggiungiVeicolo(VeicoloAMotore v) {
        for(int p = 0; p<15; p++){
            if(posti[p]==null){
                posti[p] = v;
                return p;
            }
        }
        return -1;
    }
    
    public VeicoloAMotore estraiVeicolo(int posto){
        if(posto<0 || posto>14) return null;
        VeicoloAMotore v = posti[posto];
        posti[posto] = null;
        return v;
    }
    
}
