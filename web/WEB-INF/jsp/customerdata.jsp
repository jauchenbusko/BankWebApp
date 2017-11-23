<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Hello Page</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container">
            <h1> Customer </h1>
            <p>   <table class="tg">
            <tr>
                <th width="30">ID</th>
                <th width="50">Name</th>
                <th width="50">Surname</th>
                <th width="100">e-mail</th>
                <th width="120">phone number</th>
                <th width="100">passpordID</th>
                <th width="80">password</th>
                <th width="180">address ID</th>
            </tr>
            <tr>
                <td>${customer.id}</td>
                <td>${customer.name}</td>
                <td>${customer.surname}</td>
                <td>${customer.email}</td>
                <td>${customer.phoneNumber}</td>
                <td>${customer.passportID}</td>
                <td>${customer.password}</td>
                <td>${customer.addressesId}</td>
            </tr>
        </table></p>
        </div>
    </div>
</section>
</body>
</html>
