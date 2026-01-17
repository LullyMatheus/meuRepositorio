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
