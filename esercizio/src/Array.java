/**
 * @author Mustapha Bazin
 * $date(05/03/2023)
 * */



import static function.ArrayFunction.*; // min(int[] a) idMin(int[] a) som(int[] a,int[] b)

public class Array {
    public static void main(String[] args){
        int[] ar={10,9,1,3};
        int[] ar1={10,3,7,30,8};
        // minima dell'array
        int a=min(ar);
        // indice del minimo elemente nel array
        int i=idMin(ar);
        //la somma di due array
        int[] b=som(ar,ar1);

        //Stampare il minimo
        System.out.println("il minimo nell'array: ");

        //Stampa indice del minimo
        System.out.println(a+" con indice "+i);
        System.out.println("");

        //Stamppare la somma degli due array

        System.out.println("la somma di ar e ar1: ");
        System.out.print("[ ");
        for(int j=0;j<b.length;j++){

            if(j==b.length-1){
                System.out.print(b[j]);
            }else{
                System.out.print(b[j]+",");
            }
        }
        System.out.print(" ]");

    }
}
