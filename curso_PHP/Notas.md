# Meu primeiro curso de PHP

O PHP é uma linguagem que surgiu para ser usada junto com o HTML. Então, vamos usar dessa forma.

**PHP**: *Personal Home Page Tools*

O PHP surgiu utilizando vários comandos da linguagem Pearl. Até hoje essa influência ainda é perceptível.

O PHP mudou de nome após o surgimento, e passou a ser:

**PHP**: *Personal Home Page Forms Interpreter*

Porque ele passou a ter a função de receber comentários de usuários por meio de formulários.

Após algum tempo de desenvolvimento, o PHP tornou-se, e é até hoje, uma tecnologia de código aberto. 

Foi com a contribuição da comunidade que o PHP passou a ser uma linguagem de programação de verdade. Quando isso ocorreu, ela mudou de nome novamente:

**PHP**: PHP Hypertext Preprocessor

## Como funciona o PHP?

O PHP trás novas funcionalidades ao HTML. Essa linguagem completa o conjunto HTML, CSS e JS, trazendo funcionalidades adicionais.

PHP são programas dentro do HTML. Eles são interpretados por uma máquina chamada Apache.

PHP é uma tecnologia Server Side (do lado do servidor).

Programas a serem utilizados: EasyPHP ou Wamp Server.

```php
<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Primeiro Projeto PHP</title>
</head>
<body>
    <h1>Testando PHP</h1>

    <?php 

    echo "<strong>Olá <br> Mundo!<strong>";    

    ?>

</body>
</html>
```

## Como usar variáveis em PHP?

Como vimos, o comando `echo` serve para escrever na tela (print). Caso queira escrever e pular uma linha, como no println, use a tag `<br>` do html.

### Mas agora, variáveis:

Para criar uma variável "idade" e atribuir o valor 3, basta fazer:

```php
$idade = 3;
```

Toda variável em PHP vai começar com um sifrão.

Todos os nomes de variaveis começam com letra minúscula, já que PHP é case sensitive.

Para criar uma variavel "salário" com valor 1825.54:

```php
$sal = 1825.54;
```

Para criar a variável "nome" recebendo Matheus:

```php
$nome = "Matheus";
```

Para criar a variável "casado" recebendo falso:

```php
$casado = false;
```

No PHP não existe declaração de variáveis (int, float, String etc). Mas ele é compatível com os mesmos tipos primitivos de qualquer linguagem:

- Inteiro;

- Real;

- Caractere;

- Lógico.

Mas existe uma coisa chamada coerção, quando você forma uma variável a ser de determinado tipo. 

```php
$cpf = (string) 11122233344;
```

### Como fazer concatenação em PHP:

```php
$nome = "Ana";
$idade = 18;
echo $nome. "tem". $idade. "anos";
```

Repare que cada elemento é separado do outro por um ponto.

Também é possível fazer assim:

```php
$nome = "Ana";
$idade = 18;
echo "$nome tem $idade anos!";
```

Atenção: as aspas precisam ser duplas para que o php faça a interpretação de variáveis.

### Operações em PHP

```php
$n1 = 2;
$n2 = 3;
$s = $n1 + $n2;
echo "A soma vale $s";
```

Operadores suportados pelo PHP:

- Adição `$r = $n1 + $n2`;

- Subtração `$r = $n1 - $n2`;

- Multiplicação `$r = $n1 * $n2`;

- Divisão `$r = $n1 / $n2`;

- Módulo `$r = $n1 % $n2`.

```php
$n1=3;
$n2=2;
echo "A soma vale ". ($n1+$n2);
```

### Como utilizar valores fornecidos pelo usuário?

Primeiro passo: analisar sua URL.

Por exemplo: 

`http://localhost/aula05/operadores.php`

Você pode passar valores personalizados diretamente pela URL. Por exemplo:

`http://localhost/aula05/operadores.php?a=3&b=2`

Repare no final "?a=3&b=2"

Estamos atribuindo o valor 3 à variável a, e o valor 2 à variável b.

Segundo passo: pegar esses valores no código.

```php
$n1 = $_GET["a"];
$n2 = $_GET["b"];
```

A variável $n1 está pegando o valor de a;

A variável $n2 está pegando o valor de b;

```php
$c=1;
$c=$c+1;
$c+=1;
$c++;
```

### Como fazer comentários?

```php
//comentário inline
#comentário inline

/*
Comentário de várias linhas
*/
```

### Variáveis de Referência

```php
$a = 3;
$b = &$a; 
#aqui, b eh uma referencia de a
#ou seja, se eu mudar b, a muda tbm
```

### Variáveis de Variáveis

```php
$nome = "matheus";
$$nome = "mechetti";
/*
essa segunda linha cria uma variavel cujo
nome sera o conteudo da primeira variavel
Teremos $matheus = "mechetti";
*/
```

### Operador Unário

Usar a seguinte sintaxe:

`expressao ? verdadeiro : falso;`

Exemplo:

```php
$maior = $a > $b ? $a : $b;
$situacao = $nota >= 60 ? "aprovado" : "reprovado";
```

### Operadores Lógicos

`AND`: and ou &&

`OR`: or ou ||

`XOR`: xor

`NOT`: !

## Integração PHP e HTML

Vamos revisar um pouco de forms em HTML.

Formulários em HTML começam com a tag `<form>` e terminam com `</form>`.

Dentro da tag `<form>` podemos inserir mais algumas informações importantes, como `method` e `action`.

`<form method="get" action="dados.php">`

O method poderia ser get ou post. O get envia os dados pela URL e o post envia por pacotes.

O get é um pouco mais rápido e menos seguro. O método post é um pouco mais lento e mais seguro.

Da forma como a linha acima foi escrita, o form irá enviar os dados para o arquivo dados.php.

```html
<form method="get" action="dados.php">
    <input type="text" name="v"/>
    <input type="submit" value="Calcular"/>
</form>
```

O submit do html vai enviar os dados para o endereço definido em action. 

```php
<?php
/*
Aqui vai o codigo php que recebce
as informacoes do html acima
*/
$valor= $_GET["v"];
//aqui voce pode fazer o que quiser
//com esse valor
$valor= $_POST["v"];
?>
```

O seguinte código evita erros nos casos em que você não informou valores pela URL:

```php
<?php
    $nome= isset($_GET["nome"])?$_GET["nome"]:"[não definido]";
    //isset significa "esta definido" ou algo assim
?>
```

### Como usar PHP para alterar o CSS?

Uma forma de fazer isso é colocando os comandos GET do PHP no head do arquivo, antes da tag style.

```php
<head>
    <?php
    $tam = isset($_GET["tam"])?$_GET["tam"]:12px;
    ?>
    <style>
        span.texto{
            font.size: <?php echo $tam: ?>;
        }
    </style>
</head>
```

### Condicionais em PHP

```php
if($a > $b) {
    $maior = $a;
}
else {
    $maior = $b;
}

if($idade>=18){
    $vota=true;
    $dirige=true;
}
else{
    $vota=false;
    $dirige=false;
}
```

No PHP, também existe a estrutura `elseif`, para facilitar a criação de uma estrutura condicional dentro da outra.
