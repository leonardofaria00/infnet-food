<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
    <title>Institute Infnet</title>
</head>
<body>
<div class="container mt-5">
    <c:import url="../menu.jsp"></c:import>
    <h2>Infnet Food</h2>
    <p>Delivery</p>

    <h3>Classe: Gerente</h3>
    <a href="${pageContext.request.contextPath}/food/v1/manager/signup" type="submit" class="btn btn-success">Novo</a>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Matrícula</th>
            <th scope="col">Nome</th>
            <th scope="col">Senha</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="g" items="${listagem}">
            <tr>
                <td>${g.id}</td>
                <td>${g.matricula}</td>
                <td>${g.nome}</td>
                <td>${g.senha}</td>
                <td><a href="/food/v1/manager/${g.id}/delete">Excluir</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
</body>
</html>