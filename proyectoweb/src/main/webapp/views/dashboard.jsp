<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/styleDashboard.css">
    <title>BOLSILLO / GESTIONA TU BOLSILLO</title>
</head>
<body>
    <button type="button" class="botin">
        <a href="bolsillo?accion=inicio" >Salir</a>
    </button>


    <div type="container" class="banner">
    Bienvenido, Gestiona tu cuenta aqui 
    </div>

    <div type="container" class="gestion" id="contenido">
        <ul>
            <button> Editar perfil </button>
            <button> <a href="bolsillo?operacion=recargarCuenta" > Recarga tu cuenta</a></button>
            <button> <a href="bolsillo?option=infoCuenta" > Informacion de la cuenta</a></button>
            <button> <a href="bolsillo?operacion=retirarDinero" >Retirar dinero</a></button>
            <button> Historial de movimientos</button>
            <button> Envia dinero</button>
        </ul>
        <div type="container" class="saldo" id="contenido">
            <div class="circulo"></div>
            <div class="circulo1">Saldo<p>72.000.00</p><p>--------------</p><p>Ahorros</p></div>
            <div class="circulo2"></div>
            <div class="circulo3"></div>
            <div class="circulo4"></div>
        </div>
    </div>

    
    
    

</body>
</html>
<%@include file="footer.jsp" %>