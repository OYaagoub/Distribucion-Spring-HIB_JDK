<%--
  Created by IntelliJ IDEA.
  User: oyaag
  Date: 05/02/2024
  Time: 01:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Dashboard</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/css/login.css">
</head>
<body>
<c:import url="includes/navbar.jsp" />
<div style="width: 100%; display: flex;justify-content: space-between">
    <c:import url="includes/data.jsp" />
    <c:import url="includes/newEditShipment.jsp" />
</div>
<div style="width: 100%; display: flex;justify-content: space-between">
    <c:import url="includes/receipts.jsp" />
    <c:import url="includes/shipments.jsp" />
</div>

</body>
</html>
