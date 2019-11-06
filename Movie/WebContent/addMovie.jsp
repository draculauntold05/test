<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form method="post" action="http://localhost:9090/movie1/AddMovieController">
Enter your ID: <input type="number" name="id" width="100px">
<br><br>

Enter Movie name: <input type="text" name="name" width="100px">
<br><br>

Enter Actor name: <input type="text" name="actor" width="100px">
<br><br>


Enter Actress name: <input type="text" name="actress" width="100px">
<br><br>

Enter Director name: <input type="text" name="director" width="100px">
<br><br>

Enter Collection: <input type="number" name="collection" width="100px">
<br><br>


Enter date of release: <input type="date" name="date_of_release" width="100px">
<br><br>

<input type="submit" value ="Add Movie" width="100px">
<br><br>
</form>
</center>





</body>
</html>