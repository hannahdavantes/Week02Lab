<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 13, 2019, 12:20:18 PM
    Author     : 652343
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <form action="arithmetic" method="POST">
            <h1> Arithmetic Calculator</h1>
            First Number: <input text="text" name="number1"> <br>
            Second Number: <input text="text" name="number2"> <br>
            <input type="submit" name="mathCalculator" value="+">
            <input type="submit" name="mathCalculator" value="-">
            <input type="submit" name="mathCalculator" value="*">
            <input type="submit" name="mathCalculator" value="/"> <br>
            Result: ${result}
        </form>
        
        <a href="/calculateAge">Age Calculator</a>
    </body>
</html>
