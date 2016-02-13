
<div class="mdl-layout mdl-js-layout mdl-color--grey-100 login">
	<main class="mdl-layout__content">
		<div class="mdl-card mdl-shadow--6dp">
			<div class="mdl-card__title mdl-color--primary mdl-color-text--white">
				<h2 class="mdl-card__title-text">StudyTraining</h2>
			</div>
				<form action="comprLogin.php" method="post">
					<div class="mdl-card__supporting-text">
							<div class="mdl-textfield mdl-js-textfield">
								<input class="mdl-textfield__input" type="text" id="username" name="username" />
								<label class="mdl-textfield__label" for="username">Usuario</label>
							</div>
							<div class="mdl-textfield mdl-js-textfield">
								<input class="mdl-textfield__input" type="password" id="userpass" name="userpass" />
								<label class="mdl-textfield__label" for="userpass">Contraseña</label>
							</div>
					</div>
					<div class="mdl-card__actions mdl-card--border">
						<input  id = "login" class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect" type="submit" name="submit" value="Login">
					</div>
				</form>
		</div>
	</main>
</div>