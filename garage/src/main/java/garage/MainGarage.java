
package garage;

import java.util.Scanner;

public class MainGarage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Garage garage = new Garage();
        //System.out.println(garage);
        Motocicletta moto = new Motocicletta("cross","bho","mod",Alimentazione.DIESEL,10,2020);
        System.out.println("Motocicletta aggiunta al posto: " + garage.aggiungiVeicolo(moto));
        //System.out.println(garage);
        Automobile auto = new Automobile(4,"bho","mod",Alimentazione.DIESEL,10,2020);
        System.out.println("Automobile aggiunta al posto: " + garage.aggiungiVeicolo(auto));
        //System.out.println(garage);
        System.out.println(garage.estraiVeicolo(0) + "\n E' stato/a espulso/a");
        System.out.println(garage);
    }
    
}
