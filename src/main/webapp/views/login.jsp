<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 05/02/2024
  Time: 01:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>login</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css">

</head>
<body>
<c:import url="includes/navbar.jsp" />
<form class="form" autocomplete="off">
    <div class="control">
        <h1>
            Iniciar Sesion
        </h1>
    </div>
    <div class="control block-cube block-input">
        <input name="docDniNif" type="text" placeholder="NIE / DNI / NIF" />
        <div class="bg-top">
            <div class="bg-inner"></div>
        </div>
        <div class="bg-right">
            <div class="bg-inner"></div>
        </div>
        <div class="bg">
            <div class="bg-inner"></div>
        </div>
    </div>
    <div class="control block-cube block-input">
        <input name="password" type="password" placeholder="Contraseña" />
        <div class="bg-top">
            <div class="bg-inner"></div>
        </div>
        <div class="bg-right">
            <div class="bg-inner"></div>
        </div>
        <div class="bg">
            <div class="bg-inner"></div>
        </div>
    </div>
    <button class="btn block-cube block-cube-hover" type="submit">
        <div class="bg-top">
            <div class="bg-inner"></div>
        </div>
        <div class="bg-right">
            <div class="bg-inner"></div>
        </div>
        <div class="bg">
            <div class="bg-inner"></div>
        </div>

        <div class="text">
            Iniciar Sesion
        </div>
    </button>
    <div class="credits">
        <a href="register" >
            Register
        </a>
    </div>
</form>

</body>
</html>
