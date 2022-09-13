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
    <h2>Cadastramento de Gerente</h2>
    <p>Dashboard</p>

    <form action="${pageContext.request.contextPath}/food/v1/manager" method="post">
        <div class="mb-3 mt-3">
            <label for="name" class="form-label">Name:</label>
            <input type="text" class="form-control" id="name" placeholder="Enter name" name="nome" autofocus>
        </div>
        <div class="mb-3 mt-3">
            <label for="matricula" class="form-label">Matricula:</label>
            <input type="number" class="form-control" id="matricula" placeholder="Enter registry" name="matricula">
        </div>
        <div class="mb-3">
            <label for="pwd" class="form-label">Password:</label>
            <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="senha">
        </div>
        <div class="mb-3">
            <label for="pwd2" class="form-label">Password:</label>
            <input type="password" class="form-control" id="pwd2" placeholder="Confirm password" name="senha2">
        </div>
        <div class="form-check mb-3">
            <label class="form-check-label">
                <input class="form-check-input" type="checkbox" name="remember"> Remember me
            </label>
        </div>
        <button type="submit" class="btn btn-primary">Cadastrar</button>
        <button type="reset" class="btn btn-default">Reset</button>
    </form>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
        crossorigin="anonymous"></script>
</body>
</html>