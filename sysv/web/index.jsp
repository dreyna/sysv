<%-- 
    Document   : index
    Created on : 26/03/2018, 06:32:37 PM
    Author     : alum.fial8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <style type="text/css">
            .prueba{
                max-width: 300px;
                height: 350px;
                padding: 20px;
                border: 1px solid #cccccc;
                border-radius: 5px;
            }
        </style>
    </head>
    <body>
        <div class="container prueba">
            <h1>Sistema de Pedidos</h1>
            <div class="form-group">
                <label>Usuario:</label>
                <input type="text" class="form-control">
            </div>
            <div class="form-group">
                <label>Clave:</label>
                <input type="password" class="form-control">
            </div>
            <div class="form-group">
                <button class="btn btn-primary">Enviar</button>
            </div>
      
        </div>
        
        <div class="container"></div>
            <script src="js/script.js"></script>      
    </body>
</html>
