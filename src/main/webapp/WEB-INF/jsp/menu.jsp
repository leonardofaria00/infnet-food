<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page"
                       href="${pageContext.request.contextPath}/">Home</a>
                </li>

                <c:if test="${not empty user}">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/order/">Pedido</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/user/">Usuário</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/manager/">Gerente</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/restaurant/">Restaurante</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/launch/">Almoço</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/dinner/">Janta</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page"
                           href="${pageContext.request.contextPath}/food/v1/snack/">Petisco</a>
                    </li>
                </c:if>
            </ul>
        </div>

        <ul class="nav navbar-nav navbar-right">
            <c:if test="${empty user}">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page"
                       href="${pageContext.request.contextPath}/food/v1/user/signup">
                        <i class="bi bi-person-fill"></i> Sign Up</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" aria-current="page"
                       href="${pageContext.request.contextPath}/food/v1/authentication">
                        <i class="bi bi-box-arrow-in-right"></i> Login</a>
                </li>
            </c:if>
            <c:if test="${not empty user}">
                <li class="nav-item">
                    <a class="nav-link" aria-current="page"
                       href="${pageContext.request.contextPath}/food/v1/authentication/logout">
                        <i class="bi bi-box-arrow-left"></i> Logout, ${user.nome}</a>
                </li>
            </c:if>
        </ul>
    </div>
</nav>
<br>