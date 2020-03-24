<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar contacto</title>
    </head>
    <body>
        <form action="updateContacto">
        <g:each in="${nombre}">
            <p><input type="hidden" name="id" value="${it.id}"/></p>
            <p><input type="text" name="nombre" value="${it.nombre}"/></p>
            <p><input type="text" name="correo" value="${it.correo}"/></p>
            <p><input type="text" name="telefono" value="${it.numTelefonico}"/></p>
             <p><input type="text" name="empresa" value="${it.empresa.nombreEmpresa}"/></p>
            </g:each>
            <input type="submit" name="editar" value="Editar"/>
        </form>
    </body>
</html>
