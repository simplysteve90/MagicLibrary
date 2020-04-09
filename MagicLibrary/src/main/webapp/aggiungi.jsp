<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="static/style.css">

</head>
<body>
<form action="aggiungi" method="post">
<label for="titolo"><b>Titolo</b></label><br>
<input type= "text" name= "titolo"><br>
<label for="titolo"><b>Autore</b></label><br>
<input type= "text" name= "autore"><br>
<label for="costo"><b>Costo</b></label><br>
<input type= "number" step="any" name= "costo"><br><br>
<label for="qtavendita"><b>Quantita Da Vendere</b></label><br>
<input type= "number" name= "qtavendita"><br><br>
<label for="titolo"><b>Quantita Da Noleggiare</b></label><br>
<input type= "number" name= "qtanoleggio"><br><br>


<button type= "submit" name="connessione" value= "1"><b>Completa</b></button>


</form>



</body>
</html>