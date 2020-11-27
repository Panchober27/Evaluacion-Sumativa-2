<%-- 
    Document   : buscarProducto
    Created on : 26-11-2020, 15:42:03
    Author     : francisco
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <c:import url="partials/head.jsp"/>
        <link href="public/css/main.css" rel="stylesheet" type="text/css"/>
        <title>Buscar</title>
    </head>
    <body>
        <c:import url="partials/nav.jsp"/>
        <h2 style="text-align: center">Busqueda de Productos</h2>

        <br/>

        <p style="text-align: center">
            mostrar formulario de busqueda para buscar un producto por el codigo.
        </p>


        <div class="row">
            <div class="col-sm-4 offset-md-4">
                <div class="card-body">
                    <form action="buscar.do" method="get">
                        <div class="form-group">
                            <input class="form-control" type="number" name="txtCodigoProducto" placeholder="Codigo Producto">
                        </div>
                        <div class="form-group">
                            <button name="btnBuscar" class="btn btn-primary" type="submit">
                                Buscar
                            </button>
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        <div class="col-sm-4 offset-md-4">
            <div class="card-body">
                <tr>
                    <td>${requestScope.Producto}</td>
                </tr>
            </div>
        </div>
        
            


    </body>
</html>
