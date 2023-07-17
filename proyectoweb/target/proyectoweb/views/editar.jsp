<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es-Es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../assets/css/styleIniSesDavi.css">
    <title>Editar</title>
</head>


    <div>
        <header>
            <h1 >BOLSILLO </h1>
            <h1 >ELECTRONICO</h1>
        </header> 
    </div>

    <div id="iniciosesion">
        <a href="usuario?accion=consultar"><button id="buttoninicio">volver</button></a>
        <a href="usuario?accion=inicio"><button id="buttoninicio">inicio</button></a>
    </div>


<form action="usuario" method="post">
    <c:forEach var="usuario" items="${usuario}">

    <div class="form-group">
        <label for="nombre">nombre</label>
        <input type="text" name="nombre" id="nombre" class="form-control" value="${usuario.getNombre()}">
    </div>
    <br>
    <div class="form-group">
        <label for="tipoDocumento">Tipo Documento</label>
        <input type="text" name="tipoDocumento" id="tipoDocumento" class="form-control" value="${usuario.getTipoDocumento()}">
    </div>
    <br>
    <div class="form-group">
        <label for="numDocumento">Numero Documento</label>
        <input type="number" name="numDocumento" id="numDocumento" class="form-control" value="${usuario.getNumDocumento()}">
    </div>
    <br>
    <div class="form-group">
        <label for="numCelular">numCelular</label>
        <input type="number" name="numCelular" id="numCelular" class="form-control" value="${usuario.getNumCelular()}">
    </div>
    <br>
    <div class="form-group">
        <label for="correo">correo</label>
        <input type="text" name="correo" id="correo" class="form-control" value="${usuario.getCorreo()}">
    </div>
    <br>
    <div class="form-group">
        <label for="contrasena">contraseña</label>
        <input type="password" name="contrasena" id="contrasena" class="form-control" value="${usuario.getContrasena()}">
    </div>
    <br>
    <div>
        <button type="submit" class="btn btn-primary" name="accion" value="editarUsuario" id="bto">Guardar</button>
    </div>
</c:forEach>  
</form>
</body> 

<%@include file="footer.jsp" %>