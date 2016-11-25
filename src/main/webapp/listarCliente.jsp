<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="br.com.estadio.model.Cliente"%>
<%@page import="br.com.estadio.dao.ControleDeClientesBVC"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Clientes</title>
    </head>
    <body>
        <c:import url="cabecalho.jsp" />
        <jsp:useBean id="dao" class="br.com.estadio.dao.ControleDeClientesBVC" />
        <div class="padding">
            <table class="table table-hover">
                <tr class="tr">
                    <td><h4>ID:</h4></td>
                    <td><h4>NOME:</h4></td>
                    <td><h4>CPF/RG:</h4></td>
                    <td><h4>SEXO:</h4></td>
                    <td><h4>DATA NASCIMENTO:</h4></td>
                    <td><h4>DIA DO CADASTRO</h4></td>
                </tr>
                <c:forEach var="clientela" items="${dao.lista}">
                    <tr class="font">
                        <td><h5>${clientela.cliId}</h5></td>
                        <td><h5>${clientela.nomeClientela}</h5></td>
                        <td><h5>${clientela.cpfClientela}</h5></td>
                        <td><h5>${clientela.sexoClientela}</h5></td>
                        <td><h5>${clientela.nascimentoClientela}</h5></td>
                        <td><h5><fmt:formatDate pattern="dd/MM/yyyy" value="${clientela.data}"/></h5></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
