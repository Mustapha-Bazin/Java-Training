/**
 * @author MUSTAPHA BAZIN
 * Scrivere un main che 
 * simuli un terminale 
 * di una banca. Per ora 
 * si ipotizzi di aver 
 * già fatto il login. 
 * Il terminale quindi 
 * chiede all'utente 
 * cosa vuole fare e tra 
 * le scelte c'è 
 * deposita, preleva, saldo.
 * 
 * 
 * $date(03/08/23);
 */
package riscaldamento_08;
import java.util.Scanner;
import java.util.ArrayList;
import riscaldamento_08.*;


public class Banca {

    public static void main(String[] args){
        ContoCorrente cliente1=new ContoCorrente("MUSTAFA","BAZIN");

        Scanner input=new Scanner(System.in);

        System.out.println("inserisci il saldo");
        cliente1.setSaldo(input.nextDouble());

        System.out.println("cosa vuoi fare");
        System.out.println("\t per deposit stampa 1");
        System.out.println("\t per preleva stampa 2");
        System.out.println("\tper i tuoi soldi stampa 3");

        int s=input.nextInt();
        int a=input.nextInt();

        switch(s){
            case 1:System.out.println(cliente1.deposita(a));
            break;
            case 2:System.out.println(cliente1.preleva(a));
            break;
            case 3:cliente1.getSaldo();
            break;
            default:System.out.println("non esiste questa operazione");
        }

        //ArrayList<String> cars = new ArrayList<String>();


    }
    
}
