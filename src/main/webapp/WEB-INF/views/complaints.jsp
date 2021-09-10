<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

 <%@ page import="fr.formation.models.Plainte"%>
<%@ page import="java.util.List"%>

<%
 List <Plainte> complaints = (List <Plainte>)request.getAttribute("complaints");
%> 

<!DOCTYPE html>
<html lang="fr">

<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/warlock-holmes/assets/style.css">
<link rel="stylesheet" href="/warlock-holmes/assets/complaints.css">

<title>Le bureau des plaintes</title>
</head>

<body>

	<header>
		<h1>Warlock Holmes</h1>

		<h2>Le bureau des plaintes</h2>
	</header>

	<main>
		<div class="clues-left-nav">
			<%@include file="adminnav.jsp"%>
		</div>


		<div class="clues-main-closet">
		<p>Tu es ici au point de départ de l'enquête. Sur ce tableau, tu trouveras toutes les affaires que nous avons enregistrées et qui n'ont pas encore été résolues à ce jour.</p>
  		<% for (Plainte plainte : complaints) {
			%>
			
			<div class="plainte">
				<p>Nom du ou de la plaignante : <%= plainte.getPlaignant() %></p>
				<p>Procès verbal : <%= plainte.getProcesVerbal() %></p>		
				<img src="<%= plainte.getUrlIllustration() %>"/>
			</div>
			<% 	} %>	 
		</div>


		<div class="clues-right-nav">
			<%@include file="narrativenav.jsp"%>
		</div>
	</main>

</body>

</html>