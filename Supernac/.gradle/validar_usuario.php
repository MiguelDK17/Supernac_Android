<?php
include 'conexão.php';
$usuario=$_POST["usuario"];
$senha=$_POST["senha"];
//$usuario="Miguel";
//$senha="123";
$sql = "SELECT * FROM tb_pessoas WHERE usuario=? AND senha=?";
$sentença=$con->prepare($sql);
$sentença -> bind_param('ss',$usuario,$senha);
$sentença -> execute();
//$sentença->store_result();
$resultado = $sentença -> get_result();

if ($fila = $resultado ->fetch_assoc()) {
    echo json_encode ($fila,JSON_UNESCAPED_UNICODE);
}   


$sentença->close();
$con->close();

?>