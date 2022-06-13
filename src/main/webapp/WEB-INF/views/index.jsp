<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Máy Tính Cá Nhân</h1>
<form action="/result">
    <h1><input type="text" name="first">
        <input type="text" name="second"></h1>
    <h1>
        <input type="submit" name="operator" value="+">
        <input type="submit" name="operator" value="-">
        <input type="submit" name="operator" value="*">
        <input type="submit" name="operator" value="/"></h1>
</form>
<h1>Kết Quả : ${result}</h1>
</body>
</html>