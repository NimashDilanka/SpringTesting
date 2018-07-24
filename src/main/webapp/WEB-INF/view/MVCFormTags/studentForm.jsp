<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title> Student Registration form </title>

</head>
<body>
<form:form action="../MVCForm/processMVCForm" modelAttribute = "student"> <!--going to fill new Student() in model-->
    First Name: <form:input path="firstName"/> <!-- this maps to firstName of new Student()-->
    <br><br>
    Last Name: <form:input path="lastName"/> <!-- this maps to lastName of new Student()-->
    <br><br>

    <form:select path="country">
        <form:options items="${student.countryOptions}"/>
    </form:select>
    <br><br>

    <input type="submit" value="Submit"/>
</form:form>
</body>

</html>

<!-- make note that based on path attributes spring MVC will call setFirstName/getFirstName and setLastName/getLastName.-->
<!-- be aware the are matched-->
