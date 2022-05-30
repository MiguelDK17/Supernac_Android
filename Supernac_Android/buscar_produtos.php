<?php
include 'conexão.php';
$id=$_GET["5"];

$consulta = "SELECT * FROM tb_produtos WHERE id = '$id' ";
$resultado = $con -> query($consulta);
while ($fila = $resultado -> fetch_array()){
        $produto[] = array_map('utf8_encode',$fila);
    }
echo json_encode($produto);
$con -> close();

?>