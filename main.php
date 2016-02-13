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
<nav class="sidenav">
	<?php include('sidenav.php'); ?>
</nav>
<?php } ?>


<!-- Contingut -->
<section class="contingut">
	<?php include("$action.php"); ?>
</section>