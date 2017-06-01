
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<h1>Вход</h1>
<form action="SignIn" method = "POST">
    <p>
        <input type="text" id = "Login" name ="Login"><label for="Login">Логин</label>
    </p>
    <p>
        <input type="text" id = "Password" name ="Password"><label for="Password">Пароль</label>
    </p>
    <p><input name="Role" type="radio" value="user" checked>Пользователь</p>
    <p><input name="Role" type="radio" value="admin">Администратор</p>
    <input type = "submit"/>
</form>
<a href = "http://localhost:8080/MainServlet">Регистрация</a>
</body>
