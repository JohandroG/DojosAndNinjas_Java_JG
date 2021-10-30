<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<main>
    <div style="width: 30%; margin-left: 10%; margin-top: 20px;">
        <a href="/ninja">Go and create a Ninja</a>
        <h1>New Dojo</h1>
        <form class="m-3" method="POST" action="/new/dojo">
            <label>Name</label>
            <input type="text" name="dojo" id="dojo">
            <button type="submit">Create</button>
        </form>
    </div>
    
    
    <div style="width: 30%; margin-left: 10%;">
        <ul class="list-group">
            <li class="list-group-item active">List of dojos created</li>
        <c:forEach var = "dojo" items = "${dojoList2}">
                <a href="info/dojo/${dojo.getDojo_id()}">
                    <li class="list-group-item"><c:out value = "${dojo.getDojo()}" > </c:out></li>
                </a>
        </c:forEach>
        </ul>
    </div>
</main>
</body>
</html>