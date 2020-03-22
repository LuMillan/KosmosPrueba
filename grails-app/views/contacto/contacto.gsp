<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="layout" content="application.gsp" />
        <title></title>
    </head>
    <body>
        <form action="save">
            <p>
            <h1>Ingresa tus datos de contacto:</h1>
            <br>Nombre: <input type="text" name="nombre">
            <br>Número telefonico:<input type="text" name="numTelefonico">
            <br>Correo electronico:<input type="text" name="correo">
            <!--<br>Empresa:<input type="text" name="empresa">-->
            <br><select name="empresa">
               
                <option value="1">Kosmos</option>

                <option value="2">Telmex</option>

                <option value="3">polos</option>

            </select>
            <br><input type="submit" value="enviar">
            </p>
        </form>
    </body>
</html>
