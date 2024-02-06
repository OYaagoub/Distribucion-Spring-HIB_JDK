<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 06/02/2024
  Time: 18:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css">
</head>
<body>
<c:import url="includes/navbar.jsp" />
    <fieldset style="width: 70%;margin: 20px 15%">
        <legend>Trayectoria Del Envio [IdReferencia]</legend>

        <table style="width: 100%;border:1px solid white;border-collapse: collapse;margin-top: 20px">

            <tr>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">1 Entrega  :</td>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">
                    Entrada Al centro [Centro local De distrubicion]
                </td>
            </tr>
            <tr>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">2 Entrega  :</td>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">
                    salida Al centro [Centro local De distrubicion]
                </td>
            </tr>
            <tr>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">3 Entrega  :</td>
                <td  style="width: 50%;border:1px solid white;border-collapse: collapse;padding: 10px">
                    Entrada Al centro [Centro local De distrubicion]
                </td>
            </tr>

        </table>
    </fieldset>
</body>
</html>
