
package garage;

public class VeicoloAMotore {
    
    protected String marca;
    protected String modello;
    protected Alimentazione tipo_alimentazione;
    protected double cilindrata;
    protected int anno_immatricolazione;

    //Constructor
    public VeicoloAMotore(String marca, String modello, Alimentazione tipo_alimentazione, double cilindrata, int anno_immatricolazione) {
        this.marca = marca;
        this.modello = modello;
        this.tipo_alimentazione = tipo_alimentazione;
        this.cilindrata = cilindrata;
        this.anno_immatricolazione = anno_immatricolazione;
    }

    //toString
    @Override
    public String toString() {
        return stampa();
    }
    
    //Getters
    public String getMarca() { return marca; }
    public String getModello() { return modello; }
    public Alimentazione getTipo_alimentazione() { return tipo_alimentazione; }
    public double getCilindrata() { return cilindrata; }
    public int getAnno_immatricolazione() { return anno_immatricolazione; }
    
    protected String stampa(){
        return getClass().getName().substring(7) + " -> marca = " + marca + " | modello = " + modello + " | tipo_alimentazione = " + tipo_alimentazione + " | cilindrata = " + cilindrata + " | anno_immatricolazione = " + anno_immatricolazione;
    } 
    
}
