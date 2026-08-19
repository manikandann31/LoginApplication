<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Application</title>

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
        background: linear-gradient(135deg, #eef2f7, #dbe7f5);
    }

    .container {
        width: 450px;
        padding: 45px 40px;
        background: white;
        border-radius: 16px;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.15);
        text-align: center;
    }

    .container h1 {
        color: #222;
        margin-bottom: 12px;
        font-size: 30px;
    }

    .container p {
        color: #666;
        margin-bottom: 35px;
        font-size: 16px;
        line-height: 1.5;
    }

    .button-container {
        display: flex;
        flex-direction: column;
        gap: 15px;
    }

    .button-container form {
        width: 100%;
    }

    button {
        width: 100%;
        padding: 13px;
        border: none;
        border-radius: 8px;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
        transition: 0.3s;
    }

    .signup-btn {
        background: #007bff;
        color: white;
    }

    .signup-btn:hover {
        background: #0056b3;
    }

    .login-btn {
        background: #f1f3f5;
        color: #333;
        border: 1px solid #ccc;
    }

    .login-btn:hover {
        background: #e2e6ea;
    }

    .footer {
        margin-top: 30px;
        font-size: 13px;
        color: #999;
    }

</style>

</head>

<body>

    <div class="container">

        <h1>Welcome to Login Application</h1>

        <p>
            Manage your account securely and access your personal dashboard.
        </p>

        <div class="button-container">

            <!-- New User -->
            <form action="signUp.jsp" method="get">
                <button type="submit" class="signup-btn">
                    Create New Account
                </button>
            </form>

            <!-- Existing User -->
            <form action="login.jsp" method="get">
                <button type="submit" class="login-btn">
                    Login to Your Account
                </button>
            </form>

        </div>

        <div class="footer">
            User Management System
        </div>

    </div>

</body>
</html>