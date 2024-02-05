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
<c:import url="navbar.jsp" />
<form class="form" autocomplete="off" style="width: 90%">
    <div class="control">
        <h1>
            Register
        </h1>
    </div>
    <div class="control">
        <h4>
            Datos Principales
        </h4>
    </div>
    <div style="display: flex;justify-content: space-between">
        <div class="control block-cube block-input" style="width: 24%">
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
        <div class="control block-cube block-input" style="width: 24%">
            <input name="email" type="email" placeholder="Email" />
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
        <div class="control block-cube block-input" style="width: 24%">
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
        <div class="control block-cube block-input" style="width: 24%">
            <input name="name" type="text" placeholder="Nombre Completo" />
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
    </div>
    <br>
    <hr>
    <br>
    <div class="control">
        <h4>
            Datos Secundarios
        </h4>
    </div>
    <div style="display: flex;justify-content: space-around">
        <c:import url="includes/countries.jsp" />


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
            Register
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
