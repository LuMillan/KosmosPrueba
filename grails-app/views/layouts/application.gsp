<!--
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
-->

<%@ page contentType="text/html;charset=UTF-8" %>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><g:layoutTitle default="Santander Millán"/></title>
        <!--<meta name="viewport" content="width=device-width, initial-scale=1.0">-->
        <link rel="puerquito icon" href="${assetPath(src: 'pig.ico')}" type="image/x-icon"><!--icono puerquito-->
        <link rel="logoSantander.millan" href="${assetPath(src: 'logobanco.png')}">
    <asset:stylesheet src="estilos.css"/>

    <g:layoutHead/>


</head>
<body>
    <div id="millanLogo" role="banner"><asset:image src="logobanco.png" alt="Santander.Millán"/></div>

    <div id="bar">
        <ul>
            <a href="${createLink(controller:'contacto',action:'index')}">
                <li>
                    <g:img dir="images" file="add-button.png" width="50" height="50"/>
                </li>
            </a>

            <a href="${createLink(controller:'contacto',action:'buscarContacto')}">
                <li>    
                    <g:img dir="images" file="user.png" width="50" height="50"/>
                </li>
            </a>

            <a href="${createLink(controller:'contacto',action:'eliminarContacto')}">
                <li>     
                    <g:img dir="images" file="delete.png" width="50" height="50"/>
                </li>    
            </a>

            <a href="${createLink(controller:'contacto',action:'index')}">
                <li> 
                    <g:img dir="images" file="settings.png" width="50" height="50"/>
                </li>    
            </a>

        </ul>
    </div>
    <div id="content">
        <g:layoutBody/></div>

    <div id="spinner" class="spinner" style="display:none;"><g:message code="spinner.alt" default="Loading&hellip;"/></div>

</body>
</html>
