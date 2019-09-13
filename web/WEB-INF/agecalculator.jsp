<%-- 
    Document   : agecalculator
    Created on : Sep 12, 2019, 4:32:53 PM
    Author     : 652343
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="calculateAge" method="POST">
            Please enter your age: <input type="text" name="inputAge">
            <input type="submit" value="Calculate">
            <h3> ${newAgeMessage} </h3>
            <h3> ${errorMessage} </h3>
        </form>
    </body>
</html>
