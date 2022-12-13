import classi_aiutanti.*;

public class MainClass
{
	// Inserire qui gli eventuali attributi STATICI richiesti
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			switch(Inserisci.numero_intero("Inserisci scelta"))
			{
				case 0:
					System.out.print("Arrivederci e grazie!");
					return;
				case 1:
					funzione1();
				case 2:
					funzione2();
				case 3:
					funzione3();
				case 4:
					funzione4();
				case 5:
					funzione5();
				case 6:
					funzione6();
				case 7:
					funzione7();
				case 8:
					funzione8();
				case 9:
					funzione9();
				case 10:
					funzione10();
				default:
					Stampa.con_corince("Scelta non prevista, ritentare!");
			}			
		}
	}
	
	static void stampaMenu()
	{
		String menu = 
		  " 0 - Esci dal programma\n" +
		  " 1 - Aggiungi paziente\n" +
		  " 2 - Elimina paziente\n"+
		  " 3 - Stampa info paziente\n"+
		  " 4 - Stampa info elenco pazienti\n"+
		  " 5 - Aggiungi ricetta a paziente\n"+
		  " 6 - Elimina ricetta\n"+
		  " 7 - Stampa info farmaco\n"+
		  " 8 - Stampa info ricetta\n"+
		  " 9 - Stampa info elenco ricette\n"+
		  "10 - Stampa prezzo ricetta";		
		Stampa.con_corince(menu);
	}
	
	// 1 - Aggiungere un nuovo paziente
	static void funzione1()
	{
		// Inserire codice
	}

	// 2 - Eliminare un nuovo paziente inserendo il suo codice fiscale
	static void funzione2()
	{
		// Inserire codice
	}

	// 3 - Stampare le info di un paziente
	static void funzione3()
	{
		// Inserire codice
	}

	// 4 - Stampare le info di tutti i pazienti
	static void funzione4()
	{
		// Inserire codice
	}

	// 5 - Aggiungere una nuova ricetta ad un paziente con relativi farmaci
	static void funzione5()
	{
		// Inserire codice
	}

	// 6 - Eliminare una ricetta inserendo il suo codice identificativo7 - Stampare le info di una farmaco
	static void funzione6()
	{
		// Inserire codice
	}

	//
	static void funzione7()
	{
		// Inserire codice
	}

	// 8 - Stampare le info di i farmaci di una ricetta
	static void funzione8()
	{
		// Inserire codice
	}

	// 9 - Stampare le info di tutte le ricette di un paziente
	static void funzione9()
	{
		// Inserire codice
	}

	// 10 - Stampare il prezzo totale di una ricetta per un paziente tenendo 
	// conto dell'esenzione del paziente (gli esenti non pagano i farmaci convenzionati
	static void funzione10()
	{
		// Inserire codice
	}
}
