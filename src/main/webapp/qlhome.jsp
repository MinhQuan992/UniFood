<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
    <meta charset="utf-8" />
    <title>MANAGER</title>
    <meta name="description" content="Quan Com Online Unifood" />
    <meta name="author" content="NhomHQNT">
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
    <link type="text/css" rel="stylesheet" href="css/qlpage.css" />
    <link rel="stylesheet"
          href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
          crossorigin="anonymous">
</head>
<body>

<div id="container">
    <nav style="background-color: #60150c;" class="navbar navbar-expand-sm">
        <a href="#"><img class="logo" src="Images/LOGO.png" style="width: auto; height: 50px;"></a>
        <a class="homelogo" href="index.jsp"><img src="Images/homepage_icon.png" style="width: auto; height: 50px;"></a>
        <ul class="navbar-nav">
            <li class="nav-item active"><a class="nav-link" href="${pageContext.request.contextPath}/MainPage?">HOME</a></li>
            <li class="nav-item"><a class="nav-link" href="staffs.jsp">STAFFS</a></li>
        </ul>
        <ul class="navbar-nav ml-auto">
            <li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">MANAGER</a>
                <div class="dropdown-menu">
                    <a class="dropdown-item dropdown-item-custom" href="${pageContext.request.contextPath}/ManageWarehouse">My Profile</a>
                    <a class="dropdown-item dropdown-item-custom" href="${pageContext.request.contextPath}/signout">Sign Out</a>
                </div></li>
        </ul>
    </nav>

    <form id="editPro" method="post" action="${pageContext.request.contextPath}/getPro">
        <input type="submit" style="color: #60150c" value="Chỉnh sửa sản phẩm">
    </form>

    <form id="addPro" method="post" action="${pageContext.request.contextPath}/addPro.jsp">
        <input type="submit" style="color: #60150c" value="Thêm sản phẩm">
    </form>

    <form method="get" action="${pageContext.request.contextPath}/signup.jsp">
        <input type="submit" value="Thêm quản lý">
    </form>

    <div class="contain">
        <h3 style="text-align: center;">SẢN PHẨM NỔI BẬT</h3>
        <div class="well well-sm text-right">
            <div id="product" class="row list-group">
                <div class="comgroup">
                    <c:forEach items="${requestScope.ListItems}" var="list">
                        <div class="container">
                            <h2 class="caption" style="text-align: center;">${list.listItemName}</h2>
                            <c:forEach items="${list.itemList}" var="item">
                                <div class="item col-xs-3 col-lg-3">
                                    <div class="thumnail"><img class="group list-group image" src="${pageContext.request.contextPath}${item.anhMinhHoa}" style="width: 300px; height: 200px;">
                                        <div class="caption">
                                            <h4 class="group inner list-group-item-heading" style="text-align: center"><strong>${item.tenSanPham}</strong></h4>
                                            <div class="row">
                                                <div class="col-xs-12 col-md-6">
                                                    <p class="lead"><strong>${item.donGia}</strong></p>
                                                </div><br>
                                                <div class="col-xs-12 col-md-6"><a class="btn btn-success" href="${pageContext.request.contextPath}/Product?ItemCode=${item.maSanPham}">Chi tiết</a> </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
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