<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
    <head>
        <title> Person Register </title>

        <!--defining CSS style-->
        <style>
            .error {color:red}
        </style>

    </head>

    <body>
    <form:form action="../MVCValidator/processPerson" modelAttribute = "person">

        Person Name: <form:input path="name"/>
        <form:errors path="name" cssClass="error"/> <!--says to display error massages if any occured upon name attribute-->
        <!-- make not that we referenced a CSS class-->
        <br><br>

        Age: <form:input path="age"/>
        <form:errors path="age" cssClass="error"/>
        <br><br>

        <input type="submit" value="Submit"/>

    </form:form>
    </body>

</html>

