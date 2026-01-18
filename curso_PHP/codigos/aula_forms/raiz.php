<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css" />
    <title>Raiz</title>
</head>
<body>

    <div id="meuPhp">
        <h2>🤓 Meu código PHP</h2>
        
        <?php 
        
        $numero = $_GET["n"];
        $raiz = sqrt($numero);
        $raizf = number_format($raiz, 2);

        echo "A raiz de $numero é: $raizf";

        
        ?>
        <br><br>
        <a href="calcular.html">Voltar</a>


    </div>
    
</body>
</html>