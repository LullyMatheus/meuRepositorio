# PHP POO

Curso de PHP POO do Curso em Vídeo

POO serve para aproximar a programação do mundo real.

## Tipos de programação

- Programação de baixo nível;

- Programação linear;

- Programação estruturada;

- Programação modular;

- Programação Orientada a Objetos.

## Quem criou a POO?

Alan Kay, matemático e biólogo. Surgiu por volta de 1970.

Ele criou uma linguagem de programação própria para aplicar seus conceitos, a linguagem SmallTalk.

Programar com Orientação a Objetos é para ser mais simples!

Vantagens da POO:

- Confiável;

- Oportuno;

- Manutenível;

- Extensível;

- Reutilizável;

- Natural.

Para lembrar: COMERNada :)

## Instalação de Recursos

Irei utilizar o WAMP + VSCode (E netbeans, às vezes)

## O que é um objeto?

Coia material ou abstrata que pode ser percebido pelos sentido e descrito por suas características, comportamentos e estado atual.

Uma classe é um "molde" para criar objetos.

Raciocinio para pensar em classes: o que eu tenho (atributo), coisas que eu faço (método), como eu estou agora (estado).

Todos os objetos tem atributos, métodos e estados.

O processo de gerar um objeto de uma classe chama-se <u>instanciar</u>.

Abstração: focar somente nos atributos importantes de um objeto.

## Criando Classes em PHP

Criar documentos separados para cada classe (boa pratica);

O nome do arquivo da classe deve iniciar com maiúsculas.

```php
<?php

class Caneta{
    var $modelo;
    var $cor;
    var $ponta;
    var $carga;
    var $tampada;

    function rabiscar(){
        echo "<p>Estou rabiscando...</p>";    
    }

    function tampada(){
        this.tampada = true;
    }

}
```

Agora, importando essa classe para o nosso index.html

```php
<?php
    require_once "Caneta.php";
    $c1 = new Caneta;
    $c1 -> cor = "Azul";
    $c1 -> ponta = 0.5;
    $c1 -> tampada = true;

    //mostrar info do objeto
    print_r($c1);
?>
```

## Visibilidade

Falando um pouco sobre UML.

Conceitos: diagrama de classes.

Representar uma classe com algumas informações;

Nome da classe | Atributos | Métodos

## Modificadores de Visibilidade

Eles indicam o nível de acesso aos componentes internos de uma classe (atributos e métodos)

Na UML, a visibilidade de cada atributo e método é representada pelos símbolos +, - e #.

(+)  Público;

(-) Privado;

(#) Protegido

Modo público: qualquer um pode usar.

Modo privado: somente o dono pode usar (somente a classe)

Modo protegido: uma classe e seus filhos podem usar

Para aplicar isso no PHP, vamos substituir o termo "var" pelo devido modificador.

```php
class Caneta {
    public $modelo;
    public $cor;
    private $ponta;
    protected $carga;

    public function rabiscar() {
    //...
    }

    private function tampar() {
    //..
    }

    private function destampar() {
    //...
    }

}
```

Atenção: se você tentar altarar um atributo privado fora da classe, o PHP não da erro, mas o código não irá executar.

## Métodos Especiais

Métodos que existem em todas as linguagens.

Métodos Acessores (Getter e Setter). São métodos que são acesso a determinada informação da classe ou objeto. 

São importantes para a segurança do seu programa.

### Sintaxe do PHP

```php
<?php
class Cliente{
    public $nome;

    public function getNome(){
        return $this->nome;
    }

    public function setNome($m){
        $this->nome = $m;
    }

    public function __construct(){
    //o construtor pode ter esse nome
    //ou pode ter o mesmo nome da classe
    //como public function Cliente()
        $this->nome = "Cliente";    
    }
}   

require_once Cliente.php;

$c = new Cliente();
$c.setNome("JonJon");

echo "O cliente {$c->getNome()} é meu amigo";
?>
```
