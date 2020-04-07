<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registrati</title>
</head>
<body>
<form action="registrazione" method="post">
	<label for="username"><b>Username</b></label>
	<br>
	<input type="text" placeholder="Inserisci l'e-mail" name="username">
	<br>
	<label for="password"><b>Password</b></label>
	<br>
	<input type="password" placeholder="Inserisci la password" name="password">
	<br>
	<label for="ruolo"><b>Ruolo</b></label>
	<br>
	<input type="radio" id="dipendente" name="ruolo" value="dipendente">
	<label for ="dipendente">Dipendente</label>
	<br>
	<input type="radio" id="cliente" name="ruolo" value="cliente">
	<label for ="cliente">Cliente</label>
	<br>
	<label for="fondo"><b>Credito</b></label>
	<br>
	<input type="number" placeholder="Inserisci credito iniziale"name="fondo">
	<br>
	<button type="submit" name="azione" value="1">Registrati</button>
</form>
</body>
</html>