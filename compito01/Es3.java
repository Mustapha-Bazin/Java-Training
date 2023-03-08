/**
 * @author MUSTAPHA BAZIN;
 * inverti dato un array, restituisce 
 * l'array al contrario. Es: {1,2,3,4,5,6} 
 * ritorna: {6,5,4,3,2,1
 * $date(08/03/23);
 */
package compito01;
import java.util.Scanner;
public class Es3 {
    static int[] rev(int[] array){
        int[] rev=new int[array.length];
        for(int i=0;i<array.length;i++){
            rev[i]=array[array.length-i-1];
        }
        return rev;
    }
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int[] a={1,2,3,4,5,6};

        int[] rev=rev(a);
        System.out.print("{");
        for(int i=0;i<rev.length;i++){
            System.out.print(" "+rev[i]+" ");
        }
        System.out.print("}");

    }
}
