<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>SignUp Page</title>

    <style>

        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: Arial, sans-serif;
        }

        body {
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background: #f2f4f7;
        }

        form {
            width: 400px;
            padding: 30px;
            background: white;
            border-radius: 12px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.15);
        }

        form h2 {
            text-align: center;
            margin-bottom: 25px;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 7px;
            color: #333;
            font-weight: bold;
        }

        input {
            width: 100%;
            padding: 12px;
            margin-bottom: 18px;
            border: 1px solid #ccc;
            border-radius: 6px;
            font-size: 15px;
            outline: none;
        }

        input:focus {
            border-color: #007bff;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.3);
        }

        button {
            width: 100%;
            padding: 12px;
            border: none;
            border-radius: 6px;
            background: #007bff;
            color: white;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
        }

        button:hover {
            background: #0056b3;
        }

    </style>
</head>

<body>

    <form action="signup" method="post">

        <h2>Sign Up</h2>

        <label for="username">username:</label>
        <input type="text" id="username" name="username" required>

        <label for="password">password:</label>
        <input type="password" id="password" name="password" required>

        <label for="email">email:</label>
        <input type="email" id="email" name="email" required>

        <label for="phone">phone:</label>
        <input type="tel" id="phone" name="phone" required>

        <button type="submit">Sign Up</button>
    </form>
    
    <%
		String message = (String) request.getAttribute("message");

		if (message != null) {
	%>

    		<p><%= message %></p>

	<%
		}
	%>	

</body>
</html>

