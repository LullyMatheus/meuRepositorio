# Curso de Estrutura de Dados

Meus resumos do curso de estrutura de dados da professora Loiane

Curso realizado na linguagem Java.

Site da professora: [loiane.com](https://loiane.com/)

## Por que estudar Estrutura de Dados?

Essa matéria nos ajuda a resolver problemas de forma <u>eficiente</u>! Assim, não estamos preocupados apenas em resolver o problema, mas sim em resolver da melhor forma.

Esse conteúdo também é muito cobrado em entrevistas de emprego.

### O que é estrutura de dados?

Uma estrutura de dados é utilizada para armazenar dados de modo que possam ser acessados e manipulados da melhor forma possível.

Além disso, vamos aprender a identificar qual o tipo de estrutura é o mais adequado para cada caso.



### 1. Vetores (Arrays)

Vetores são uma classe do Java

Vamos aprender:

- Definição;

- Adicionar elementos no final do vetor;

- Verificar quantidade de elementos no vetor;

- Imprimir elementos do vetor;

- Obter elemento de uma posição;

- Verifica se elemento existe no vetor;

- Adicionar elemento em qualquer posição;

- Adicionar mais capacidade ao vetor;

- Remover elemento do vetor;

- Generalizar tipo de elementos;

- Definir o tipo de vetor dinamicamente;

- API Java e ArrayList.

#### Definição

Vetores são o tio mais simples de estrutura. Eles armazenam dados do mesmo tipo.  

```java
double[] temperaturas = new double[365];
//Lembrar que o vetor inicia sempre em 0.
```

Podemos acessar o tamanho do vetor com a propriedade `.length`

Utilizamos um for simples para percorrer todos os elementos.

Criando a classe vetor:

```java
public class Vetor{
    private String[] elementos;
    //esse eh um vetor de Strings

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
}
}
```

Adicionando o método para adicionar no final:

```java
public void adiciona(String elemento){
    
    /*
    obs: no java, vetor de String
    eh inicializado como null
    */ 

    for (int i=0;i<this.elementos.length;i++){
        //encontrar uma posicao nula
        if(this.elementos[i]==null){
            this.elementos[i]=elemento;
            break;
        }
    }
}
```

O método acima funciona para vetores pequenos, mas é muito pouco eficiente para vetores maiores. Então, seria interessante criamos um novo atributo para monitoriar o tamanho real do meu vetor, assim poderemos sempre saber com facilidade onde um elemento deve ser adicionado.

```java
public void adiciona(String elemento) throws Exception{

    if(this.tamanhoReal<this.elementos.length){
        this.elementos[this.tamanhoReal]=elemento;
        this.tamanhoReal++;
    } else{
        throw new Exception("O vetor já está cheio!");
    }
        
}
```

Ao printar o seu vetor, você pode utilizar o método toString(), da classe Array do java. E você pode também fazer alguma manipulação interna nesse método para que o print saia como você quer. Porém, para manipular a saída, o método mais simples e intuitivo, que seria a concatenação de Strings, não é o mais eficiente.

A melhor forma de alterar a força de saída do seu vetor é utilizando a classe StringBuilder, nativa do java.



**Criando o método para verificar se um filme existe**

Grande observação: não usar '==' para comparar String em java. Usar o .equals.

```java
    public int existe(String elemento){
        //busca sequencial
        for(int i=0;i<this.tamanhoReal;i++){
            if(this.elementos[i].equals(elemento)){
                return i;
            }
        }
        return -1;
    }
```

Retornar a posição do elemento ou -1 é mais elegante do que retornar true ou false, segundo professora Loiane.



**Como inserir dados em qualquer posição do vetor?**

Em algum momento podemos precisar inserir um elemento em uma posição específica do vetor, mesmo que ela já esteja ocupada. 

Por exemplo:

Vetor alfabeto = {B ,C ,D ,E ,F ,G ,null ,null ,null }

Queremos inserir o valor A na primeira posição desse vetor, mas sem perder nenhum dos outros valores. 

A ideia é deslocarmos todos os elementos do vetor uma posição para a esquerda, assim liberando o primeiro espaço.

```java
alfabeto[6] = alfabeto[5]; //copio o valor da pos 5 para pos 6
alfabeto[5] = alfabeto[4]; //copio o valor da pos 4 para pos 5
alfabeto[4] = alfabeto[3]; //assim por diante
alfabeto[3] = alfabeto[2];
alfabeto[2] = alfabeto[1];
alfabeto[1] = alfabeto[0];
alfabeto[0] = "A"; //agora sim
```

Mas um código mais bem feito seria assim:

```java
    public void adiciona(String elemento, int posicao){

        if(!(posicao>=0 && posicao<this.tamanhoReal)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        for(int i=this.tamanhoReal;i>posicao;i--){
            this.elementos[i]=this.elementos[i-1];
        }
        this.elementos[posicao]=elemento;
        this.tamanhoReal++;
    }
```

**Como aumentar a capacidade de um vetor?**

```java
    private void aumentaCapacidade(){
        if(this.tamanhoReal==this.elementos.length){
            String[] elementosNovos = new String[this.elementos.length*2];
            for(int i=0;i<this.tamanhoReal;i++){
                elementosNovos[i]=this.elementos[i];
            }
            this.elementos=elementosNovos;
        }
    }
```

O método acima é privado pois ele só é usado internamente pela classe, dentro do método adiciona.

**Como remover o elemento de uma posição?**

```java
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
```

Podemos também combinar esse método com o método busca, que retorna a posição de um elemento específico. Com essa informação, podemos remover um elemento específico, mesmo sem saber a posição dele.


