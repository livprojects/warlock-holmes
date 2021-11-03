<template>
	<div id="navbaradmin">
		<div class="heading">
			<h4> Navigation administrative </h4>
		</div>
		<nav>
			<ul class="nav-ul">
				<li>
					<router-link to="/">Mes parties</router-link>
				</li>
				<li>
					<router-link to="/">Mon compte</router-link>
				</li>
				<li>
					<router-link to="/">Déconnexion</router-link>
				</li>
				<li>
					<router-link to="/">Connexion</router-link>
				</li>
				<li>
					<router-link to="/">Inscription</router-link>
				</li>
			</ul>
		</nav>
	</div>
</template>

<script>
	export default {
		name: 'NavBarAdmin'
	}
</script>

<style>
	@import '../assets/css/navadmin.css';
</style>