<!DOCType html>
<html>
<head>
    <title> Hello World - Input Form</title>
</head>

<body>
    <form action="processFormRQ" method="GET">
        <input type="text" name="studentName" placeholder = "What's your name?"/>
        <input type="submit"/>
    </form>
    <!-- once this form created it will make new RQ named http://localhost:1010/SpringMVCWebApp/showFormRQ and student name willb e a parameter -->
</body>
</html>