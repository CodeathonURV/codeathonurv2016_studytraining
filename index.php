<?php session_start() ?>
<html>
	<head>
		<!-- Material Design Lite -->
		<script src="mdl/material.min.js"></script>
		<link rel="stylesheet" href="mdl/material.min.css">
		<link rel="stylesheet" href="css/style.css">
		<title>Study Training</title>
	</head>
	
	<?php 
	$email = "";
	if (isset($_SESSION['email'])) {
		$email = $_SESSION['email'];
	}
	?>
	<body>
			<!-- Capçalera -->
				<header class="mdl-layout__header">
					<div class="mdl-layout__header-row">
	      				
						<a class="mdl-layout-title" href="?action=home"><span class="mdl-layout-title">Study Training</span></a>
						
						<div class="mdl-layout-spacer"></div>

						<div class="lowercase md-button md-ink-ripple">
							<span class="mdl-layout__title-text"><?php echo $email ?></span>
							<?php 

							if (isset($_SESSION['email'])) {
							?>
							<a class="mdl-layout-title salir" href="logout.php"><span class="mdl-layout__title-text">Salir</span></a>
							<?php } ?>
						</div>
					</div>
				</header>

			<div class="row">
				
				<?php include('main.php') ?>
			</div>
	</body>
</html>
