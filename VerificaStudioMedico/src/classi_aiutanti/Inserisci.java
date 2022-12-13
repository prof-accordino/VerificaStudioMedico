package classi_aiutanti;
import java.util.Date;
import java.util.Scanner;
import java.time.LocalDateTime;    

/*
 * Questa classe l'ho creata per facilitare 
 * le operazioni di inserimento dei dati
 */
public class Inserisci
{
	static Scanner in = new Scanner(System.in);
	
	/*
	 * Questo metodo stampa un messaggio prima di prendere
	 * un intero dalla tastiera: rende l'inserimento più
	 * simile al python: se si vuole chiedere all'utente
	 * un numero intero bastera scrivere:
	 * 
	 *  int n = Inserisci.numero_intero("Metti un numero");
	 *  
	 *  Posso usare direttamente il nome della classe perché
	 *  si tratta di un metodo statico!
	 */
	public static int numero_intero(String messaggio)
	{	
		StampaConCorince(messaggio);
		return Integer.parseInt(in.nextLine());
	}
	
	/*
	 * Uguale a numero_intero ma con il dobule
	 */
	public static double numero_virgola(String messaggio)
	{
		StampaConCorince(messaggio);
		return Double.parseDouble(in.nextLine());
	}
	/*
	 * Idem ma con le stringhe
	 */
	public static String stringa(String messaggio)
	{
		StampaConCorince(messaggio);		
		return in.nextLine();
	}
	
	/*
	 * Questo serve per inserire la data corrente 
	 */
	public static Data data_di_oggi()
	{
		Data retVal = new Data
		(
			LocalDateTime.now().getDayOfMonth(),
			LocalDateTime.now().getMonthValue(),
			LocalDateTime.now().getYear()
		);
		return retVal;
	}
	
	public static void StampaConCorince(String messaggio)
	{
		String top_bottom = "+-" +  "-".repeat(messaggio.length())+ "-+\n";
		String middle = "| " + messaggio + " |\n";
		System.out.print(top_bottom + middle + top_bottom);				
	}
}
