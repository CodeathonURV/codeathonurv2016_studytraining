
<?php
session_start();

if (isset($_POST['username'])&&isset($_POST['userpass']))
    @comprova($_POST["username"],$_POST["userpass"]);
    
function comprova($usuari, $pwd) {
        if($usuari == "jordi" && $pwd=="jordi"){
            $_SESSION['usuari'] = $usuari;
            $_SESSION['email'] = "jordi.merino@estudiants.urv.cat";
            $_SESSION['grado']="informatica";
        }else if($usuari == "pepe" && $pwd=="pepe") {
            $_SESSION['usuari'] = $usuari;
            $_SESSION['email'] = "pepe@estudiants.urv.cat";
            $_SESSION['grado']="telematica";
        }
        header("location:index.php");
}

?>