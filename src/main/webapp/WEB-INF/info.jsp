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
<h1>${ dojoInfo.getDojo() } Ninjas</h1>
<div style="width: 60%; border-radius: 10px;">
    <table class="table table-bordered table-dark">
        <thead>
            
            <tr>
                <td>First Name</td>
                <td>Last Name</td>
                <td>Age</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${ dojoInfo.getNinjas() }" var="ninja">
                    <tr>
                        <td>${ ninja.getFirstname() }</td> 
                        <td>${ ninja.getLastname() }</td>
                        <td>${ ninja.getAge() }</td>
                    </tr>
                </c:forEach>
        </tbody>
    </table>
</div>

<h4><a href="/">Go back</a></h4>
</body>
</html>