package fattoriale;
import java.util.Scanner;
public class fattoriale {

    public static int fat(int i){
        return i>1? i*=fat(i-1):1;
    }   


    //stampa numeri pari da 0 a i
    static void pari(int i){
        if(i>0){
            pari(i-1);
        }
        if(i%2==0){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args){
        System.out.println(fat(3));

        pari(10);
        // String s="";
        // for(int j=0;j<r.length();j++){
        //     s+=r.charAt(r.length()-j-1);
        // }
        
    }
    
}
