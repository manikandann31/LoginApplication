<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Profile</title>

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

    .profile-container {
        width: 450px;
        background: white;
        padding: 35px;
        border-radius: 15px;
        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
    }

    .profile-header {
        text-align: center;
        margin-bottom: 30px;
    }

    .profile-icon {
        width: 80px;
        height: 80px;
        margin: 0 auto 15px;
        border-radius: 50%;
        background: #007bff;
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
        font-size: 32px;
        font-weight: bold;
    }

    .profile-header h1 {
        color: #333;
        font-size: 26px;
        margin-bottom: 8px;
    }

    .profile-header p {
        color: #777;
        font-size: 14px;
    }

    .profile-info {
        margin-top: 20px;
    }

    .info-row {
        display: flex;
        justify-content: space-between;
        align-items: center;
        padding: 15px 5px;
        border-bottom: 1px solid #eee;
    }

    .info-label {
        color: #666;
        font-weight: bold;
    }

    .info-value {
        color: #333;
    }

    .actions {
        display: flex;
        gap: 12px;
        margin-top: 30px;
    }

    .btn {
        flex: 1;
        padding: 12px;
        text-align: center;
        text-decoration: none;
        border-radius: 7px;
        font-weight: bold;
        transition: 0.2s;
    }

    .back-btn {
        background: #007bff;
        color: white;
    }

    .update-btn {
        background: #28a745;
        color: white;
    }

    .btn:hover {
        opacity: 0.85;
    }

</style>

</head>

<body>

    <div class="profile-container">

        <div class="profile-header">

            <div class="profile-icon">
                ${sessionScope.username.substring(0,1).toUpperCase()}
            </div>

            <h1>${sessionScope.username}</h1>

            <p>Your account information</p>

        </div>


        <div class="profile-info">

            <div class="info-row">
                <span class="info-label">Username</span>
                <span class="info-value">
                    ${sessionScope.username}
                </span>
            </div>

            <div class="info-row">
                <span class="info-label">Email</span>
                <span class="info-value">
                    ${requestScope.email}
                </span>
            </div>

            <div class="info-row">
                <span class="info-label">Phone</span>
                <span class="info-value">
                    ${requestScope.phone}
                </span>
            </div>

        </div>


        <div class="actions">

            <a href="home.jsp" class="btn back-btn">
                Back to Home
            </a>

            <a href="update" class="btn update-btn">
                Edit Profile
            </a>

        </div>

    </div>

</body>
</html>