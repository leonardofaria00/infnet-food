<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <title>Institute Infnet</title>
</head>
<body>
<div class="container mt-5">
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <div class="container-fluid">
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/food/v1/manager/">Gerente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/food/v1/restaurant/">Restaurante</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/food/v1/lunch/">Almoço</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/food/v1/dine/">Janta</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="/food/v1/snack/">Petisco</a>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <br>
    <h2>Infnet Food</h2>
    <p>Delivery</p>

    <h3>Classe: Restaurante</h3>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Ativo</th>
            <th scope="col">Aberto</th>
            <th scope="col">Taxa Frete</th>
            <th scope="col">Gerente ID</th>
            <th scope="col">Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="restaurante" items="${listagem}">
            <tr>
                <th scope="row">${restaurante.uuid}</th>
                <td>${restaurante.ativo}</td>
                <td>${restaurante.aberto}</td>
                <td>${restaurante.taxaFrete}</td>
                <td>${restaurante.gerente.matricula}</td>
                <td><a href="/food/v1/restaurant/${restaurante.uuid}/delete">Excluir</a></td>
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