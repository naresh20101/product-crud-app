<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-3">
   <div class="row">
     <div class="col-md-6 offset-md-3">
     <h1 class="text-center mb-3">Fill the Product Detail</h1>
     <form action="handle-product" method="post">
            <div class="form-group">
               <label for="name" class="form-label"> Product Name</label>
               <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name"
               placeholder="Enter your Product Name">
   
            </div>
            <div class="form-group">
               <label for="name" class="form-label"> Product Description</label>
               <textarea type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="description"
                row="5" placeholder="Enter your Product Description"></textarea>
   
            </div>
            <div class="form-group">
               <label for="name" class="form-label"> Product Price</label>
               <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="price"
               placeholder="Enter your Product Price">
   
            </div>
            <div class="container text-center">
                   <a href="" class="btn btn-danger"> Back </a>

             <button type="submit" class="btn btn-success">Add</button>
              </div>
         </form>
     </div>
     </div>
     </div>
</body>
</html>