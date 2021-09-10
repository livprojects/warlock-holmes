<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/warlock-holmes/assets/style.css">
<title>Warlock Holmes : Un Cluedo revisité super fun !</title>

</head>
<body>

	<header>
	<h1> Warlock Holmes</h1>
	</header>
	<main> 

		<!-- Nav bar -->
		<div class="clues-left-nav">
			<%@include file="adminnav.jsp"%>
		</div>
		
		
		<div class=admin-nav> 
		</div>

		<!-- Centre de la page : Bienvenue et tuto -->
		<section class="eb-container">
			<h2>Warlock Holmes : Un Cluedo revisité super fun !</h2>
			
			

			<p class="welcome">Lorem ipsum dolor sit amet consectetur
				adipisicing elit. Perspiciatis non voluptatum laborum totam
				doloribus? Quam odio provident magnam veritatis numquam, quibusdam
				earum excepturi dolore voluptate! Quibusdam nisi fugit quo est.
				Lorem ipsum ad minim ven. Lorem ipsum dolor sit amet. Lorem ipsum
				dolor sit amet consectetur adipisicing elit. Perspiciatis non
				voluptatum laborum totam doloribus? Quam odio provident magnam
				veritatis numquam, quibusdam earum excepturi dolore voluptate!
				Quibusdam nisi fugit quo est. Lorem ipsum ad minim ven. Lorem ipsum
				dolor sit amet.</p>

			<p class="welcome">Lorem ipsum dolor sit amet consectetur
				adipisicing elit. Perspiciatis non voluptatum laborum totam
				doloribus? Quam odio provident magnam veritatis numquam, quibusdam
				earum excepturi dolore voluptate! Quibusdam nisi fugit quo est.
				Lorem ipsum ad minim ven. Lorem ipsum dolor sit amet. Lorem ipsum
				dolor sit amet consectetur adipisicing elit. Perspiciatis non
				voluptatum laborum totam doloribus? Quam odio provident magnam
				veritatis numquam, quibusdam earum excepturi dolore voluptate!
				Quibusdam nisi fugit quo est. Lorem ipsum ad minim ven. Lorem ipsum
				dolor sit amet.</p>

			<h3>Débutez votre enquête avec Warlock Holmes !</h3>
			
			<button onclick="/signup">Je m'inscris !</button>
			
			<h3> Vous êtes déjà détective chez nous ? Connectez-vous !</h3>
			
			<button onclick="/login">Je m'identifie !</button>

		
		</section>
		
		

	<div class="clues-right-nav">
			<%@include file="narrativenav.jsp"%>
		</div>
	</main>

	<!-- Footer contact et CopyRight -->
	<footer class="contact-copyright"> Mentions légales Warlock Holmes </footer>


</body>
</html>