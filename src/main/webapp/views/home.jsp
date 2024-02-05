<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 04/02/2024
  Time: 22:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>DLM Inicio</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css">
</head>
<body>
<c:import url="navbar.jsp" />
<form class="form" autocomplete="off" style="width: 600px">
    <div class="control">
        <h1>
            Conseguir El Envio
        </h1>
    </div>
    <div class="control block-cube block-input">
        <input name="docDniNif" type="text" placeholder="Codigo de Referencia" />
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

    <button class="btn block-cube block-cube-hover" type="button">
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
            Conseguir El Envio
        </div>
    </button>
    <div class="credits">
        <a href="login" >
            Iniciar Sesion
        </a>
    </div>
</form>
</body>
</html>
