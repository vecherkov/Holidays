<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
</head>
<body>
<form method="POST" action="${pageContext.request.contextPath}/holidays">
<div>
    <label for="surveyStartDate">Survey Start Date:</label>
    <input type="date" name="startDate" value="">
</div>
<div>
    <label for="surveyEndDate">Survey End Date:</label>
    <input type="date" name="endDate" value="">
</div>

<div>
    <input type="submit" value= "Submit" />

    <label for="eventDate">Weekdays:</label>
    <p style="color: red;">${weekdays}</p>
</div>
</form>
</body>
</html>
