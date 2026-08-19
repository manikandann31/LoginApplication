<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Update Profile</title>

<style>

    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
    }

    body {
        min-height: 100vh;
        background: #f2f4f7;
        display: flex;
        justify-content: center;
        align-items: center;
    }

    .update-container {
        width: 430px;
        background: white;
        padding: 35px;
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
    }

    h2 {
        text-align: center;
        margin-bottom: 25px;
        color: #333;
    }

    label {
        display: block;
        margin-bottom: 7px;
        color: #555;
        font-weight: bold;
    }

    input {
        width: 100%;
        padding: 12px;
        margin-bottom: 18px;
        border: 1px solid #ccc;
        border-radius: 6px;
        font-size: 15px;
    }

    input:focus {
        outline: none;
        border-color: #007bff;
    }

    button {
        width: 100%;
        padding: 12px;
        border: none;
        border-radius: 7px;
        background: #28a745;
        color: white;
        font-size: 16px;
        font-weight: bold;
        cursor: pointer;
    }

    button:hover {
        background: #218838;
    }

    .back {
        display: block;
        text-align: center;
        margin-top: 18px;
        text-decoration: none;
        color: #007bff;
    }

</style>

</head>

<body>

<div class="update-container">

    <h2>Update Profile</h2>

    <form action="update" method="post">

        <label>Email</label>
        <input type="email"
               name="email"
               required>

        <label>Phone</label>
        <input type="text"
               name="phone"
               required>

        <label>New Password</label>
        <input type="password"
               name="password"
               required>

        <button type="submit">
            Update Profile
        </button>

    </form>

    <a href="profile" class="back">
        Back to Profile
    </a>

</div>

</body>
</html>