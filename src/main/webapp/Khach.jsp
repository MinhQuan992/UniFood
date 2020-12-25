<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.mvc.entities.*"%>
<%@ page import="org.hibernate.Session" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.List" %>


<html>
<head>
    <meta charset="utf-8" />
    <title>UNIFOOD</title>
    <meta name="description" content="Quan Com Online Unifood" />
    <meta name="author" content="NhomHQNT">

    <script src="js/jquery-1.11.1.min.js"></script>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
            integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
            crossorigin="anonymous"></script>
    <script
            src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
            integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
            crossorigin="anonymous"></script>
    <script
            src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
            integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
            crossorigin="anonymous"></script>
    <link type="text/css" rel="stylesheet" href="/css/khachpage.css" />
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>

<div id="container">
    <nav style="background-color: #60150c;" class="navbar navbar-expand-sm">
        <a href="#"><img class="logo" src="Images/LOGO.png" style="width: auto; height: 50px;"></a>
        <a class="homelogo" href="index.jsp"><img src="Images/homepage_icon.png" style="width: auto; height: 50px;"></a>
        <ul class="navbar-nav">
            <li class="nav-item active"><a class="nav-link" href="index.jsp">HOME</a></li>
            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/MainPage?">PRODUCTS</a></li>
            <li class="nav-item"><a class="nav-link" href="${pageContext.request.contextPath}/contact.jsp">CONTACTS</a></li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <a href="${pageContext.request.contextPath}/Cart?"><img class="cart" src="Images/gio.png" style="width: auto; height: 50px;"></a>
            <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown"> YOUR INFORMATION </a>
                <div class="dropdown-menu">
                    <a class="dropdown-item dropdown-item-custom" href="${pageContext.request.contextPath}/EditInfo">My Profile</a>
                    <a class="dropdown-item dropdown-item-custom" href="${pageContext.request.contextPath}/signout">Sign Out</a>
                </div></li>
        </ul>
    </nav>

    <div class="slider-container">
        <div class="menu">
            <label for="slide-dot-1"></label> <label for="slide-dot-2"></label>
            <label for="slide-dot-3"></label>
        </div>

        <input id="slide-dot-1" type="radio" name="slides" checked>
        <div class="slide slide-1"></div>

        <input id="slide-dot-2" type="radio" name="slides">
        <div class="slide slide-2"></div>

        <input id="slide-dot-3" type="radio" name="slides">
        <div class="slide slide-3"></div>
    </div>

    <h1 style="text-align: center; color: #60150c;"><b>ABOUT US</b></h1>
    <div class="row">
        <div id="box1" class="col">
            <h2><b>General</b></h2>
            <img src="Images/gate.jpg" alt="CSS" />
            <p>We are pleased to serve you with the best quality. Our
                retaurant is experienced in food industry, expecially COM TAM. We
                hope you will have good experience in our retaurant.</p>
        </div>
        <div id="box2" class="col">
            <h2><b>Facilities</b></h2>
            <img src="Images/kit.jpg" alt="URL" />
            <p>With the highest quality facilities, we commit serving you
                well. All the dishes are made from the fresh ingredients, which is
                classified carefully from the famous farms. High technology will
                make you comfortable. Thank you for choosing us.</p>
        </div>
        <div id="box3" class="col">
            <h2><b>Staffs</b></h2>
            <img src="Images/staff.jpg" alt="HTML" />
            <p>The team is appreciated to be with you in all meals.
                Throughout the best training, we know that our attitude will decide
                your attitude. So we always try our best to understand what you
                need, from now on, we continue changing everything to be suitable.</p>
        </div>
    </div>

    <div id="footer">
        <p style="text-align: center">
            <b> NhomHQNT 2020 - Quan Com Online Unifood </b>
        </p>
    </div>
</div>


</body>
</html>
