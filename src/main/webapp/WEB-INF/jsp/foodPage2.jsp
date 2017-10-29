<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
	<title>Food Page</title>
</head>

<body>
	<h1>Favorite Things Exercise</h1>
	
	<c:url var="foodPage" value="/foodPage2"/>
	<form action = "${foodPage}" method = "POST">
		<label for = "food">What is your favorite food?</label>
		<input type = "text" name="food" id = "food"/>
		
		<input type = "submit" value = "next >>>"/>
	</form>
</body>

</html>