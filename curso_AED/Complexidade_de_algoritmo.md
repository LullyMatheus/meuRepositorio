# Complexidade de Algoritmo

**3 Passos para calcular a complexidade:**

1. Levar em consideração apenas as repetições do código;

2. Verificar a comlpexidade das funções/ métodos próprios da linguagem (se utilizado);

3. Ignorar as constantes e utilizar o tempo de maior grau.

## Análise Assintótica

**Big O, Omega e Theta**

A análise assintótica vai nos mostrar como o tempo de execução cresce à medida que a entrada aumenta. Não exatamente o tempo do relógio, é uma medida geral de tempo de execução.

A análise assintótica será basicamente a forma do gráfico t=f(n).

**Ignorar as constantes**

Nós ignoramos as constantes porque elas não influenciam no formato do gráfico, apenas na posição dele.

OBS: O(n²) é melhor que O(NLogN) para valores pequenos. Mas no longo prazo o O(NLogN) é melhor.

**Considerar apenas o termo de maior grau**

Termos de menor grau tem impacto no gráfico apenas para valores pequenos. No longo prazo, eles quase desaparecem.

As ideias acima são válidas para as três notações, O, Theta e Ômega.

### A notação Big O me da um limite superior para a função.

Basicamanete, existe um m e existe um c, tais que: para valores de N maiores que m, existe uma função c*g(n) que é sempre maior que f(N). Ou seja, é um limite superior.

Ex: mostre que 5*N+3=O(N)

$5*N+3=O(N)$

$5*N+3<=c*N$

$3<=(c-5)*N$

Existe um valor que c=8 (por exemplo) que torna a inequação verdadeira!

### A notação Ômega me da um limite inferior

Existem valores m e c tais que, a partir de um valor m para N, existe c*g(N) que é sempre <u>menor</u> que f(N)

### A notação Theta junta as duas anteriores

$0<=c1*g(N)<=f(N)<=c2g(N)$

Existe c1 *  g(N) que é sempre menor que f(N) e existe também c2 * g(N) que é sempre maior que f(N).


