<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <title>Hello, world!</title>
  </head>
  <body>
  <div class="container mt-5">
  <h3 class="text-center">${head}</h3>
  <p>${desc}</p>
  <form action="processform" method="post">

  <div class="form-group">
    <label for="exampleInputEmail1">Email address</label>
    <input type="email" name="email"class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
    </div>
    
    <div class="form-group">
    <label for="userName">User Name</label>
    <input type="text" class="form-control" name="userName" id="userName" aria-describedby="emailHelp" placeholder="Enter here">
    </div>
    
    <div class="form-group">
    <label for="userPassword">User Password</label>
    <input type="password"  name="userPassword" class="form-control" id="userPassword" aria-describedby="emailHelp" placeholder="Enter here">
    </div>
    
     <div class="container text-center">
    <button type="submit" class="btn btn-success">SignUp</button>
    </div>
  </form>
  </div>
  </body>
</html>