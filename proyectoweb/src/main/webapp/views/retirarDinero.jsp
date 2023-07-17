<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="assets/css/recargarCuenta.css">
    <title>BOLSILLO/RECARGA CUENTA</title>
</head>
<body>
    <button type="button" class="botin">
        <a href="bolsillo?option=index" >Salir</a>
    </button>
    <button type="button" class="botin">
        <a href="bolsillo?option=dashboard" >Atras</a>
    </button>
    
    <div id="KEVI"class="container">
        <h1>RETIRAR DINERO</h1>
       </div>
    <div  class="container2">
       <p>selecciona el metodo de retiro</p>
       <input type="radio" name="metodo">Tarjeta</input>
       <input type="radio" name="metodo">Efectivo</input>
       <input type="radio" name="metodo">Corresponsal</input>
       <input type="radio" name="metodo">Referencia</input>

    
    <div type="container" class="container2">
    <div>ingresa el numero de celular</div>
    <input type="number" class="celular" ></input>
    <div>Ingresa el valor a retirar </div>
    <input type="number" class="recharge"></input>
    <p><button type="button" name="accion" value="retirar"><a href="bolsillo?option=dashboard"></a>Retirar</button></p>
</div>
</form>
</body>
</html>