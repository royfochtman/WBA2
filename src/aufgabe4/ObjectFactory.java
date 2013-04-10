//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.10 um 08:11:55 AM CEST 
//


package aufgabe4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aufgabe4 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aufgabe4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezeptliste }
     * 
     */
    public Rezeptliste createRezeptliste() {
        return new Rezeptliste();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept }
     * 
     */
    public Rezeptliste.Rezept createRezeptlisteRezept() {
        return new Rezeptliste.Rezept();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zutaten }
     * 
     */
    public Rezeptliste.Rezept.Zutaten createRezeptlisteRezeptZutaten() {
        return new Rezeptliste.Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zubereitung }
     * 
     */
    public Rezeptliste.Rezept.Zubereitung createRezeptlisteRezeptZubereitung() {
        return new Rezeptliste.Rezept.Zubereitung();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Kommentare }
     * 
     */
    public Rezeptliste.Rezept.Kommentare createRezeptlisteRezeptKommentare() {
        return new Rezeptliste.Rezept.Kommentare();
    }

    /**
     * Create an instance of {@link Rezeptliste.Rezept.Zutaten.Zutat }
     * 
     */
    public Rezeptliste.Rezept.Zutaten.Zutat createRezeptlisteRezeptZutatenZutat() {
        return new Rezeptliste.Rezept.Zutaten.Zutat();
    }

}
