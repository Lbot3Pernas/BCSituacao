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
            <form action="ServletCliente" method="GET">
                <div class="col-xs-6" row>
                    <div class="form-group row ">
                        <label class="control-label ">Setor:</label>
                        <select class="form-control">
                            <option>Selecione o setor onde deseja estar:</option>
                            <option>Branco</option>
                            <option>Verde</option>
                            <option>Amarelo</option>
                            <option>Azul</option>
                        </select>
                    </div>
                    <div class="form-group row">
                        <label class="control-label">Cadeiras: 1 a 500</label>
                        <input class="form-control" placeholder="Ex: 420" name="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label">Fileiras: 1 a 25</label>
                        <input class="form-control" placeholder="Ex: 15 " name="">
                    </div>
                    <div class="form-group row">
                        <label class="control-label ">Dias dos Jogo:</label>
                        <select class="form-control">
                            <option>Selecione o Dia do jogo:</option>
                            <option>Primeiro Dia.</option>
                            <option>Segundo Dia.</option>
                        </select>
                    </div><br><br>
                    <button type="submit" class="btn btn-primary ">Enviar</button>
                    <button type="reset" class="btn btn-danger ">Clear(Limpar)</button>
                </div>
            </form>
        </table>
    </body>
</html>
