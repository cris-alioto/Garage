
package garage;

public class Motocicletta extends VeicoloAMotore {
    
    private String tipologia;
    
    //Constructor
    public Motocicletta(String tipologia, String marca, String modello, Alimentazione tipo_alimentazione, double cilindrata, int anno_immatricolazione) {
        super(marca, modello, tipo_alimentazione, cilindrata, anno_immatricolazione);
        this.tipologia = tipologia;
    }
    
    //toString
    @Override
    public String toString() {
        return stampa() + " | tipologia = " + tipologia;
    }

    //Getter
    public String getTipologia() { return tipologia; }
    
    
}
