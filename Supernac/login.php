<?php
require "conexão.php";
$usuario = "Miguel";
$senha = "1234";
$sql_query = "select nome from tb_pessoas where usuario like '$usuario' and senha like '$senha';";
$result = mysqli_query($con,$sql_query);
if (mysqli_num_rows($result) > 0){
    $linha = mysqli_fetch_assoc($result);
    $nome = $linha["nome"];
    echo "<h3>Olá,bem vindo ".$nome." :)","<?h3>";  
}
else {
    echo "<h3>Hmm,acho que algo deu errado :(";
}
?>