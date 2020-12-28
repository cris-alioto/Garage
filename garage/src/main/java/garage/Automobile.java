
package garage;

public class Automobile extends VeicoloAMotore {

    private int posti; 
    
    //Constructor
    public Automobile(int posti, String marca, String modello, Alimentazione tipo_alimentazione, double cilindrata, int anno_immatricolazione) {
        super(marca, modello, tipo_alimentazione, cilindrata, anno_immatricolazione);
        this.posti = posti; 
    }

    //toString
    @Override
    public String toString() {
        return stampa() + " | posti = " + posti;
    }

    //Getter
    public int getPosti() { return posti; }
    
    
}
