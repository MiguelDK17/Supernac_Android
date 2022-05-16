<?php
include 'conexão.php';
$codigo=$_GET["codigo"];

$consulta = "SELECT * FROM tb_produtos WHERE codigo ='$codigo'";
$resultado = $con -> query($consulta);
while ($fila = $resultado -> fetch_array()){
        $produto[] = array_map('utf8_encode',$fila);
    }
echo json_encode($produto);
$con -> close();

?>