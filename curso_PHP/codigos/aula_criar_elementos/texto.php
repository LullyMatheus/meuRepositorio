<!DOCTYPE html>
<html lang="pt-br">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css" />
    <title>Tipos</title>
</head>

<body>

    <div id="meuPhp">
        <h2>🤓 Meu código PHP</h2>

        <?php

        $n = $_GET["n"];


        if ($n <= 0) {
            echo "Você digitou um número menor ou igual a zero. Aí não da!<br>";
        } else {
            while ($n > 0) {
                echo "<form>
                    <label>Campo $n:</label>
                    <input type='number' name='n' placeholder='digite uma número aqui' />
                </form><br>";
                $n--;
            }
        }

        ?>

        <a href="index.html">Voltar</a>

    </div>

</body>

</html>