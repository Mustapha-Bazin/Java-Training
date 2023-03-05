package function;

public class ArrayFunction {
    // Methodo restituisce il valore minimo su un array
    public static int min(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        return min;
    }

    // Methodo restituisce l'indice del valore piu piccolo
    public static int idMin(int[] a){
        int m=0;
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
                m=i;
            }
        }
        return m;
    }

    //Methodo restituisce la somma di due array
    public static int[] som(int[]a,int[]b){
        int[] s;
        if(a.length==b.length){
            s=new int[a.length];
            for(int i=0;i<a.length;i++){
                s[i]=a[i]+b[i];
            }
        }else if(a.length<b.length){
            s=new int[b.length];
            for(int i=0;i<a.length;i++){
                s[i]=a[i]+b[i];
            }
            for(int i=a.length;i<b.length;i++){
                s[i]=b[i];
            }
        }else{
            s=new int[a.length];
            for(int i=0;i<b.length;i++){
                s[i]=a[i]+b[i];
            }
            for(int i=b.length;i<a.length;i++){
                s[i]=a[i];
            }
        }
        return s;
    }
}
