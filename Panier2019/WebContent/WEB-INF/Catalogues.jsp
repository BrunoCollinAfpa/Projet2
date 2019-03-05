<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Elastic World</title>
	</head>
	<body>
	
		<%@page import="model.User" %>
		
		<p>Bonjour <%= ((User)request.getSession().getAttribute("user")).getNom() %> </p>
	
	
    
		<%@page import="service.BlocFiltre" %>
		<%@page import="service.LigneFiltre" %>
		<%@page import="java.util.List" %>
		
		
		<%
		
		List<BlocFiltre> lBF = (List<BlocFiltre>) request.getSession().getAttribute("tabfiltres");
		
		if (lBF == null ) System.out.println("pas d attribut tabfiltres");
		for (BlocFiltre blocEnCours :  lBF) {
		
			%>		
			<p> <%=blocEnCours.getNomBF() %> </p>
			<%
				// Affichage des lignes de CB
				for (LigneFiltre lfEnCours : blocEnCours.getLignesFiltre()) {
					%>
					<input type="checkbox" <%= lfEnCours.getEtatHTML() %>> <%= lfEnCours.getLibelle() %></input><br>
					<%
				}%>
			<br><br>
			<% 
		}
		
		
		// pour chaque bloc de filtre
		
		
		 %>
				
		
	</body>
</html>