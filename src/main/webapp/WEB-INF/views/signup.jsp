<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<main> 

<!-- Nav bar -->
		<div class="home-admin-nav">
			<%@include file="adminnav.jsp"%>
		</div>
		<div class="home-narr-nav">
			<%@include file="narrativenav.jsp"%>
		</div>

<form method="POST">


		<h1>Inscription au bureau des détectives </h1>
		<p>Merci de remplir le formulaire suivant pour vous inscrire et commencer à enquêter</p>

		
		<div class="form-body">
			<div class="form-group firstname">
				<label for="firstname">Prenom : </label> <input type="text"
					class="form-control" name="firstname" value="${user.prenom}"
					id="firstname" />
			</div>
			<div class="form-group familyname">
				<label for="familyname">Nom de famille : </label> <input type="text"
					class="form-control" name="lastname" value="${user.nom}"
					id="familyname" />
			</div>
			<div class="form-group"></div>

			<div class="form-group userpseudonym">
				<label for="userpseudonym">Pseudonyme :<span
					class="text-danger">*</span></label> <input type="text"
					class="form-control" name="pseudo" value="${user.pseudo}"
					id="userpseudonym" />
			</div>
			<div class="form-group email">
				<label for="email">E-mail :<span class="text-danger">*</span></label>
				<input type="email" class="form-control" name="mail" id="email"
					value="${user.email}" />
			</div>

			<div class="form-group password">
				<label for="password">Mot de passe :<span
					class="text-danger">*</span></label> <input type="password"
					class="form-control" name="password" id="password"
					value="${user.password}" />
			</div>

			<div class="form-submit">
				<button type="reset" class="btn btn-annuler">Annuler</button>
				<button type="submit" class="btn btn-envoyer">S'inscrire</button>
			</div>
		</div>
	</form>

</main>
</body>
<!-- Footer contact et CopyRight -->
	<footer class="contact-copyright"> Mentions légales Warlock Holmes </footer>
</html>