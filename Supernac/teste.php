<?php
include 'conexão.php'
    function get_result( $stmt ) {
    $arrResult = array();
    $stmt->store_result();
    for ( $i = 0; $i < $stmt->num_rows; $i++ ) {
        $metadata = $stmt->result_metadata();
        $arrParams = array();
        while ( $field = $metadata->fetch_field() ) {
            $arrParams[] = &$arrResult[ $i ][ $field->name ];
        }
        call_user_func_array( array( $stmt, 'bind_result' ), $arrParams );
        $stmt->fetch();
    }
    return $arrResult;
}

$usuario=$_POST['usuario'];
$senha=$_POST['senha'];

//$usuario="Miguel";
//$senha="123";

$sentencia=$conexion->prepare("SELECT * FROM tb_usuario WHERE usuario=? AND senha=?");
$sentencia->bind_param('ss',$usuario,$senha);
$sentencia->execute();

$resultado = $sentencia->get_result();
if ($fila = $resultado->fetch_assoc()) {
         echo json_encode($fila,JSON_UNESCAPED_UNICODE);     
}
$sentencia->close();
$conexion->close();
?>