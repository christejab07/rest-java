<!DOCTYPE html>
<html>
<head>
    <title>Update Student</title>
</head>
<body>
<h2>Update Student Details</h2>
<form action="updateStudent" method="post">
    <input type="hidden" name="id" value="${student.id}" />
    <p>firstname: <input type="text" name="firstname" value="${student.firstname}" /></p>
    <p>lastname: <input type="text" name="lastname" value="${student.lastname}" /></p>
    <p>address: <input type="text" name="address" value="${student.address}" /></p>
    <input type="submit" value="Update" />
</form>
</body>
</html>
