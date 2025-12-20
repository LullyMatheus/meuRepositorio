package recursividade;

import java.util.Scanner;

public class BoundaryFill {

    /* Uma imagem discreta de largura w e altura h, pode ser representada em um computador 
    através de uma matriz I(i, j), de ordem w x h, que armazena em cada posição um número 
    inteiro entre 0 e 255, o qual especifica uma certa cor em uma paleta de cores. Em pacotes 
    de pintura interativos é muito comum a operação que efetua o preenchimento de certa área 
    de uma imagem com uma cor C(anterior) com uma nova cor C. Esta operação pode ser realizada 
    de forma simples através de um método denominado Boundary‐fill. O procedimento em questão 
    recebe como entrada um ponto no interior da região especificado por índices (x,y) e a cor 
    de preenchimento C. O algoritmo inicialmente detecta a cor C(anterior) no ponto (x,y) e 
    começa pintando tal posição com a cor C caso C ≠ C(anterior). O processo é repetido 
    recursivamente para os vizinhos abaixo I(x+1,y), acima I(x‐1,y), à esquerda I(x,y‐1) e à 
    direita I(x,y+1) desde que estejam dentro da imagem e possuam cor igual a C(anterior), isto
    é, igual a cor a ser substituída. Escreva procedimento que implemente tal algoritmo.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int w = 6;

        int h = 6;

        int cor = 0;

        int divisoes = 3;

        int novaCor = 9;

        int[][] matriz = matriz(w, h, cor);

        matriz = colorirMatriz(matriz, divisoes);

        exibirMatriz(matriz);

        System.out.println("Digite um número para localização horizontal");

        int x = sc.nextInt();

        System.out.println("Digite um número para localização vertical");

        int y = sc.nextInt();

        matriz = boundaryFill(matriz, x, y, novaCor, 0);

        exibirMatriz(matriz);

    }

    static int[][] matriz(int w, int h, int cor) {

        int matriz[][] = new int[w][h];

        for (int i = 0; i < w; i++) {

            for (int j = 0; j < h; j++) {

                matriz[i][j] = cor;

            }

        }

        return matriz;

    }

    static int[][] colorirMatriz(int[][] matriz, int divisoes) {

        int aux = 0;

        int cor = 0;

        int divTamanho = ((matriz.length) * (matriz[0].length)) / divisoes;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (aux > divTamanho) {

                    cor = cor + 1;

                    aux = 0;

                }

                matriz[i][j] = cor;

                aux = aux + 1;

            }

        }

        return matriz;

    }

    static void exibirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
                ;

            }

            System.out.println();

        }

    }

    static int[][] boundaryFill(int[][] matriz, int x, int y, int cor, int aux) {

        if (matriz[x][y] == cor) {

            return matriz;

        } else {

            aux = matriz[x][y];

            matriz[x][y] = cor;

            if ((x + 1) < matriz.length) {

                if (matriz[x + 1][y] == aux) {

                    boundaryFill(matriz, x + 1, y, cor, aux);

                }

            }

            if ((x - 1) >= 0) {

                if (matriz[x - 1][y] == aux) {

                    boundaryFill(matriz, x - 1, y, cor, aux);

                }

            }

            if ((y + 1) < matriz[0].length) {

                if (matriz[x][y + 1] == aux) {

                    boundaryFill(matriz, x, y + 1, cor, aux);

                }

            }

            if ((y - 1) >= 0) {

                if (matriz[x][y - 1] == aux) {

                    boundaryFill(matriz, x, y - 1, cor, aux);

                }

            }

            return matriz;

        }

    }

}
