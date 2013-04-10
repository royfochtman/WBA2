package aufgabe4;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import aufgabe4.Rezeptliste;
import aufgabe4.Rezeptliste.Rezept;
import aufgabe4.Rezeptliste.Rezept.Kommentare;
import aufgabe4.Rezeptliste.Rezept.Zutaten.Zutat;

import java.io.File;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

public class RezeptMain {

	/**
	 * @param args
	 */
	
	public static void save(Rezeptliste rezeptliste, File file){
		try{
			JAXBContext context = JAXBContext.newInstance("aufgabe4");
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(rezeptliste, file);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void main(String[] args) throws Exception{
		JAXBContext jc = JAXBContext.newInstance("aufgabe4"); //Packagename, wo sich die ObjectFactory.java Datei befindet
	    Unmarshaller unmarshaller = jc.createUnmarshaller();
	    
	    
	    /*
	     * Neues Scanner-Objekt zum einlesen der Auswahl
	     */
	    Scanner sc = new Scanner(System.in);
	    
	    
	    
	    /*
	     * XML-Datei zum einlesen importieren.
	     */
	    Rezeptliste rezeptListeFile = (Rezeptliste) unmarshaller.unmarshal(new File("src/aufgabe3/aufgabe3_teil_d_XML_final.xml"));
	    
	    /*
	     * Rezeptliste einlesen
	     */
	    List<Rezept> rezeptListe = rezeptListeFile.rezept;

	    
	    
	    /*
	     * Auswahlmenue
	     */
	    System.out.println("Geben Sie bitte Ihre Auswahl ein: ");
	    System.out.print("\n 1: Alle Rezepte ausgeben\n 2: Ein Rezept auswaehlen\n");
	    
	    /*
	     * Auswahl einlesen
	     */
	    
	    int eingabe = sc.nextInt();
	    
	    switch(eingabe){
	    case 1:
	    	/* alle Rezepte ausgeben.*/
	    	break;
	    case 2:
	    	/* Rezept n auswaehlen. */
	    	System.out.println("Geben Sie bitte den Index des gewuenschten Rezeptes ein: \n");
	    	eingabe = sc.nextInt();
	    	Rezept rezept = rezeptListe.get(eingabe);
	    	System.out.println("Zutaten:");
	    	System.out.println("Rezeptname: " + rezept.titel);
	    	if(rezept.zutaten != null){
	    		for(Zutat zutat : rezept.zutaten.zutat){
	    			
	    			System.out.println(zutat.anzahl + " " + zutat.einheit + " " + zutat.zutatsname);
	    		}
	    	}
	    	System.out.println("Anzahl Portionen: " + rezept.anzahlportionen);
	    	System.out.println("Zubereitung: ");
	    	System.out.println("Benoetigte Zeit: " + rezept.zubereitung.arbeitszeit + " " +
	    	rezept.zubereitung.zeiteinheit + ", Schwierigkeitsgrad: " + rezept.zubereitung.schwierigkeitsgrad
	    	+ ", Brennwert p. P." + rezept.zubereitung.brennwert + " Kcal.\n");
	    	
	    	System.out.println(rezept.zubereitungsschritte);
	    	
	    	System.out.println("Kommentare: ");
	    	
	    	for(String kommentar: rezept.kommentare.kommentar){
	    		System.out.println(kommentar);
	    	}
	    	
	    	System.out.println("\n\n Kommentar hinzufuegen: \n");
	    	
	    	String kommentar = sc.next();
	    	
	    	rezept.kommentare.kommentar.add(kommentar);
	    	
	    	save(rezeptListeFile, new File("src/aufgabe3/aufgabe3_teil_d_XML_final.xml"));
	    	
	    	
	    	break;
	    }
	    
	}

}
