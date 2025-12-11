public class Selectionsort {
    //em cada loop, selecionar o menor item da parte desordenada e mover para a parte ordenada
    //olhar tudo, escolher um

    //dois loops
    
    public static void selectionSort(int[] v){
        int aux;
        for (int i = 0; i<v.length-1;i++){
            int min = i;
            
            for (int j=i+1;j<v.length;j++){
                if(v[j]<v[min]){
                min = j;
            }
            }
            if (min !=i){
                aux = v[i];
                v[i] = v[min];
                v[min]=aux;

            }
        }
    }
}
