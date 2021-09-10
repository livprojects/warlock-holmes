<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/warlock-holmes/assets/style.css">

<title>L'armoire des pièces à conviction</title>
</head>

<body>

	<header>
		<h1>Warlock Holmes</h1>

		<h2>L'armoire des pièces à conviction</h2>
	</header>

	<main>
		<div class="clues-left-nav">
			<%@include file="adminnav.jsp"%>
		</div>


		<div class="clues-main-closet">
			<p>Ici, tu peux farfouiller parmi les gourdins, les potions, les
				pièces à conviction, les armes... Bref, les indices !</p>
			<div class="clues-list">
				<!-- Pour chaque item de la list clues, générer : -->
				<div class="clues-list-item">
					<img alt="Description de l'indice" src="" />
					<p>Cette part de pizza verte a été trouvée chez Jojo le Nain
						mardi soir.</p>
				</div>
			</div>
		</div>


		<div class="clues-right-nav">
			<%@include file="narrativenav.jsp"%>
		</div>
	</main>

</body>

</html>