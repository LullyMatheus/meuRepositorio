# Questões de Provas Anteriores

## Prova 1

1. Encontre a função de complexidade do algoritmo abaixo em relação ao número de comparações
   
   ```java
   public void xSort(int[] v){
       int aux;
       int n = v.length;
       for(int j=n-1;j>0;j--){
           for(i=0;i<j;i++){
               if(v[i+1]<v[i]){
                   aux=v[i+1];
                   v[i+1]=v[i];
                   v[i]=aux;
               }
           }
       }
   }
   ```

✅R: Essa vai ser resolvida por meio de uma soma de PA. Conte o número de vezes que a função passa pelo IF.



## Prova 2

1) ⭐Qual é a principal diferença na alocação de memória entre um Array (lista estática) e uma lista encadeada? Quais são as implicações disso para o desempenho?
   
   ✅R: Em um array, uma determinada quantidade de memória é pré alocada, enquanto em uma lista encadeada, a memória é alocada à medida que os elementos são adicionados. As consequências disso para o desempenho são: em uma lista com Array, o custo para acessar qualquer elemento é constante, porém operações como aumentar o tamanho do array ou inserir um elemento no início são mais custosas. Em uma lista encadeada, o processo de acessar um valor específico é mais custoso, mas adicionar elementos em qualquer posição é, em média, mais simples, já que não requer um "shift" em todos os elementos como poderia ser o caso em um vetor.
2. ⭐Supondo que você esteja desenvolvendo um navegador de internet e precisa armazernar o histórico de navegação web para permitir que o usuário clique em "voltar" e "avançar". Isso poderia ser resolvido com uma única estrutura linear Pilha? Explique.
   
   ✅R: Idealmente, esse problema poderia ser resolvido com duas pilhas. O histórico de navegação do usuário ficará armazenado em uma única pilha. No momento em que ele apertar em "voltar" a página atual será armazenada em uma outra pilha, que ficará acessível caso o usuário queira avançar.


