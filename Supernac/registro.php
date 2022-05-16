<?php
require "conexão.php";
//$nome = "Miguel";
//$usuario = "Miguel";
//$senha = "123";
$sql_query = "insert into tb_pessoas values ('$nome','$usuario','$senha');";
if (mysqli_query($con,$sql_query)){
    echo "Dados inseridos com sucesso :)";
}else{
    echo "Hmm, algo deu errado :(".mysqli_error($con);
}
?>