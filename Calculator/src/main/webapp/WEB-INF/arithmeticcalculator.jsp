

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="arithmetic" method="post">
            <label for="first">First:</label>
            <input type="string" name="first" id="first"> <br>
            <label for="second">Second:</label>
            <input type="string" name="second" id="second"> <br>
            <button type="submit" name="add">+</button>
            <button type="submit" name="subtract">-</button>
            <button type="submit" name="multiply">*</button>
            <button type="submit" name="divide">%</button>
        </form>
        <p>Result:${message}</p> 
        <a href="http://localhost:8080/Calculator/age">Age Calculator</a>
    </body>
</html>
