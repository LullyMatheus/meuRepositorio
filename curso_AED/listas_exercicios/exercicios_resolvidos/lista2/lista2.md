# Lista 2

## Listas, Pilhas, Filas e Listas Encadeadas.

Para os exercícios 27 a 32 implemente o tipo abstrato de dados lista com as seguintes operações:

- Criar lista vazia;

- Inserir no fim; (add)

- Inserir no início; (insert)

- Inserir na i-ésima posição (posição e item são passados por parâmetro);

- Excluir na i-ésima posição;

- Excluir um item pela chave; (remove)

- Localizar/Pesquisar um elemento (search)

⭐**EXERCÍCIO 27**

Implemente uma lista estática (array).

✅ R: O código está na pasta de exercícios resolvidos.

Endereço:

curso_AED\listas_exercicios\exercicios_resolvidos\lista2\src\exercicio27

⭐**EXERCÍCIO 28**

Implemente uma lista simplesmente encadeada estática (array).

✅ R: Primeiramente, é importante entender a diferença entre lista estática com array e lista encadeada estática com array. 

A diferença fundamental está na relação entre a **Posição Física** (onde está na memória) e a **Ordem Lógica** (quem vem depois de quem).

#### **Lista Estática Comum (Sequencial)**

- **Regra:** A ordem física É a ordem lógica.

- **Logica:** O elemento em `i+1` vem sempre depois do elemento `i`.

- **Problema:** Para inserir alguém na posição 0, você tem que deslocar ("shift") todo mundo para a direita.

- **Visual:** `[A, B, C, _, _]`

#### **Lista Encadeada Estática**

- **Regra:** A ordem física **não importa**. A ordem lógica é controlada por um índice "próximo".

- **Lógica:** O elemento tem um campo extra que diz: "O próximo elemento não é o meu vizinho, é aquele cara lá na posição 7".

- **Vantagem:** Para inserir, você joga o dado em qualquer buraco vazio do array e só muda os índices. **Não precisa deslocar ninguém.**

- **Visual:** `[C, A, _, B, _]` (Onde A aponta pra B, B aponta pra C).

O código com a solução desse exercício está na pasta de exercícios resolvidos.

⭐**EXERCÍCIO 29**

Implemente uma lista simplesmente encadeada com tail. Além das operações solicitadas, implementar:

- método para fazer uma cópia da lista;

✅Primeiramente, vamos entender o que é uma lista com Tail:

Imagine que você está numa fila de banco.

- **Lista Comum (Sem Tail):** O gerente sabe quem é o **primeiro** da fila. Se chegar uma nova pessoa, o gerente tem que perguntar para o primeiro: "Quem está atrás de você?", depois perguntar para o segundo, para o terceiro... até achar o último e dizer: "Ei, essa nova pessoa vai ficar atrás de você".
  
  - *Problema:* Quanto maior a fila, mais demora para colocar alguém no final.

- **Lista com Tail (Com Cauda):** O gerente sabe quem é o **primeiro** E também anota num papel quem é o **último** da fila. Se chegar alguém novo, ele vai direto no último e diz: "Essa pessoa fica atrás de você".
  
  - *Vantagem:* É instantâneo, não importa o tamanho da fila.

### O Conceito Técnico

Uma **Lista Simplesmente Encadeada com Tail** é exatamente igual à lista dinâmica padrão que você conhece, com **uma única variável a mais**: um ponteiro `tail` (ou `ultimo`) que aponta sempre para o último nó.

Basicamente é o seguinte:

```java
public class ListaComTail<T> {
    private No<T> head; // O primeiro (início)
    private No<T> tail; // O último (fim)

    public void adicionarNoFim(T valor) {
        No<T> novoNo = new No<T>();
        novoNo.setElemento(valor);

        // Caso 1: A lista está vazia?
        if (head == null) {
            head = novoNo;
            tail = novoNo; // O primeiro também é o último!
        } 
        // Caso 2: Já tem gente na lista
        else {
            tail.setProximo(novoNo); // O antigo último aponta para o novo
            tail = novoNo;         // Atualizamos o crachá de "último"
        }
    }
}
```

OBSERVAÇÃO: como esse tipo de lista só anda para frente, a lista simplesmente encadeada com tail não torna mais fácil o processo de remover do final, já que para isso precisaríamos acessar o penúltimo elemento. 

Use `tail` quando você precisa implementar uma **FILA (Queue)** eficiente, onde a inserção no final acontece toda hora. Sem o `tail`, sua Fila ficaria lenta demais.

------------

OBS: Implemente os exercícios 30, 31 e 32 usando programação genérica.

------------

⭐**EXERCÍCIO 30**

Implemente uma lista simplesmente encadeada com sentinela. Além das operações solicitadas,

implementar:

- método para concatenar (Merge)

- método para ordenar os itens da lista em ordem ascendente.

**EXERCÍCIO 31**

Implemente uma lista duplamente encadeada com sentinelas. Além das operações solicitadas, implementar:

- método para concatenar (Merge)

- método para dividir uma lista em várias

- método para ordenar os itens da lista em ordem ascendente.

**EXERCÍCIO 32**

Implemente uma lista circular duplamente encadeada

**EXERCÍCIO 33**

Considerando listas simplesmente encadeadas (exercício 29), implemente:

a) um método ao receber uma lista por parâmetro, retorne uma lista que é a união sem repetição das duas outras listas.

b) um método ao receber uma lista por parâmetro, retorne uma lista que é a interseção das duas outras listas.

**EXERCÍCIO 34**

Desejamos manipular polinômios do tipo:

$P(x)=a0+a1x+a2 x²+...+an(x^n)$ . 

Tais polinômios podem ser representados por listas duplamente encadeadas onde cada elemento da lista possui dois campos: um para o coeficiente que é um número real, um para o expoente que é um número inteiro. Implemente uma classe que represente um polinômio e que tenha métodos para somar dois polinômios e derivar um polinômio.

**EXERCÍCIO 35**

Construa um procedimento para inverter a ordem de uma lista simplesmente encadeada utilizando apenas duas variáveis auxiliares (não é permitido o uso de listas auxiliares). É possível construir o procedimento utilizando apenas uma variável auxiliar? Se sim, como?

**EXERCÍCIO 36**

Mostre como implementar uma pilha utilizando-se de duas filas.

**EXERCÍCIO 37**

Faça um programa que cadastre em uma pilha vários números. A entrada deles será finalizada com a digitação de um número menor que 0. Posteriormente o programa deve gerar duas filas, a primeira com os números pares e a segunda com os números impares. A saída do programa deve apresentar a pilha digitada e as filas geradas. Caso alguma das filas seja vazia, deve-se mostrar a mensagem.

```java
        Pilha<Integer> pilha = new Pilha<Integer>(10);

        Fila<Integer> filaPar = new Fila<Integer>(5);
        Fila<Integer> filaImpar = new Fila<Integer>(5);

        for(int i=0;i<10;i++){
            pilha.empilha(i);
        }

        for(int i=pilha.getTamanhoReal()-1;i>0;i--){
            if(pilha.busca(i)%2==0){
                filaPar.enfileirar(pilha.busca(i));                
            } else {
                filaImpar.enfileirar(pilha.busca(i));
            }

        }

        System.out.println("Pilha: "+pilha.toString());

        System.out.println("Fila Ímpar: "+filaImpar.toString());

        System.out.println("Fila Par: "+filaPar.toString());

    }
```

**EXERCÍCIO 38**

DEQUE é uma fila de duas pontas, cuja estrutura de dados consiste de uma lista na qual as seguintes operações são permitidas:

a) Push(A) Insere o elemento A no início da deque.

b) Pop() Remove o elemento que está no início da deque.

c) Inject(A) Insere o elemento A no final da deque.

d) Eject() Remove o elemento que está no final da deque.

A fim de implementar as operações acima em tempo constante, qual a melhor opção: lista sequencial, lista simplesmente encadeada ou lista duplamente encadeada? A partir de sua decisão, crie uma classe que represente a estrutura de dados e as operações acima.

**EXERCÍCIO 39**

Duas pilhas podem ser implementadas em um único array A da seguinte forma: A primeira pilha cresce a partir do início do array para direita e a segunda cresce a partir do final do array para a esquerda, ou seja, as pilhas crescem uma em direção a outra. Escreva os seguintes procedimentos:

a) Push(A,i), onde A é o novo elemento a ser inserido na pilha i = 1,2.

b) Pop(i) que retorna o elemento que está no topo da pilha i = 1,2.

**EXERCÍCIO 40**

Utilizando a implementação de listas através de arranjos (Lista sequencial), implemente um procedimento para inserir um item em uma determinada posição da lista.

**EXERCÍCIO 41**

Implemente um procedimento RemovePar que, dada uma lista autorreferenciadas remove todos elementos cuja chave é par.

**EXERCÍCIO 42**

Implemente um procedimento FuraFila que, dada uma fila implementada com apontadores insere um elemento na primeira posição da fila.

**EXERCÍCIO 43**

Utilizando as operações de manipulação de pilhas vistas em sala, uma pilha auxiliar e uma variável do tipo TipoItem, escreva um procedimento que remove um item com chave c de uma posição qualquer de uma pilha. Note que você não tem acesso à estrutura interna da pilha (topo, item, etc), apenas às operações de manipulação.

**EXERCÍCIO 44**

Agora escreva uma função para trocar os elementos m e n de uma lista duplamente encadeada (m e n podem ser chaves ou mesmo ponteiros para os elementos).
