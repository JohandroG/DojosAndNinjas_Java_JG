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
<main style="border: 2px solid black; border-radius: 10px; margin: 10px; padding: 15px; width: 70%;">
    <div style="margin: 0; width: 30%; margin-left: 10%; margin-top: 10px;">
        <a href="/dojo">Go and create a Dojo</a>
        <h1 >New Ninja</h1>
    </div>

    <form style="width: 30%; margin-left: 10%; margin-top: 20px;" method="POST" action="/new/ninja">
        <div style= "margin: 0; margin-top:10px;">
            <label style= "margin-right:5px;" for="dojos">Dojo:</label>
            
            <select name="dojo_id">
                <c:forEach var = "dojo" items = "${dojoList}">
                    <option value="${dojo.getDojo_id()}"><c:out value = "${dojo.getDojo()}" > </c:out></option>
                </c:forEach>
            </select>
        </div>

        <div style= "margin: 0; margin-top:20px;">
            <label style= "margin-right:5px;" for="firstname">First Name:</label>
            <input type="text" name="firstname">
        </div>
        
        <div style= "margin: 0; margin-top:20px;">
            <label style= "margin: 0; margin-right:5px;" for="lastname">Last Name:</label>
            <input type="text" name="lastname">
        </div>
        
        <div style= "margin: 0; margin-top:20px;">
            <label style= "margin-right:5px;" for="age">Age:</label>
            <input type="text" name="age">
        </div>

        <button style= "margin: 0; margin-top:10px;" type="submit">Create</button>

    </form>
</main>
</body>
</html>