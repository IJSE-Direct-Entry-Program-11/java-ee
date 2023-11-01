<%@ page import="lk.ijse.dep11.web.to.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Items | SSR App 1</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/items.css">
</head>
<body class="p-3">
    <h1 class="text-center mb-3">
        <i class="bi bi-diagram-3 text-primary"></i>
        Items
    </h1>
    <table class="table table-bordered table-hover">
        <thead>
            <tr>
                <th>CODE</th>
                <th>DESCRIPTION</th>
                <th>QTY.</th>
                <th>PRICE</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${itemList}">
                <tr>
                    <td>${item.code}</td>
                    <td>${item.description}</td>
                    <td>${item.qty}</td>
                    <td>${item.unitPrice}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
