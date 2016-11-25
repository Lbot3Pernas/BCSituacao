<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="br.com.estadio.model.Cadeira"%>
<%@page import="br.com.estadio.dao.ControllCadeira"%>
<%@page import="br.com.estadio.model.Fileira"%>
<%@page import="br.com.estadio.dao.ControllFileira"%>
<%@page import="br.com.estadio.model.Setor"%>
<%@page import="br.com.estadio.dao.ControllSetor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exutar a compra</title>
    </head>
    <body>
        <c:import url="cabecalho.jsp"/>
        <jsp:useBean id="daoCadeira" class="br.com.estadio.dao.ControllCadeira" />
        <jsp:useBean id="daoFileira" class="br.com.estadio.dao.ControllFileira" />
        <jsp:useBean id="daoSetor" class="br.com.estadio.dao.ControllSetor" />

        <div class="padding">
            <table class="table table-hover">
                <tr class="tr">
                    <td><h4>ID CLIENTE</h4></td>
                    <td><h4>CADEIRA</h4></td>
                    <td><h4>FILEIRA</h4></td>
                    <td><h4>SETOR</h4></td>
                    <td><h4>DATA CADASTRO</h4></td>
                </tr>
                <c:forEach var="cadeira" var="fileira" var="setor" items="${daoCadeira.lista}" items="${daoFileira.listaF}" items="${daoSetor.listaS}">
                    <tr>
                        <td><h5>${cadeira.numCad}</h5></td>
                        <td><h5><fmt:formatDate pattern="dd/MM/yyyy" value="${cadeira.data}"/></h5></td>
                        <td><h5>${fileira.fileira}</h5></td>
                        <td><h5><fmt:formatDate pattern="dd/MM/yyyy" value="${fileira.data}"/></h5></td>
                        <td><h5>${setor.nomeSetor}</h5></td>
                        <td><h5><fmt:formatDate pattern="dd/MM/yyyy" value="${setor.data}"/></h5></td>
                    </tr>
                </c:forEach>
            </table>
        </div>
        <hr>
    </body>
</html>
