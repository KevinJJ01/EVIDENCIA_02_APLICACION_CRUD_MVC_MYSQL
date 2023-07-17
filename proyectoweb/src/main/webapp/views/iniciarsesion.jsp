<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <title>Iniciar sesion</title>
</head>
<body>
    <button type="button">
        <a href="../index.jsp" >Atras</a>
    </button>

    <div>
        <form action="usuario" method="post" class="header">
            <div class="form-group">
                <label for="numCelular">Numero Celular</label><p>
                <input type="text" name="numCelular" id="numCelular" class="form-control"></p>
            </div>
            <br>
            <div class="form-group">
                <label for="contrasena">contraseña</label><p>
                <input type="password" name="contrasena" id="contrasena" class="form-control"></p>
            </div>
            <br>
            <div>
                <button type="submit" class="btn btn-primary" name="accion" value="iniciosesionl" id="bto">Iniciar Sesion</button>
            </div>
        </form>
    </div>
</body>
</html>