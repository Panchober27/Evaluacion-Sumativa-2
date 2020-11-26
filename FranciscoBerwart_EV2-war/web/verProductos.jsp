<%-- 
    Document   : verProductos
    Created on : 26-11-2020, 4:01:17
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
        <title>Listado Productos</title>
    </head>
    <body>
        <c:import url="partials/nav.jsp"/>

        <h2 style="text-align: center">Listado de Productos</h2>

        <p style="text-align: center">
            Interfaz que muestra una lista de los Productos.
        </p>
        <hr/>

        <!-- Colocar tabla con resultados de la busqueda de la lista! -->
        
        <table class="table table-bordered"  action="listar.do" method="get">
            <thead>
                <tr>
                    <th>Codigo</th>
                    <th>Nombre</th>
                    <th>Precio</th>
                    <th>Stock</th>
                    <th>Categoria</th>
                </tr>
            </thead>
            <tbody>
                
            </tbody>
        </table>

    </body>
</html>
