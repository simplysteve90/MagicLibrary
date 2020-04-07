<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="static/style.css">
</head>

<body>
	<div class="elementosinistra">
		<br> <br>
		<form action="login" method="post">
			<div class="imgcontainer">
				<img
					src="https://imagehost.imageupload.net/2020/04/01/picturetopeople.org-1d85cd3dd2000cc92cab10af1c2392835a0dff802232a616f5.png"
					alt="Avatar" class="avatar">
			</div>

			<div class="container">
				<label for="uname"><b>Email</b></label> <br> <input type="text"
					placeholder="Inserisci l'e-mail" name="username"> <br>
				<label for="psw"><b>Password</b></label> <br> <input
					type="password" placeholder="Inserisci la password" name="password">
				<%
					String messaggio = (String) request.getAttribute("messaggio");
				if (messaggio != null) {
				%>
				<p style="color:red;"><b><%=messaggio%></b></p>

				<%
					}
				%>

				<div class="clearfix" style="text-align: center;">
					<button type="submit" value="1" name="connessione"
						class="pulsanteaccedi">Accedi</button>
					<button type="submit" value="2" name="connessione"
						class="pulsanteregistra">Registrati</button>
				</div>
			</div>
		</form>
	</div>
	<div class="elementodestra"></div>
</body>
</html>