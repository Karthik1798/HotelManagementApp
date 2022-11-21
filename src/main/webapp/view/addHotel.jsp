<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Group-Green/Add Hotel Details</title>
<link href="/styles/login.css" rel="stylesheet" >
</head>
<body>
<body id="LoginForm">
<div class="container">
<div class="login-form">
<div class="main-div">
    <div class="panel">
   <h2>Add New Hotel</h2>
   <p>Please enter hotel details</p>
   </div>
    <form id="Login" method="post" >
		<h3>${error}</h3>
		<h3>${erroradd}</h3>
        
        <div class="form-group"> 
            <input type="text" class="form-control" name="hotelname" placeholder="Hotel name" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="rooms" placeholder="No.of Rooms" required>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" name="rating" placeholder="Rating(3star, 4star,5star)" required>
        </div>  
         <div class="form-group">
            <input type="text" class="form-control" name="price" placeholder="Amount" required>
        </div>       
        
        <button type="submit" >Add New Hotel</button>
		<div class="forgot">
        <a href="addNewHotel"><center>Back</center></a>
    </form>
    </div>

</div></div></div>


</body>
</html>