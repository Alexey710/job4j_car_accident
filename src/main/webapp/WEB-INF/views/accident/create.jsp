<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accident save</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.4.1.min.js" ></script>
</head>
<body>
<form  action="<c:url value='/save'/>" method='POST'>
    <table>
        <tr>
            <td>&nbsp;&nbsp;ID:</td><br>
            <td><input type='text' name='id'></td><br>
            <td>&nbsp;&nbsp;Название:</td><br>
            <td><input type='text' name='name'></td><br>
            <td>&nbsp;&nbsp;Описание:</td><br>
            <td><input type='text' name='text'></td><br>
            <td>&nbsp;&nbsp;Адрес:</td><br>
            <td><input type='text' name='address'></td><br>
        </tr>
        <tr>
            <br>
            <td colspan='2'><input name="submit" type="submit" value="Сохранить" /></td>
        </tr>
    </table>
</form>
</body>
</html>
