public class Bubblesort {

    int[] v;

    //O bubble sort precisa de dois loops pra funcionar

    public static void bubblesort(int[] v){
        boolean houveTroca;
        int aux;
       for(int b=0; b<v.length;b++){
        houveTroca = false;
        for(int i=0;i<v.length-1;i++){
            if (v[i]>v[i+1]){
                aux = v[i];
                v[i]=v[i+1];
                v[i+1]=aux;
                houveTroca = true;          
        }
        }
        if(!houveTroca){
            break;
        }
       }
    }
    
}
