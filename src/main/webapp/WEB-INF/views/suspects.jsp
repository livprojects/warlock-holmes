<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/warlock-holmes/assets/style.css">
<title>Les suspects</title>
</head>
<body>
	<header> 
	<h1> Les suspects </h1>
	</header>
	<main>
	
	<!-- Nav bar -->
		<div class="clues-left-nav">
			<%@include file="adminnav.jsp"%>
		</div>
		
	
	<p> Voici les suspects identifiés ! </p>
	<p> N'hésitez pas à les interroger afin de trouver le coupable </p>
	
	<section class="suspect-container"> 
	
		<div class="suspect-profile">
			<h3> John Duff </h3>
			<img src="/warlock-holmes/src/main/webapp/assets/suspect.png" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		<div class="suspect-profile">
			<h3> Don Moissa </h3>
			<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodepen.io%2FNo359%2Fpen%2FjpNYJo&psig=AOvVaw3WARmFkKOpZtx3OD7haoee&ust=1631362695268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOCQmeGx9PICFQAAAAAdAAAAABAZ" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		<div class="suspect-profile">
			<h3> Ondine Caen </h3>
			<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodepen.io%2FNo359%2Fpen%2FjpNYJo&psig=AOvVaw3WARmFkKOpZtx3OD7haoee&ust=1631362695268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOCQmeGx9PICFQAAAAAdAAAAABAZ" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		<div class="suspect-profile">
			<h3> Samira Byain </h3>
			<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodepen.io%2FNo359%2Fpen%2FjpNYJo&psig=AOvVaw3WARmFkKOpZtx3OD7haoee&ust=1631362695268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOCQmeGx9PICFQAAAAAdAAAAABAZ" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		<div class="suspect-profile">
			<h3> Sam Minerve </h3>
			<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodepen.io%2FNo359%2Fpen%2FjpNYJo&psig=AOvVaw3WARmFkKOpZtx3OD7haoee&ust=1631362695268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOCQmeGx9PICFQAAAAAdAAAAABAZ" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		<div class="suspect-profile">
			<h3> Jade Hisse </h3>
			<img src="https://www.google.com/url?sa=i&url=https%3A%2F%2Fcodepen.io%2FNo359%2Fpen%2FjpNYJo&psig=AOvVaw3WARmFkKOpZtx3OD7haoee&ust=1631362695268000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCOCQmeGx9PICFQAAAAAdAAAAABAZ" alt="Profile suspect" />
			<button class="button"> Interroger </button>
		</div>
		
		</section>
		
		<div class="clues-right-nav">
			<%@include file="narrativenav.jsp"%>
		</div>
		</main>

</body>

<!-- Footer contact et CopyRight -->
	<footer class="contact-copyright"> Mentions légales Warlock Holmes </footer>
</html>