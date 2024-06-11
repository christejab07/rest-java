<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<%--<p>register</p>--%>
<%--${message}<br>--%>
<%--<form action="register" method="post">--%>
<%--    firstname<input type="text" placeholder="firstname" name="firstname"><br>--%>
<%--    lastname<input type="text" placeholder="lastname" name="lastname"><br>--%>
<%--    address<input type="text" placeholder="address" name="address"><br>--%>
<%--    <button type="submit">Submit</button>--%>
<%--</form>--%>
<%--<form action="searchByAddress">--%>
<%--    <h1>Search by Address--%>
<%--    </h1>--%>
<%--    Student address:<input type="text" name="address">--%>
<%--    <button type="submit">Search</button>--%>
<%--</form>--%>
<%--<form action="deleteById">--%>
<%--    <h1>delete by id--%>
<%--    </h1>--%>
<%--    ${message1}<br>--%>
<%--    Student id:<input type="number" name="id">--%>
<%--    <button type="submit">delete</button>--%>
<%--</form>--%>

<form action="searchById">
    <h2>Search by id</h2>
    Student id:<input type="number" name="id">
    <input type="submit">
</form>
</body>
</html>