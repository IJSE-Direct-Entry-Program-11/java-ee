<%@ page import="lk.ijse.dep11.web.to.Customer" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SSR App 1</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Ubuntu:wght@300;400;500;700&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
    <link rel="stylesheet" href="css/reset.css">
    <link rel="stylesheet" href="style.css">
    <link rel="stylesheet" href="css/home.css">
</head>
<body>
    <h1>
        <i class="bi bi-person-arms-up"></i>
        Customers
    </h1>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>NAME</th>
                <th>ADDRESS</th>
            </tr>
        </thead>
        <tbody>
            <%
                List<Customer> customerList = (List<Customer>) request.getAttribute("customerList");
                for (Customer customer : customerList) {
            %>
                    <tr>
                        <td><%= customer.getId() %></td>
                        <td><%= customer.getName() %></td>
                        <td><%= customer.getAddress() %></td>
                    </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
