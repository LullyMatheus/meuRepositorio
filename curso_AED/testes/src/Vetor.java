import java.util.Arrays;

public class Vetor {

    private String[] elementos;
    private int tamanhoReal;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanhoReal=0;
    }

    // public void adiciona(String elemento){
    //     //encontrar uma posicao nula (disponivel para uso)
    //     for (int i=0;i<this.elementos.length;i++){
    //         if(this.elementos[i]==null){
    //             this.elementos[i]=elemento;
    //             break;
    //         }
    //     }
    // }

    public void adiciona(String elemento) throws Exception{

        if(this.tamanhoReal<this.elementos.length){
            this.elementos[this.tamanhoReal]=elemento;
            this.tamanhoReal++;
        } else{
            throw new Exception("O vetor já está cheio!");
        }
        
    }

    public int getTamanhoReal(){
        return this.tamanhoReal;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("[ ");

        for(int i=0;i<this.tamanhoReal-1;i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanhoReal>0){
            s.append(this.elementos[tamanhoReal-1]);
            s.append(" ]");
        }

        return s.toString();
    }

    public String busca(int posicao){

        if(!(posicao>=0 && posicao<this.tamanhoReal)){
            throw new IllegalArgumentException("Posição inválida!");
        }
        return this.elementos[posicao];
    }    
    
    public int existe(String elemento){
        //busca sequencial
        for(int i=0;i<this.tamanhoReal;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }

}
