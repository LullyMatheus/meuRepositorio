# Lista 1

## Recursividade e Complexidade

⭐**EXERCÍCIO 18**

O custo de utilização de um algoritmo pode ser medido de várias maneiras. Descreva as principais técnicas, apontando suas eventuais vantagens e desvantagens.

✅R: É possível medir o tempo de execução de um programa, e comparar com outros, para saber o quão eficiente ele é. Porém, esse não é o melhor método, já que o tempo de execução de um mesmo programa pode variar de um computador para outro.

Uma maneira melhor de encontrar o custo de utilização é com o cálculo de complexidade. Esse cálculo não está preocupado em saber o tempo exato que um programa leva para ser executado. Ele está mais preocupado em saber o quanto o tempo de execução cresce em função do tamanho da entrada. Por exemplo: se o tamanho da entrada de um programa dobrar, qual será o impacto disso no tempo de execução? O tempo irá dobrar? Quadruplicar? Permanecer constante?

Com essa resposta, é possível ter uma noção geral de como aquele programa performa em qualquer máquina. Apesar de que também é possível citar uma desvantagem do cálculo de complexidade: ele ignora constantes.

Outra informação importante: a complexidade também pode ser avaliada do ponto de vista de custo de memória. 



⭐**EXERCÍCIO 19**

O que significa dizer que uma função g(n) é O(f(n))?

✅R: Dizer que g(n) é O(f(n)) significa que a função f(n) domina assintoticamente a função g(n). Ou seja, f(n) atua como um **Limite Superior** (Upper Bound) para o crescimento de g(n). Isso significa que, para determinado ponto m, existe um valor c tal que g(n)<c*f(n).



⭐**EXERCÍCIO 20**

Indique se as afirmativas abaixo são verdadeiras ou falsas e justifique a sua resposta utilizando a definição de dominação assintótica em cada caso.

a) 2^2n = O(3^n)

✅Para isso ser verdade, deve existir uma constante c tal que c*(3^n) é sempre maior que 2^(2n). Porém, tal constante não existe. Pode-se concluir isso porque a taxa de crescimento de 2^(2n) é muito maior do que 3^n. Então, por meio de uma análise assintótica (quando o n tende a valores grandes) não há constante que faça 3^n ser sempre maior.

PROVA MATEMÁTICA: 2^(2n)=(2^2)^n=4^n

E 4^n é sempre maior que 3^n



b) 2^(n+1) = O(3^n)

c) f(n) = O(u(n)) e g(n) = O(v(n)) ⇒ f (n) + g(n) = O(u(n) + v(n))

d) f(n) = O(u(n)) e g(n) = O(v(n)) ⇒ f (n) − g(n) = O(u(n) − v(n))



**EXERCÍCIO 21**

Prove que f(n) = 1^2 + 2^2 + … + n^2 é igual a n^3/3 + O(n^2).



**EXERCÍCIO 22**

Apresente um algoritmo para obter o maior e o segundo maior elemento de um conjunto. Apresente também uma análise do algoritmo. Você acha o seu algoritmo eficiente? Por quê? Procure comprovar suas respostas.



EXERCÍCIO 23

Implemente em Linguagem Java os três algoritmos apresentados nos Programas 1.3, 1.4 e 2.8 do livro texto, para obter o máximo e o mínimo de um conjunto contendo n elementos. Execute os algoritmos para valores suficientemente grandes de n, gerando casos de teste para o melhor caso, pior caso e caso esperado. Meça o tempo de execução para cada algoritmo dos três casos acima. Comente os resultados obtidos.


