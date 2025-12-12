public class Insertionsort {

    public void insertionsort(int[] v){
        // Começamos do índice 1 (o segundo elemento).
        // Por quê? Porque assumimos que o elemento 0 (o primeiro) já está "ordenado" sozinho.
        for (int i=1;i<v.length;i++){

            int chave = v[i];

            int j = i-1;

            while(j>=0 && v[j]>chave){
                v[j+1]=v[j];
                j--;

            }

            //insertion
            v[j+1]=chave;

        }
    }
    
}
