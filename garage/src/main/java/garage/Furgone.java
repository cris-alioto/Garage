
package garage;

public class Furgone extends VeicoloAMotore {
    
    private double cap_carico;

    //Constructor
    public Furgone(double cap_carico, String marca, String modello, Alimentazione tipo_alimentazione, double cilindrata, int anno_immatricolazione) {
        super(marca, modello, tipo_alimentazione, cilindrata, anno_immatricolazione);
        this.cap_carico = cap_carico;
    }
    
    //toString
    @Override
    public String toString() {
        return stampa() + " |  capacità di carico = " + cap_carico;
    }

    //Getter
    public double getCarico() { return cap_carico; }
    
    
    
}
