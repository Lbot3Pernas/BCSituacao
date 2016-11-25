<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Executar a compra</title>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        <table class="table-responsive">
            <form action="ServletCliente" method="GET" class="comprar">
                <div class="col-xs-6">
                    <div class="form-group row ">
                        <label class="control-label"> Digite seu nome:</label>
                        <input class="form-control" placeholder="Ex: Joao" name="nomeClientela">
                    </div>
                    <div class="form-group row ">
                        <label class="control-label ">Informe seu CPF ou RG:</label>
                        <input class="form-control" placeholder="Ex: 338.697.60-08" name="cpfClientela">
                    </div>
                    <div class="form-group row ">
                        <label class="control-label ">Sexo:</label>
                        <select class="form-control" name="sexoClientela">
                            <option>Selecione seu Sexo</option>
                            <option>Masculino</option>
                            <option>Femenino</option>
                            <option>Não descobri</option>
                        </select>
                    </div>
                    <div class="row">
                        <div>
                            <label for="start">Data de Nascimento:</label><br>
                            <input type="date" class="date" name="nascimentoClientela">
                        </div>
                    </div><br><br>
                    <button type="submit" class="btn btn-primary ">Enviar</button>
                    <button type="reset" class="btn btn-danger ">Limpar</button>
                </div>
            </form>
        </table>
    </body>
</html>
