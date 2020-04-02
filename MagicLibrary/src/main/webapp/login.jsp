<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
body{
background-image: url("https://www.unitedvanlines.com/wp-content/uploads/2019/10/GettyImages-698733848.jpg");
background-size: 1920px 1080px ;
font-family: Arial, Helvetica, sans-serif;
}
input[type=text], input[type=password] {
  width: 50%;
  padding: 12px 20px;
  margin: 05px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
.elementosinistra{
  float: left;
  width: 50%;
  text-align: center;
}
.elementodestra{
  float: right;
  width: 50%;
  text-align: center;
}
button {
  
  border: none;
  color: black;
  padding: 10px 20px;
  text-align: center;
  display: inline-block;
  margin: 4px 2px;
  cursor: pointer;
  border-radius: 10px;
 
  }
  
.pulsanteregistra {
background-color: #9966ff;
  width: 50%;
  margin: 5px 0px;
}
.pulsanteaccedi{
background-color: #b3b3ff;
width: 50%;
  margin: 5px 0px;
}


button:hover {
  opacity: 0.8;
}


.imgcontainer { 
  text-align: center;
  margin: 12px 0 12px 0;
}

img.avatar {
  width: 100%;
  border-radius: 0%;
  animation: shake 5s;
  animation-iteration-count:  infinite;
}
@keyframes shake {
  0% { transform: translate(1px, 1px) rotate(0deg); }
  02% { transform: translate(-1px, -2px) rotate(-1deg); }
  04% { transform: translate(-3px, 0px) rotate(1deg); }
  06% { transform: translate(3px, 2px) rotate(0deg); }
  04% { transform: translate(1px, -1px) rotate(1deg); }
  08% { transform: translate(-1px, 2px) rotate(-1deg); }
  10% { transform: translate(-3px, 1px) rotate(0deg); }
  12% { transform: translate(3px, 1px) rotate(-1deg); }
  14% { transform: translate(-1px, -1px) rotate(1deg); }
  16% { transform: translate(1px, 2px) rotate(0deg); }
  18% { transform: translate(1px, -2px) rotate(-1deg); }
  100%{ transform: translate(1px, -2px) rotate(-1deg); }
}
.clearfix::after {
  content: "";
  clear: both;
  display: table;
}
 
}
</style>
</head>

<body>
<div class= "elementosinistra">
<br>
<br>
<form action="/action_page.php" method="post">
  <div class="imgcontainer">
    <img src="https://imagehost.imageupload.net/2020/04/01/picturetopeople.org-1d85cd3dd2000cc92cab10af1c2392835a0dff802232a616f5.png" alt="Avatar" class="avatar">
  </div>

  <div class="container">
    <label for="uname"><b>Username</b></label>
    <br>
    <input type="text" placeholder="Inserisci l'username" name="uname" required>
<br>
    <label for="psw"><b>Password</b></label>
    <br>
    <input type="password" placeholder="Inserisci la password" name="psw" required>
       <div class="clearfix" style="text-align:center;" >
        <button type="submit" class="pulsanteaccedi">Accedi</button>
        <button type="button"  class="pulsanteregistra">Registati</button>
      </div>
</div>
</form>
</div>
<div class = "elementodestra">
</div>
</body>
</html>