<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accident</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
    <div id="container" class="container pt-3">
        <div  class="card" class="row">
            <div  style="width: 100%">
                <div class="card-header bg-danger text-white">
                Таблица Accident:
                </div>
                <div class="card-body">
                    <table class="table" id="table1">
                        <thead>
                            <tr>
                                <th>ФИО</th>
                            </tr>
                        </thead>
                             <tbody>
                                    <c:forEach items="${users}" var="user">
                                    <tr>
                                    <td>
                                    <c:out value="${user}"/>
                                    </td>
                                    </tr>
                                    </c:forEach>
                             </tbody>
                    </table>   
                </div>
            </div> 
        </div>
    </div>  
    </table>
</body>
</html>