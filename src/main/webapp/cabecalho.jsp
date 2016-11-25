<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
        <link href="css/bootstrap.css" rel="stylesheet">
        <title>Cabeçalho</title>
    </head>
    <body>
        <nav class="navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand" href="">M4K1T4 ☠</a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="ahome.jsp" class="glyphicon glyphicon-home"> Início</a></li>
                    <li><a href="cadastraCliente.jsp" class="glyphicon glyphicon-user"> Cliente</a></li>
                    <li><a href="cadastraIngresso.jsp" class="glyphicon glyphicon-credit-card"> Ingresso</a></li>
                </ul>
                <li class="listar">
                    Listar
                </li>
            </div>
            <a href="#menu" id="toggle"><span></span></a>
            <div id="menu">
                <ul>
                    <li><a href="listarCliente.jsp">Clientes</a></li>
                    <li><a href="listaIngresso.jsp">Ingressos</a></li>
                    <li><a href="listaLugar.jsp">Lugares</a></li>
                </ul>
            </div>
            <script src="js/index.js"></script>
        </nav>
    </body>
</html>
