<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/css/styleIniSesNequi.css">
    <title>BOLSILLO / NEQUI</title>
</head>
<body>
    <button type="button" class="botin">
        <a href="bolsillo?option=index" >Salir</a>
    </button>
    <button type="button" class="botin">
        <a href="bolsillo?option=dashboard" >Atras</a>
    </button>
    
    <div id="KEVI"class="container">
        <h1>INICIAR SESION</h1>
       </div>



    <div id="sesion" class="container2" class="header">
    <h2>Por favor llena los espacios</h2>
    <div>
        <div>Ingresa tu numero de telefono</div>
        <input type="number" class="celular" ></input>
    </div>
    <div>
        <div>Ingresa la contrasena</div>
        <input type="password" class="password"></input>
    </div>
    <button class="botin"><a href="dashboard.jsp" target="_blank">Iniciar sesion</a></button>

    </div>

    <div id="Banner" class="container2">
        <h1>Nequi</h1>
        <img src="img/iconNequi.png" width="100px" height="100px" >
        </div>


</body>
</html>