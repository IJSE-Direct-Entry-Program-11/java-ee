<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%
    try {
        Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:postgresql://localhost:15000/dep11_smart_pos",
                "postgres", "postgres");
        ResultSet rst = connection.createStatement().executeQuery("SELECT * FROM customer");
%>
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
                while(rst.next()){
                    String id = rst.getString("id");
                    String name = rst.getString("name");
                    String address = rst.getString("address");
            %>
                    <tr>
                        <td><%= id %></td>
                        <td><%= name %></td>
                        <td><%= address %></td>
                    </tr>
            <%
                }
            %>
        </tbody>
    </table>
</body>
</html>
<%
        connection.close();
    } catch (Exception e){
        throw new RuntimeException(e);
    }
%>