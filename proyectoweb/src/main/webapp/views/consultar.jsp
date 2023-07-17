<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="es-Es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styleDashboard.css">
    <title>Usuarios Registrados</title>
</head>
<body>  
    <div>
        <header>
            <h1 id="title1">BOLSILLO WEB</h1>
            <h1 id="title2">ELECTRONICO</h1>
        </header> 
    </div>

    <div id="iniciosesion">
        <a href="usuario?accion=abrirForm"><button id="buttoninicio">registrarse</button></a>
        <a href="usuario?accion=inicio"><button id="buttoninicio">inicio</button></a>
    </div>

<table>
        <tr>
            <th>idUsuario</th>
            <th>nombre</th>
            <th>tipoDocumento</th>       
            <th>numDocumento</th>
            <th>numCelular</th>
            <th>correo</th>
            <th>contraseña</th>
            <th>estado</th>
            <th>editar</th>
        </tr>

    <c:forEach var="usuario" items="${usuario}"> 
            <tr>
                <td>${usuario.getIdUsuario()}</td>
                <td>${usuario.getNombre()}</td>
                <td>${usuario.getTipoDocumento()}</td>
                <td>${usuario.getNumDocumento()}</td>
                <td>${usuario.getNumCelular()}</td>
                <td>${usuario.getCorreo()}</td>
                <td>${usuario.getContrasena()}</td>
                <c:if test="${usuario.isEstado() == true}">
                    <td><span class="badge bg-success active">Rol Activo</span></td> 
                </c:if>
                <c:if test="${usuario.isEstado() == false}">
                    <td><span class="badge bg-danger active">Rol Inactivo</span></td> 
                </c:if>
            <td><a href="usuario?accion=editar&id=${usuario.getIdUsuario()}"><button>editar</button></a></td>
            </tr>
    </c:forEach>    
</table>
</body> 