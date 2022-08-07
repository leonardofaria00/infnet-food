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
    <h2>Infnet Food</h2>
    <p>Delivery</p>

    <h3>Classe: Gerente</h3>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Attribute</th>
            <th scope="col">Type</th>
            <th scope="col">Description</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>matricula</td>
            <td>Integer</td>
            <td>Matrícula do gerente do restaurante.</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>nome</td>
            <td>String</td>
            <td>Nome do gerente.</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>senha</td>
            <td>String</td>
            <td>Senha admin do gerente.</td>
        </tr>
        </tbody>
    </table>
    <br>
    <hr>

    <h3>Classe: Restaurante</h3>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Attribute</th>
            <th scope="col">Type</th>
            <th scope="col">Description</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>ativo</td>
            <td>Boolean</td>
            <td>Status de situação do restaurante.</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>aberto</td>
            <td>Boolean</td>
            <td>Informa se o restaurante se encontra aberto.</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>taxaFrete</td>
            <td>BigDecimal</td>
            <td>Taxa do frete calculado de acordo com a localização da entrega.</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>dataPedido</td>
            <td>LocalDateTime</td>
            <td>Data de criação do pedido.</td>
        </tr>
        </tbody>
    </table>
    <br>
    <hr>
    <h3>Classe: Petisco</h3>
    <table class="table table-striped table-hover">
        <thead>
        <tr>
            <th scope="col">#</th>
            <th scope="col">Attribute</th>
            <th scope="col">Type</th>
            <th scope="col">Description</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <th scope="row">1</th>
            <td>uuid</td>
            <td>String</td>
            <td>Identificador único do petisco.</td>
        </tr>
        <tr>
            <th scope="row">2</th>
            <td>nome</td>
            <td>String</td>
            <td>Nome do petisco.</td>
        </tr>
        <tr>
            <th scope="row">3</th>
            <td>valor</td>
            <td>BigDecimal</td>
            <td>Valor do petisco.</td>
        </tr>
        <tr>
            <th scope="row">4</th>
            <td>tipoPetisco</td>
            <td>TipoPetisco</td>
            <td>Tipo do petisco de acordo com as opções disponíveis.</td>
        </tr>
        </tbody>
    </table>
    <br>
    <hr>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</body>
</html>