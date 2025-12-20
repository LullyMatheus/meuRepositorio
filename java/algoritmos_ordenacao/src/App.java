package algoritmos_ordenacao.src;

public class App {
    public static void main(String[] args) throws Exception {

        int[] v = {1,4,4,3,8,43,2,3,48,9,07,4};

        printarVetor(v);

        System.out.println();

        bubblesort(v);

        printarVetor(v);
        
        
    }

    public static void printarVetor(int[] v){
        System.out.print("[ ");
        for(int t=0;t<v.length;t++){
            if(t!=v.length-1){
                System.out.print(v[t]+", ");
            } else{
                System.out.print(v[t]);
            }
            
        }
        System.out.print("]");
    }

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
