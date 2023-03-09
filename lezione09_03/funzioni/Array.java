/**
 * @author MUSTAPHA
 * $date(09-03)
 */

package lezione09_03.funzioni;

public class Array {

    /**
     * calcola la media di un array
     * @param a
     * @return restituisci la media di a[]
     */
    static double media(int[] a ){
        double s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s/a.length;
    }

    /**
     * stampa se l'array e crescente o dicrescente o non
     * @param a
     */
    static void ordinamento(int[] a){
        boolean t=true;
        boolean j=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]==a[i+1]){
                if(a[i]<a[i+1]){
                    t=t&&true;
                    j=j&&false;
                }else{
                    j=j&&true;
                    t=t&&false;
                }
            } 
        }//end for
        
        if(t){
            System.out.println("l'array di int e crescente");
        }else if(j){
            System.out.println("l'array di int e decrescente");
        }else{
            System.out.println("l'array di int non e ordinata");
        }
    }

    /**
     * stampa se l'array di string e crescente o decrescente
     * @param s
     */
    static void ordinamentoString(String[]s){
        boolean t=true;
        boolean j=true;
        for(int i=0;i<s.length-1;i++){
            int n=0;
            s[i].toLowerCase();
            s[i+1].toLowerCase();
            while((int) s[i].charAt(n)==(int) s[i+1].charAt(n) && ((n+1)<s[i].length()&&(n+1)<s[i+1].length())){
                n++;
            }

            if((int) s[i].charAt(n)==(int) s[i+1].charAt(n)){
                if(s[i].length()==s[i+1].length()){
                    t=t&&true;
                    j=j&&true;
                }else if(s[i].length()<s[i+1].length()){
                    t=t&&true;
                    j=j&&false;
                }else{
                    t=t&&false;
                    j=j&&true;
                }
            }else if((int) s[i].charAt(n)<(int) s[i+1].charAt(n)){
                t=t&&true;
                j=j&&false;
            }else{
                t=t&&false;
                j=j&&true;
            }
            
        }
        if(t){
            System.out.println("l'array di string e crescente");
        }else if(j){
            System.out.println("l'array di string e decrescente");
        }else{
            System.out.println("l'array di string non e ordinata");
        }
    }


    
     /**
      * ordina un array in modo crescente
      * @param a
      * @return ristituisce un array crescente
      */
    static int[] crescente(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                     x =a[j];
                    a[j]=a[i]; 
                    a[i]=x;
                }
            }
        }
        return a;
    }

    /**
     * ordina l'array in modo decrescent
     * @param a
     * @return restituisce un array decrescent
     */
    static int[] decrescente(int[] a){
        int x;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    x =a[j];
                    a[j]=a[i]; 
                    a[i]=x; 
                }
            }
            
        }
        return a;
    }

   /**
     * ordina l'array in modo crescent
     * @param a
     * @return restituisce un array decrescent
     */
    static String[] cs(String[] a){
        String x;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])>0){
                     x =a[j];
                    a[j]=a[i]; 
                    a[i]=x;
                }
            }
        }
        return a;
    }

    /**
     * ordina l'array in modo decrescent
     * @param a
     * @return restituisce un array decrescent
     */
    static String[] ds(String[] a){
        String x;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i].compareTo(a[j])<0){
                    x =a[j];
                    a[j]=a[i]; 
                    a[i]=x; 
                }
            }
            
        }
        return a;
    }

    public static void main(String[] args){
        int[] a={1,2,3,4,5,6,7,8,9};
        double m = media(a);
        System.out.println("la media e: "+m);

        ordinamento(a);
        String[] s={"ciao","ciao","hello"};
        ordinamentoString(s);

        int[] x=decrescente(a);
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");
        }

        System.out.println(" ");
        String[] b = ds(s); 
        for(int i=0;i<s.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
