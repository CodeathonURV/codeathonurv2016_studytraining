<?php
if (!empty($_GET['action'])) {
	$action = $_GET['action']; 
    $action = basename($action); 
}else{
	$action = "home";
}

if (!isset($_SESSION['usuari'])) {
	$action = "login";
}else{

?>		
<!-- Menu esquerra -->
<div class="sidenav">
	<?php include('sidenav.php'); ?>
</div>
<?php } ?>


<!-- Contingut -->
<div class="contingut">
	<?php include("$action.php"); ?>
</div>