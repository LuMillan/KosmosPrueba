<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Buscar contacto</title>
    <asset:javascript src="editar.js"/>

</head>
<body>
    <!--action="updateContacto"-->
    <form id="update" action="geetContacto">
        <div id="buscar" ><h1>Ingresa el nombre o id del contacto a editar</h1>
            <br>Nombre sakjdguikdv:<br> <input type="text" name="nombre">
        </div>
        <br><input type="submit" name="buscar" value="buscar"/><!--<input type="button" value="Buscar" onclick="Ocultar()">-->
    </form>

<!--<g:each in="${lista}">
    <p>Profesion: ${it.nombre}</p>
</g:each>

<g:select title="" id="combo" name="combo" class="form-control validate campoFormulario required"  
            from="${lista}" optionKey="id"  value="${nombre}"  noSelection="['':'Elige una Opción']"/>
<g:javascript>
function Mostrar(){
document.getElementById("buscar").style.display="block";
}
function Ocultar(){
document.getElementById("buscar").style.display="none";
}
</g:javascript>-->
</body>
</html>