<%-- 
    Document   : vender
    Created on : 26-11-2020, 1:11:15
    Author     : franc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="partials/head.jsp"/>
        <link href="public/css/main.css" rel="stylesheet" type="text/css"/>
        <title>Vender JSP</title>
    </head>
    <body>
        
        <c:import url="partials/nav.jsp"/>
        
        <h2 style="text-align: center">Vender JSP</h2>
        
        <p style="text-align: start">
            Vender, este JSP se encarga de mostrar todos los productos, muy similar a ver productos, con la diferencia
            que se habilita un botón para vender el producto seleccionado.
            La idea es  que al pinchar en el botón pueda ser re dirigido a otro JSP en donde se pueda mostrar el detalle
            y poder confirmar la venta, como se especifica en el punto 3.
        </p>
        
    </body>
</html>
