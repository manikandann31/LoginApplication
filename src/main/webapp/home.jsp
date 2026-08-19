<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>User Home</title>

<style>

    * {
        box-sizing: border-box;
        margin: 0;
        padding: 0;
        font-family: Arial, sans-serif;
    }

    body {
        min-height: 100vh;
        background: #7da5e0;
    }

    /* Navigation Bar */

    .navbar {
        height: 70px;
        background: #007bff;
        color: white;

        display: flex;
        align-items: center;
        justify-content: space-between;

        padding: 0 50px;

        box-shadow: 0 3px 10px rgba(0, 0, 0, 0.15);
    }

    .navbar h2 {
        margin: 0;
        color: white;
    }

    .logout {
        text-decoration: none;
        color: white;
        background: #dc3545;

        padding: 10px 18px;

        border-radius: 6px;

        font-weight: bold;
    }

    .logout:hover {
        background: #b02a37;
    }


    /* Main Container */

    .container {
        width: 90%;
        max-width: 1000px;

        margin: 50px auto;
    }


    /* Welcome Section */

    .welcome {
        background: white;

        padding: 35px;

        border-radius: 12px;

        box-shadow: 0 5px 20px rgba(0, 0, 0, 0.10);

        margin-bottom: 30px;
    }

    .welcome h1 {
        color: #333;
        margin-bottom: 10px;
    }

    .welcome p {
        color: #666;
        font-size: 16px;
    }


    /* Service Cards */

    .services {
        display: grid;

        grid-template-columns: repeat(3, 1fr);

        gap: 25px;
    }

    .card {
        background: white;

        padding: 30px;

        border-radius: 12px;

        text-align: center;

        box-shadow: 0 5px 20px rgba(0, 0, 0, 0.10);

        transition: transform 0.2s;
    }

    .card:hover {
        transform: translateY(-5px);
    }

    .card h3 {
        color: #333;

        margin-bottom: 10px;
    }

    .card p {
        color: #777;

        margin-bottom: 20px;
    }

    .card button {
        border: none;

        padding: 10px 18px;

        border-radius: 6px;

        background: #007bff;

        color: white;

        font-size: 14px;

        cursor: pointer;
    }

    .card button:hover {
        background: #0056b3;
    }
    .service-button {
            text-decoration: none;
            color: white;
            background: #3f20ef;

            padding: 10px 18px;

            border-radius: 6px;

            font-weight: bold;
        }

        .service-button:hover {
            background: #2b02be;
        }


    /* Responsive Design */

    @media (max-width: 700px) {

        .services {
            grid-template-columns: 1fr;
        }

        .navbar {
            padding: 0 20px;
        }

        .container {
            width: 95%;
        }
    }

</style>

</head>


<body>

<!-- Navigation Bar -->

<div class="navbar">

    <h2>User Dashboard</h2>

    <a href="logout" class="logout">Logout</a>

</div>


<!-- Main Content -->

<div class="container">

    <div class="welcome">

        <h1>
            Welcome ${sessionScope.username}!
        </h1>

        <p>
            Welcome to your account dashboard.
            You can manage your account using the services below.
        </p>

    </div>


    <!-- User Services -->

    <div class="services">

        <div class="card">

            <h3>View Profile</h3>

            <p>
                View your account information.
            </p>

            <a href="profile" class="service-button">profile</a>
            
        </div>


        <div class="card">

            <h3>Update Account</h3>

            <p>
                Update your password, email or phone number.
            </p>

            <a href="update" class="service-button">Update</a>

        </div>


        <div class="card">

            <h3>Delete Account</h3>

            <p>
                Permanently delete your account.
            </p>

            <a href="delete" class="service-button">Delete</a>

        </div>

    </div>

</div>

</body>

</html>