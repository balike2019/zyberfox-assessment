<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Registration Form</title>
</head>
<body>

<div align="center"></div>
<h1>Student Registration Form</h1>

<form action="register" method="Post">

 <label for ="firstname">FirstName</label>
 <input type="text" id="firstname" name="firstName"><br><br>
 <label for="lastname">LastName</label>
 <input type="text" id="lastname" name="lastName"><br><br>
 <label for="email">Email</label>
 <input type="email" id="email" name="email"><br><br>
 <label for="phoneNumber">PhoneNumber</label>
 <input type="number" id="PhoneNumber" name="phoneNumber"><br><br>
<label for="DateOfBirth">DateOfBirth</label>
 <input type="date" id="date" name="dateOfBirth"><br><br>


   <label for="course">Select a Course *:</label>
  <select name="course" id="course">
    <option value="Java">Java</option>
    <option value="Python">Python</option>
    <option value="PHP">PHP</option>
    <option value="Javascript">Javascript</option>
  </select>
  <br><br>
<p>Marital Status</p>

<input type="radio" name="maritalStatus" value="Married"> Married<br>
<input type="radio" name="maritalStatus" value="Single"> Single<br>
<input type="radio" name="maritalStatus" value="Divorce"> divorce
 <br><br>
  <input type="submit" value="Register">

</form>
</body>
</html>