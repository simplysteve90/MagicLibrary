<%@page import="it.dstech.modelli.Libro"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modifica Libro</title>
<link rel="stylesheet" type="text/css" href="static/style.css">

</head>

<body>
<table style="width:50%">

  <tr>
    <th><h3>Titolo</h3></th>
    <th><h3>Autore</h3></th> 
    <th><h3>Costo</h3></th> 
    <th><h3>Quantita' Vendita</h3></th>
     <th><h3>Quantita' Noleggio</h3></th>
 </tr>
<%List<Libro> lista= (List<Libro>)request.getAttribute("lista");
%>
<% for(Libro libro:lista){
%>


 <tr>
    <td><b><%=libro.getTitolo()%></b></td>
    <td><b><%=libro.getAutore() %></b></td>
    <td><b><%=libro.getCosto()%></b></td>
     <td><b><%=libro.getQtavendita()%></b></td>
    <td><b><%=libro.getQtanoleggio()%></b></td>
 </tr>


<%	
}
%>

 </table>

	
	<form action="modifica" method="post">
	<br>
	<label for="libro" ><b>Scegli il Libro</b></label>
	<br><br>
	<select size="4" style= "width: 25%" name="titolo" id="titolo">
	
	<%for (Libro libro:lista){ %>
	
	 <option ><%=libro.getTitolo() %></option>
	 <%} %>
	</select>
	<br><br>
	<label for="nuovoTitolo"><b>Cambia Titolo</b></label>
	<br>
	<input type= "text" name="nuovoTitolo" style="width:50%">
	<br>
	<label for="autore"><b>Cambia Autore</b></label>
	<br>
	<input type= "text" name="autore" >
	<br>
	<label for="costo"><b>Cambia Costo</b></label>
	<br>
	<input type= "text" name="costo" >
	<br>
	<label for="qtavendita"><b>Cambia Quantita' Disponibile Per La Vendita</b></label>
	<br>
	<input type= "text" name="qtavendita" >
	<br>
	<label for="qtavendita"><b>Cambia Quantita' Disponibile Per Il Noleggio</b></label>
	<br>
	<input type= "text" name="qtanoleggio" >
	<br>
	<button type="submit" name="connessione" value="1"><b>Aggiorna Dati</b></button>
	
	





	</form>
	<form action="menudipendente.jsp">
	<button type="submit" name="connessione" value="2"><b>Torna Indietro</b></button>
	</form>
</body>
</html>