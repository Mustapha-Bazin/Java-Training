/**
 * @author MUSTAPHA BAZIN
 * scrivere la classe ContoCorrente con 
 * l'attributo String nome, String cognome 
 * e i metodi preleva e deposita. Non è 
 * possibile prelevare/depositare un numero 
 * negativo e non si può prelevare se non 
 * ci sono abbastanza saldo. I controlli 
 * devono essere fatti all'interno di 
 * preleva e deposita.
 * $date(08/03/23);
 */

    

package riscaldamento_08;


public class ContoCorrente {
    private String nome;
    private String cognome;
    private Persona p;
    private double saldo;
    private int id;
    private static int prossimoId=0;
    public static final String NOME_BANCA="posta";

    public ContoCorrente(String nome,String cognome){
        this.p=new Persona(nome,cognome);
        // this.nome=nome;
        // this.cognome=cognome;
        this.saldo=0;
        this.id=prossimoId++;
    }
    /*public ContoCorrente(Persona p){
        this.p=p;
        this.saldo=saldo;
        this.id=prossimoId++;
    }*/
    public double preleva(double a){
        if(this.saldo>=a){
            this.saldo-=a;
        }else{
            System.out.print("non se puo saldo insufficenti");
        }
        return this.saldo;
    }
    public double deposita(double a){
        if(a>=0){
            this.saldo+=a;
        }
        return this.saldo;
    }
    public void setSaldo(double m){
       saldo=m;
    }
    public void getSaldo(){
        System.out.println("i tuoi saldo "+this.saldo);
    }
    
}
