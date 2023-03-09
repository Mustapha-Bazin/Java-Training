/**
 * @author MUSTAPHA BAZIN
 * In questa lezione andremo a illustrare il funzionamento delle funzioni
 * vedendo la dichiarazione (eignature) di esse . assieme alla lista di parametri
 * passabili all'interno di
 */

package lezione09_03.funzioni;

public class EsempioFunction {

    /**
     * questa funzione esgui la somma di due numeri interi
     * @param primoNumero
     * @param secondoNumero
     * @return risultato ristituito
     */
    static int somma(int primoNumero,int secondoNumero){
        int risultato = primoNumero+secondoNumero;
        return risultato;
    }

    public static void main(String [] args){
        int primoNumero=6;
        int secondoNumero=10;
        //int risultato = primoNumero+secondoNumero;
        int risultato = somma(primoNumero,secondoNumero);
        System.out.println("la somma e: "+risultato);

    }
}
