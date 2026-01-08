public class Vetor {

    private String[] elementos;
    private int tamanhoReal;
    
    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanhoReal=0;
    }

    public void adiciona(String elemento) throws Exception{

        aumentaCapacidade();

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

    public void adiciona(String elemento, int posicao){

        /*
        Seria interessante verificar 
        se eu realmente estou tentando 
        adicionar em uma posicao ocupada 
        */

        if(!(posicao>=0 && posicao<this.tamanhoReal)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        for(int i=this.tamanhoReal;i>posicao;i--){
            this.elementos[i]=this.elementos[i-1];
        }
        this.elementos[posicao]=elemento;
        this.tamanhoReal++;
    }

    private void aumentaCapacidade(){
        if(this.tamanhoReal==this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length*2];
            for(int i=0;i<this.tamanhoReal;i++){
                elementosNovos[i]=this.elementos[i];
            }
            this.elementos=elementosNovos;
        }
    }

    public void remover(int posicao){
        if(posicao<0 || posicao>this.tamanhoReal){
            System.out.println("Posição inválida ou já está vazia!");
            return;
        } else {
            for(int i=posicao;i<this.tamanhoReal-1;i++){
                this.elementos[i]=this.elementos[i+1];
            }
            this.tamanhoReal--;
        }
    }

}
