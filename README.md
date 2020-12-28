#Compito

Si realizzi un progetto Java per la gestione di un garage pubblico, secondo le specifiche seguenti. 

Realizzare la classe base VeicoloAMotore, estendendola poi per  realizzare le sottoclassi che modellano le entità furgone, automobile e motocicletta. : Anno di immatricolazione, Cilindrata, Tipo di alimentazione (benzina, diesel, ibrida), Marca, Modello.  Per i furgoni deve essere presente la capacità di carico, per le automobili il numero di porte, per le motocicliette la tipologia (enduro, cross, ...). Nelle sottoclassi ridefinire in particolare il metodo toString in modo che ogni entità possa visualizzare in forma di stringa tutte le informazioni che la riguardano

Si implementi poi una classe Garage, dotata di  15 posti, ognuna dei quali è identificata da un numero (a partire da zero) e, per motivi di capienza, può ospitare soltanto automobili, furgoni e motociclette. Devono essere possibile le seguenti operazioni: 

* Immissione di un nuovo veicolo nel garage (ritornare il numero del posto assegnato);

* Estrazione dal garage del veicolo che occupa un determinato posto (ritornare l’istanza del veicolo stesso);

* Stampa della situazione corrente dei posti nel garage: stampare per ogni posto tutte le informazioni disponibili sul veicolo che lo sta occupando.

Eseguire il test della classe realizzata mediante la classe MainGarage.

CONSEGNARE il link su github del vostro progetto contenente: 
DIagramma UML.
Codice funzionante.