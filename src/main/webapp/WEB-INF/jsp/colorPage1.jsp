<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
	<title>Color Page</title>
</head>

<body>
	<h1>Favorite Things Exercise</h1>
	
	<c:url var="colorPage" value="/colorPage1"/>
	<form action = "${colorPage}" method = "POST">
		<label for = "color">What is your favorite color?</label>
		<input type = "text" name="color" id = "color"/>
		
		<input type = "submit" value = "next >>>"/>
	</form>
</body>

</html>