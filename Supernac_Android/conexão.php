<?php
$db_name="supernac";
$mysql_user="root";
$mysql_pass="";
$server_name = "localhost";
$con = mysqli_connect($server_name,$mysql_user,$mysql_pass,$db_name);
if (!$con){
    echo "Erro na conexão".mysqli_connect_error();   
} else /*{
    echo "conexão estabelecida";
}*/
?>