package compito01;
/**
 * @author MUATAPHA BAZIN;
 * Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice numerico di cinque cifre.
 * Quando l'utente scrive la risposta, il programma restituisce due valori: il numero di cifre al posto giusto
 * la somma di queste cifre. Per esempio, se il codice segreto è 53840 e l'utente ipotizza 83241, le cifre 3 
 * e 4 sono al posto giusto. Il programma restituisce in output i numeri 2 (cifre corrette) e 7 (somma). 
 * $date(08/03/23);
 */
import java.util.Scanner;
 public class Es1{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("insersci un codice numerico di cinque cifre");
        
        String in=""; //il codice inserito
        char cifra; //insersci cifra per cifra
        
        int codice=0;
        int corr=0;

        String cs="53840"; // codice segreto
        for(int i=0;i<5;i++){
            int a;
            do{
                System.out.println("insersci la cifre numero "+(i+1));
                cifra=input.next().charAt(0);
                a=cifra;
            }while(a>=57 && a<=48 );//end while
            in+=cifra;
           // System.out.println(a);
            if(cifra==cs.charAt(i)){
                corr++;
                codice+=(int) cifra-48;
            }//end if
        }
        System.out.println("hai inserito "+in+" abbiamo "+corr+" cifre corrette e la somma di numeri corrette equale a "+codice);

        // cifra=input.next().charAt(0);
        // int a=cifra;
        // // char a='1';
        // System.out.print( a);
        
        
    }// end main
 }