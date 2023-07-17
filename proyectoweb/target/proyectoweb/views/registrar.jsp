<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="assets/css/styleIniSesNequi.css">
        <title>BOLSILLO WEB ELECTRONICO</title>
    </head>
    
<body>

    <div id="iniciosesion">
        <a href="usuario?accion=inicio"><button id="buttoninicio">volver</button></a>
        <a href="usuario?accion=consultar"><button id="buttoninicio">consultar</button></a>
    </div>

    <p></p>
    <div>
        <header>
            <h1>BOLSILLO WEB</h1>
            <h1>ELECTRONICO</h1>
        </header> 
    </div>
<p></p>

<div id="formulario">
    <form action="usuario" method="post" class="header">
        <div class="form-group">
            <label for="nombre">nombre</label><p>
            <input type="text" name="nombre" id="nombre" class="form-control"></p>
        </div>
        <br>
        <div class="form-group">
            <label for="tipoDocumento">Tipo Documento</label><p>
            <input type="text" name="tipoDocumento" id="tipoDocumento" class="form-control"></p>
        </div>
        <br>
        <div class="form-group">
            <label for="numDocumento">Numero Documento</label><p>
            <input type="text" name="numDocumento" id="numDocumento" class="form-control"></p>
        </div>
        <br>
        <div class="form-group">
            <label for="numCelular">numCelular</label><p>
            <input type="text" name="numCelular" id="numCelular" class="form-control"></p>
        </div>
        <br>
        <div class="form-group">
            <label for="correo">correo</label><p>
            <input type="text" name="correo" id="correo" class="form-control"></p>
        </div>
        <br>
        <div class="form-group">
            <label for="contrasena">contraseña</label><p>
            <input type="password" name="contrasena" id="contrasena" class="form-control"></p>
        </div>
        <br>
        <div>
            <button type="submit" class="btn btn-primary" name="accion" value="registrarUsuario" id="bto">Guardar</button>
        </div>
    </form>
</div>

</body>

