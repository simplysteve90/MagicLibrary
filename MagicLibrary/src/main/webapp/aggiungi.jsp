<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="aggiungi" method="post">
<label for="titolo">Titolo</label>
<input type= "text" name= "titolo">
<label for="titolo">Autore</label>
<input type= "text" name= "autore">
<label for="costo">Costo</label>
<input type= "number" name= "costo">
<label for="qtavendita">Quantita Da Vendere</label>
<input type= "number" name= "qtavendita">
<label for="titolo">Quantita Da Noleggiare </label>
<input type= "number" name= "qtanoleggio">
<button type= "submit" name="connessione" value= "1">Completa</button>


</form>



</body>
</html>