<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<div>
    <h1>List of Students</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Address</th>
            <th>Email</th>
        </tr>
        <c:forEach var="student" items="${students}">
            <tr>
                <td>${student.id}</td>
                <td>${student.name}</td>
                <td>${student.address}</td>
                <td>${student.email}</td>
            </tr>
        </c:forEach>
    </table>
</div>
<div>
    <h1>Register New Student</h1>
    <form action="/students/register" method="post">
        <label for="name">Name:</label>
        <input type="text" id="name" name="name"><br>
        <label for="address">Address:</label>
        <input type="text" id="address" name="address"><br>
        <label for="email">Email:</label>
        <input type="text" id="email" name="email"><br>
        <button type="submit">Register</button>
    </form>
</div>
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

<%--<form action="searchById">--%>
<%--    <h2>Search by id</h2>--%>
<%--    Student id:<input type="number" name="id">--%>
<%--    <input type="submit">--%>
<%--</form>--%>
</body>
</html>