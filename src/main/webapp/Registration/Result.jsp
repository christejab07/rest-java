<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
    <a href="/">first page...</a>
    <h2>Student Details to update</h2>
    <p>ID: ${student.id}</p>
    <p>firstname: ${student.firstname}</p>
    <p>lastname: ${student.lastname}</p>
    <p>address: ${student.address}</p>
    <a href="updateStudent?id=${student.id}">Update Student</a>
</body>
</html>