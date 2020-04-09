<%@page import="java.util.List"%>
<%@page import="it.dstech.modelli.Libro"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rimuovi Libro</title>
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
<form action= "rimuovilibro" method= "post">
<select size="4" style= "width: 25%" name="titolo" id="titolo">

<%for (Libro libro:lista){ %>
	
	 <option ><%=libro.getTitolo() %></option>
	 <%} %>
</select>

<button type="submit" name="azione" value="1">Conferma</button>
</form>

</body>
</html>